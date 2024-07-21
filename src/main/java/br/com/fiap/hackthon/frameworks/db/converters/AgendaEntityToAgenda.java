package br.com.fiap.hackthon.frameworks.db.converters;

import br.com.fiap.hackthon.domain.entities.Agenda;
import br.com.fiap.hackthon.frameworks.db.entities.AgendaEntity;
import org.springframework.stereotype.Component;

@Component
public class AgendaEntityToAgenda {

    public Agenda convert(final AgendaEntity agendaEntity) {
        return Agenda
                .builder()
                .id(agendaEntity.getId().toString())
                .inicio(agendaEntity.getInicio())
                .fim(agendaEntity.getFim())
                .build();
    }
}
