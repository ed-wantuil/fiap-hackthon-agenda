package br.com.fiap.hackthon.interfaces.controllers.agenda.converters;

import static java.util.Objects.isNull;

import br.com.fiap.hackthon.domain.entities.Agenda;
import br.com.fiap.hackthon.interfaces.controllers.agenda.responses.AgendaResponse;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AgendaToAgendaResponse {

    public AgendaResponse convert(final Agenda agenda) {
        return AgendaResponse
                .builder()
                .id(agenda.getId())
                .inicio(agenda.getInicio())
                .fim(agenda.getFim())
                .build();
    }
}
