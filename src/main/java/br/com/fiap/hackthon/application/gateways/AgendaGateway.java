package br.com.fiap.hackthon.application.gateways;


import br.com.fiap.hackthon.domain.entities.Agenda;

public interface AgendaGateway {

    Agenda criar(Agenda agenda);

    Agenda editar(final String id, final Agenda agenda);
}
