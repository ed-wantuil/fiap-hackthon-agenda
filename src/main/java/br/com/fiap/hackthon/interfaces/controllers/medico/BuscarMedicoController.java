package br.com.fiap.hackthon.interfaces.controllers.medico;

import java.util.List;

import br.com.fiap.hackthon.interfaces.controllers.medico.responses.MedicoResponse;

public interface BuscarMedicoController {

    List<MedicoResponse> buscar();

}
