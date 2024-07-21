package br.com.fiap.hackthon.frameworks.web.agenda.impl;

import br.com.fiap.hackthon.frameworks.web.agenda.CriarAgendaWeb;
import br.com.fiap.hackthon.interfaces.controllers.agenda.CriarAgendaController;
import br.com.fiap.hackthon.interfaces.controllers.agenda.requests.AgendaRequest;
import br.com.fiap.hackthon.interfaces.controllers.agenda.responses.AgendaResponse;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CriarAgendaWebImpl implements CriarAgendaWeb {

    private final CriarAgendaController criarAgendaController;

    public AgendaResponse criar(final AgendaRequest agendaRequest) {
        return criarAgendaController.criar(agendaRequest);
    }

}
