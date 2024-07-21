package br.com.fiap.hackthon.frameworks.web.agenda;

import br.com.fiap.hackthon.interfaces.controllers.agenda.requests.AgendaRequest;
import br.com.fiap.hackthon.interfaces.controllers.agenda.responses.AgendaResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface CriarAgendaWeb {

    @Operation(summary = "Criar uma nova agenda",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Agenda criada")
            })
    @PostMapping("/agenda")
    AgendaResponse criar(@RequestBody AgendaRequest agendaRequest);

}
