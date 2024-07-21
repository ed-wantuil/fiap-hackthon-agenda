package br.com.fiap.hackthon.frameworks.db.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "agenda")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class AgendaEntity {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    private MedicoEntity medico;

    private LocalDateTime inicio;

    private LocalDateTime fim;

}
