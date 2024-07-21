package br.com.fiap.hackthon.interfaces.controllers.agenda.requests;

import java.time.LocalDateTime;

import lombok.Builder;

@Builder
public record AgendaRequest(String id,
                            String medicoId,
                            LocalDateTime inicio,
                            LocalDateTime fim) {
}
