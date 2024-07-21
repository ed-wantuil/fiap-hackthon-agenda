package br.com.fiap.hackthon.frameworks.db.converters;

import java.util.UUID;

import br.com.fiap.hackthon.domain.entities.Agenda;
import br.com.fiap.hackthon.frameworks.db.entities.AgendaEntity;
import org.springframework.stereotype.Component;

@Component
public class AgendaToAgendaEntity {

    public AgendaEntity convert(final Agenda agenda) {
        return AgendaEntity
                .builder()
                .id(UUID.fromString(agenda.getId()))
                .inicio(agenda.getInicio())
                .fim(agenda.getFim())
                .build();
    }
}
