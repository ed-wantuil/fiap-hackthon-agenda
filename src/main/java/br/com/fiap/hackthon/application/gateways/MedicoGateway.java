package br.com.fiap.hackthon.application.gateways;

import java.util.List;

import br.com.fiap.hackthon.domain.entities.Medico;


public interface MedicoGateway {
    List<Medico> buscar();
}
