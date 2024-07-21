package br.com.fiap.hackthon.interfaces.controllers.medico.converters;

import br.com.fiap.hackthon.domain.entities.Medico;
import br.com.fiap.hackthon.interfaces.controllers.agenda.converters.AgendaToAgendaResponse;
import br.com.fiap.hackthon.interfaces.controllers.medico.responses.MedicoResponse;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MedicoToMedicoResponse {

    AgendaToAgendaResponse agendaToAgendaResponse;

    public MedicoResponse convert(final Medico medico) {
        return MedicoResponse.builder()
                .id(medico.getId())
                .crm(medico.getCrm())
                .nome(medico.getNome())
                .especialidade(medico.getEspecialidade())
                .endereco(medico.getEndereco())
                .avaliacao(medico.getAvaliacao())
                .valor(medico.getValor())
                .agendas(medico.getAgendas()
                        .stream()
                        .map(agendaToAgendaResponse::convert)
                        .toList())
                .build();
    }
}
