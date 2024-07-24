package br.com.fiap.hackthon.frameworks.web.medico;

import java.util.List;

import br.com.fiap.hackthon.interfaces.controllers.medico.responses.MedicoResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface BuscarMedicoWeb {

    @Operation(summary = "Buscar medicos",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Lista de medicos retornada")
            })
    @GetMapping("/medicos")
    List<MedicoResponse> buscar();
}
