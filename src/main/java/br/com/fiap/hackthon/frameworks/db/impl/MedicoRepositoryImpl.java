package br.com.fiap.hackthon.frameworks.db.impl;

import java.util.List;

import br.com.fiap.hackthon.application.gateways.MedicoGateway;
import br.com.fiap.hackthon.domain.entities.Medico;
import br.com.fiap.hackthon.frameworks.db.converters.MedicoEntityToMedico;
import br.com.fiap.hackthon.frameworks.db.repositories.SpringDataMedicoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MedicoRepositoryImpl implements MedicoGateway {

    private final SpringDataMedicoRepository springDataMedicoRepository;

    private final MedicoEntityToMedico medicoEntityToMedico;

    @Override
    public List<Medico> buscar() {
        final var medicoEntityList = springDataMedicoRepository.findAll();

        return medicoEntityList.stream()
                .map(medicoEntityToMedico::convert)
                .toList();
    }
}
