package br.com.fiap.hackthon.frameworks.db.converters;

import static java.util.Objects.isNull;

import java.util.UUID;

import br.com.fiap.hackthon.domain.entities.Medico;
import br.com.fiap.hackthon.frameworks.db.entities.MedicoEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MedicoToMedicoEntity {


    private AgendaEntityToAgenda agendaEntityToAgenda;

    public MedicoEntity convert(final Medico medico) {
        return MedicoEntity
                .builder()
                .id(isNull(medico.getId()) ? null : UUID.fromString(medico.getId()))
                .crm(medico.getCrm())
                .nome(medico.getNome())
                .especialidade(medico.getEspecialidade())
                .endereco(medico.getEndereco())
                .avaliacao(medico.getAvaliacao())
                .valor(medico.getValor())
                .build();
    }
}
