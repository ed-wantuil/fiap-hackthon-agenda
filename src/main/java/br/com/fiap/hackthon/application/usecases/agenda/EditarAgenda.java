package br.com.fiap.hackthon.application.usecases.agenda;

import br.com.fiap.hackthon.domain.entities.Agenda;

public interface EditarAgenda {
    Agenda editar(String id, Agenda agenda);
}
