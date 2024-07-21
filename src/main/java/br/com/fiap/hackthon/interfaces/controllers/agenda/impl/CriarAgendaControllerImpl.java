package br.com.fiap.hackthon.interfaces.controllers.agenda.impl;

import br.com.fiap.hackthon.application.usecases.agenda.CriarAgenda;
import br.com.fiap.hackthon.interfaces.controllers.agenda.CriarAgendaController;
import br.com.fiap.hackthon.interfaces.controllers.agenda.converters.AgendaRequestToAgenda;
import br.com.fiap.hackthon.interfaces.controllers.agenda.converters.AgendaToAgendaResponse;
import br.com.fiap.hackthon.interfaces.controllers.agenda.requests.AgendaRequest;
import br.com.fiap.hackthon.interfaces.controllers.agenda.responses.AgendaResponse;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CriarAgendaControllerImpl implements CriarAgendaController {

    private final CriarAgenda criarAgenda;

    private final AgendaRequestToAgenda agendaRequestToAgenda;

    private final AgendaToAgendaResponse agendaToAgendaResponse;

    public AgendaResponse criar(AgendaRequest agendaRequest) {

        var agenda = agendaRequestToAgenda.convert(agendaRequest);

        agenda = criarAgenda.criar(agenda);

        return agendaToAgendaResponse.convert(agenda);
    }

}
