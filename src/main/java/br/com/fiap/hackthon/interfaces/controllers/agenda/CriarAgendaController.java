package br.com.fiap.hackthon.interfaces.controllers.agenda;

import br.com.fiap.hackthon.interfaces.controllers.agenda.requests.AgendaRequest;
import br.com.fiap.hackthon.interfaces.controllers.agenda.responses.AgendaResponse;

public interface CriarAgendaController {

    AgendaResponse criar(AgendaRequest agendaRequest);
}
