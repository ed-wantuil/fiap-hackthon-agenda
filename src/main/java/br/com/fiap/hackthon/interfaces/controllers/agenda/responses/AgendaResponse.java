package br.com.fiap.hackthon.interfaces.controllers.agenda.responses;

import java.time.LocalDateTime;

import lombok.Builder;


@Builder
public record AgendaResponse(String id,
                             String medicoId,
                             LocalDateTime inicio,
                             LocalDateTime fim) {
}
