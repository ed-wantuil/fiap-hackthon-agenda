package br.com.fiap.hackthon.application.usecases.agenda.impl;

import br.com.fiap.hackthon.application.usecases.agenda.CriarAgenda;
import br.com.fiap.hackthon.application.gateways.AgendaGateway;
import br.com.fiap.hackthon.domain.entities.Agenda;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CriarAgendaImpl implements CriarAgenda {

    private final AgendaGateway agendaGateway;

    @Override
    public Agenda criar(final Agenda agenda) {
        return agendaGateway.criar(agenda);
    }

}
