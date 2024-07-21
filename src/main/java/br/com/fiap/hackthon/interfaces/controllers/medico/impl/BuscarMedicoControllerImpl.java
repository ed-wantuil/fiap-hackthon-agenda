package br.com.fiap.hackthon.interfaces.controllers.medico.impl;

import java.util.List;

import br.com.fiap.hackthon.application.usecases.medico.BuscarMedico;
import br.com.fiap.hackthon.interfaces.controllers.medico.BuscarMedicoController;
import br.com.fiap.hackthon.interfaces.controllers.medico.converters.MedicoToMedicoResponse;
import br.com.fiap.hackthon.interfaces.controllers.medico.responses.MedicoResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
public class BuscarMedicoControllerImpl implements BuscarMedicoController {

    private final BuscarMedico buscarMedico;

    private final MedicoToMedicoResponse medicoToMedicoResponse;

    public List<MedicoResponse> buscar() {

        final var medicoList = buscarMedico.buscar();

        return medicoList.stream()
                .map(medicoToMedicoResponse::convert)
                .toList();
    }
}
