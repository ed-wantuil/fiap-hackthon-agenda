package br.com.fiap.hackthon.frameworks.db.entities;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "medico")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class MedicoEntity implements Serializable {

    @Id
    @GeneratedValue
    private UUID id;

    private String crm;

    private String nome;

    private String especialidade;

    private String endereco;

    private String avaliacao;

    private Double valor;

    @OneToMany(mappedBy = "medico")
    private List<AgendaEntity> agendas;

}
