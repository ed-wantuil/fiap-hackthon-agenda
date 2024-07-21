package br.com.fiap.hackthon.frameworks.web.agenda;

import br.com.fiap.hackthon.interfaces.controllers.agenda.requests.AgendaRequest;
import br.com.fiap.hackthon.interfaces.controllers.agenda.responses.AgendaResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface EditarAgendaWeb {

    @Operation(summary = "Editar uma nova agenda",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Agenda editada")
            })
    @PutMapping("/agenda/{id}")
    AgendaResponse editar(@PathParam("id") String id, @RequestBody AgendaRequest agendaRequest);
}
