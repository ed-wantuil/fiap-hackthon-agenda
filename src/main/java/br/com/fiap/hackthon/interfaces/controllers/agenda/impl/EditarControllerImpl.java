package br.com.fiap.hackthon.interfaces.controllers.agenda.impl;

import br.com.fiap.hackthon.application.usecases.agenda.EditarAgenda;
import br.com.fiap.hackthon.interfaces.controllers.agenda.EditarAgendaController;
import br.com.fiap.hackthon.interfaces.controllers.agenda.converters.AgendaRequestToAgenda;
import br.com.fiap.hackthon.interfaces.controllers.agenda.converters.AgendaToAgendaResponse;
import br.com.fiap.hackthon.interfaces.controllers.agenda.requests.AgendaRequest;
import br.com.fiap.hackthon.interfaces.controllers.agenda.responses.AgendaResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
public class EditarControllerImpl implements EditarAgendaController {

    private final EditarAgenda editarAgenda;

    private final AgendaRequestToAgenda agendaRequestToAgenda;

    private final AgendaToAgendaResponse agendaToAgendaResponse;

    public AgendaResponse editar(final String id, final AgendaRequest agendaRequest) {

        var agenda = agendaRequestToAgenda.convert(agendaRequest);

        agenda = editarAgenda.editar(id, agenda);

        return agendaToAgendaResponse.convert(agenda);
    }
}
