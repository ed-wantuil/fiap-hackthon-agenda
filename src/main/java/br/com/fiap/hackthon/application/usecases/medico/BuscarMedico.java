package br.com.fiap.hackthon.application.usecases.medico;

import java.util.List;

import br.com.fiap.hackthon.domain.entities.Medico;

public interface BuscarMedico {

    List<Medico> buscar();
}
