package br.com.fiap.hackthon.interfaces.controllers.agenda;

import br.com.fiap.hackthon.interfaces.controllers.agenda.responses.AgendaResponse;
import br.com.fiap.hackthon.interfaces.controllers.agenda.requests.AgendaRequest;

public interface EditarAgendaController {

    AgendaResponse editar(String id, AgendaRequest agendaRequest);
}
