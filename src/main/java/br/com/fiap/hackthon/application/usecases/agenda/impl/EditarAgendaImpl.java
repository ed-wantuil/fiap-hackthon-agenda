package br.com.fiap.hackthon.application.usecases.agenda.impl;

import br.com.fiap.hackthon.application.gateways.AgendaGateway;
import br.com.fiap.hackthon.application.usecases.agenda.EditarAgenda;
import br.com.fiap.hackthon.domain.entities.Agenda;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EditarAgendaImpl implements EditarAgenda {
    private final AgendaGateway agendaGateway;

    @Override
    public Agenda editar(final String id, final Agenda agenda) {
        return agendaGateway.editar(id, agenda);
    }
}
