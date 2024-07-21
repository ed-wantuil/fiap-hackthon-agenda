package br.com.fiap.hackthon.frameworks.db.converters;

import br.com.fiap.hackthon.domain.entities.Medico;
import br.com.fiap.hackthon.frameworks.db.entities.MedicoEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MedicoEntityToMedico {


    private AgendaEntityToAgenda agendaEntityToAgenda;

    public Medico convert(final MedicoEntity medicoEntity) {
        return Medico
                .builder()
                .id(medicoEntity.getId().toString())
                .crm(medicoEntity.getCrm())
                .nome(medicoEntity.getNome())
                .especialidade(medicoEntity.getEspecialidade())
                .endereco(medicoEntity.getEndereco())
                .avaliacao(medicoEntity.getAvaliacao())
                .valor(medicoEntity.getValor())
                .agendas(medicoEntity.getAgendas()
                        .stream()
                        .map(agendaEntityToAgenda::convert)
                        .toList())
                .build();
    }
}
