package br.com.fiap.hackthon.frameworks.web.medico.impl;

import java.util.List;

import br.com.fiap.hackthon.frameworks.web.medico.BuscarMedicoWeb;
import br.com.fiap.hackthon.interfaces.controllers.medico.BuscarMedicoController;
import br.com.fiap.hackthon.interfaces.controllers.medico.responses.MedicoResponse;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BuscarMedicoWebImpl implements BuscarMedicoWeb {

    private final BuscarMedicoController buscarMedicoController;

    public List<MedicoResponse> buscar() {
        return buscarMedicoController.buscar();
    }
}
