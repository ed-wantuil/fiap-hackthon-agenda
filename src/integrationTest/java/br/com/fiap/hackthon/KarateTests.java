package br.com.fiap.hackthon;

import com.intuit.karate.junit5.Karate;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.testcontainers.containers.localstack.LocalStackContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;


@Tag("integrationTest")
@Testcontainers
@SpringBootTest(classes = {Application.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(locations = "classpath:application-testIntegration.yml")
@ActiveProfiles("testIntegration")
public class KarateTests {

    @LocalServerPort
    private int localServerPort;

    @Container
    static LocalStackContainer localStackContainer = new LocalStackContainer(DockerImageName.parse("localstack/localstack:3.2.0"))
            .withServices(LocalStackContainer.Service.DYNAMODB);

    @BeforeAll
    public static void beforeAll() {

        final String endpoint = localStackContainer.getEndpointOverride(LocalStackContainer.Service.DYNAMODB).toString();
        System.setProperty("aws.dynamodb.endpoint", endpoint);

        final String region = localStackContainer.getRegion();
        System.setProperty("aws.region", region);

        final String accessKey = localStackContainer.getAccessKey();
        System.setProperty("aws.accessKey", accessKey);

        final String secretKey = localStackContainer.getSecretKey();
        System.setProperty("aws.secretKey", secretKey);
    }

    @Karate.Test
    Karate agendaTest() {
        return Karate.run("file:src/integrationTest/java/br/com/fiap/hackthon/feature/Agenda.feature")
                .systemProperty("karate.port", String.valueOf(localServerPort));
    }

    @Karate.Test
    Karate medicoTest() {
        return Karate.run("file:src/integrationTest/java/br/com/fiap/hackthon/feature/Medico.feature")
                .systemProperty("karate.port", String.valueOf(localServerPort));
    }

}
