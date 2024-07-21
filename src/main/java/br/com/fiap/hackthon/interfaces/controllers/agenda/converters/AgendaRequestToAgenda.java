package br.com.fiap.hackthon.interfaces.controllers.agenda.converters;

import br.com.fiap.hackthon.domain.entities.Agenda;
import br.com.fiap.hackthon.domain.entities.Medico;
import br.com.fiap.hackthon.interfaces.controllers.agenda.requests.AgendaRequest;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AgendaRequestToAgenda {

    public Agenda convert(final AgendaRequest agendaRequest) {
        return Agenda
                .builder()
                .id(agendaRequest.id())
                .medico(Medico.builder()
                        .id(agendaRequest.id())
                        .build())
                .inicio(agendaRequest.inicio())
                .fim(agendaRequest.fim())
                .build();
    }
}
