package br.com.fiap.hackthon.frameworks.db.converters;

import static java.util.Objects.isNull;

import java.util.UUID;

import br.com.fiap.hackthon.domain.entities.Agenda;
import br.com.fiap.hackthon.frameworks.db.entities.AgendaEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AgendaToAgendaEntity {

    private MedicoToMedicoEntity medicoToMedicoEntity;

    public AgendaEntity convert(final Agenda agenda) {
        return AgendaEntity
                .builder()
                .id(isNull(agenda.getId()) ? null : UUID.fromString(agenda.getId()))
                .medico(medicoToMedicoEntity.convert(agenda.getMedico()))
                .inicio(agenda.getInicio())
                .fim(agenda.getFim())
                .build();
    }
}
