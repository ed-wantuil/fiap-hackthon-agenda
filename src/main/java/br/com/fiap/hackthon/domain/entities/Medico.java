package br.com.fiap.hackthon.domain.entities;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Medico {
    private String id;
    private String crm;
    private String nome;
    private String especialidade;
    private String endereco;
    private String avaliacao;
    private Double valor;
    private List<Agenda> agendas;
}
