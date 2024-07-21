package br.com.fiap.hackthon.domain.entities;


import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Agenda {
    private String id;
    private Medico medico;
    private LocalDateTime inicio;
    private LocalDateTime fim;

}
