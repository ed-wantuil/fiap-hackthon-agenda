package br.com.fiap.hackthon.frameworks.db.impl;

import java.util.UUID;

import br.com.fiap.hackthon.application.gateways.AgendaGateway;
import br.com.fiap.hackthon.domain.entities.Agenda;
import br.com.fiap.hackthon.frameworks.db.converters.AgendaEntityToAgenda;
import br.com.fiap.hackthon.frameworks.db.converters.AgendaToAgendaEntity;
import br.com.fiap.hackthon.frameworks.db.repositories.SpringDataAgendaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AgendaRepositoryImpl implements AgendaGateway {

    private final SpringDataAgendaRepository springDataAgendaRepository;

    private final AgendaToAgendaEntity agendaToAgendaEntity;

    private final AgendaEntityToAgenda agendaEntityToAgenda;

    @Override
    public Agenda criar(final Agenda agenda) {
        var agendaEntity = agendaToAgendaEntity.convert(agenda);
        agendaEntity = springDataAgendaRepository.save(agendaEntity);

        return agendaEntityToAgenda.convert(agendaEntity);
    }

    @Override
    public Agenda editar(final String id, final Agenda agenda) {
        var agendaEntity = springDataAgendaRepository
                .findById(UUID.fromString(id)).orElseThrow();

        agendaEntity.setInicio(agenda.getInicio());
        agendaEntity.setFim(agenda.getFim());

        agendaEntity = springDataAgendaRepository.save(agendaEntity);

        return agendaEntityToAgenda.convert(agendaEntity);
    }
}
