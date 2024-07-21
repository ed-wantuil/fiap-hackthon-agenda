package br.com.fiap.hackthon.application.usecases.medico.impl;

import java.util.List;

import br.com.fiap.hackthon.application.gateways.MedicoGateway;
import br.com.fiap.hackthon.application.usecases.medico.BuscarMedico;
import br.com.fiap.hackthon.domain.entities.Medico;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BuscarMedicoImpl implements BuscarMedico {
    private final MedicoGateway medicoGateway;

    @Override
    public List<Medico> buscar() {
        return medicoGateway.buscar();
    }
}
