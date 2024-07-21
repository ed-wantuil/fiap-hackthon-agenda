package br.com.fiap.hackthon.interfaces.controllers.medico.responses;

import java.util.List;

import br.com.fiap.hackthon.interfaces.controllers.agenda.responses.AgendaResponse;
import lombok.Builder;

@Builder
public record MedicoResponse(String id,
                             String crm,
                             String nome,
                             String especialidade,
                             String endereco,
                             String avaliacao,
                             Double valor,
                             List<AgendaResponse> agendas) {
}
