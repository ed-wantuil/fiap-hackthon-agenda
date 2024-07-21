package br.com.fiap.hackthon.application.usecases.medico;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import br.com.fiap.hackthon.application.gateways.MedicoGateway;
import br.com.fiap.hackthon.application.usecases.medico.impl.BuscarMedicoImpl;
import br.com.fiap.hackthon.domain.entities.Medico;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class BuscarMedicoImplTest {

    @Mock
    private MedicoGateway medicoGateway;

    @InjectMocks
    private BuscarMedicoImpl buscarMedico;

    @Test
    void buscar() {
        when(medicoGateway.buscar()).thenReturn(List.of(Medico.builder()
                .build()));

        List<Medico> medicos = buscarMedico.buscar();

        verify(medicoGateway, times(1)).buscar();
        assertEquals(List.of(Medico.builder().build()), medicos, "O pedido retornado deve ser o mesmo que o esperado.");
    }
}
