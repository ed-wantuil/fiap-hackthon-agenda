package br.com.fiap.hackthon.frameworks.web.agenda.impl;

import br.com.fiap.hackthon.frameworks.web.agenda.EditarAgendaWeb;
import br.com.fiap.hackthon.interfaces.controllers.agenda.EditarAgendaController;
import br.com.fiap.hackthon.interfaces.controllers.agenda.requests.AgendaRequest;
import br.com.fiap.hackthon.interfaces.controllers.agenda.responses.AgendaResponse;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EditarAgendaWebImpl implements EditarAgendaWeb {

    private final EditarAgendaController editarAgendaController;

    public AgendaResponse editar(final String id, final AgendaRequest agendaRequest) {
        return editarAgendaController.editar(id, agendaRequest);
    }
}
