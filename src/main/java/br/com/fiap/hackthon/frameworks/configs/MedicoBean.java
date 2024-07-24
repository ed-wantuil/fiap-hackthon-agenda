package br.com.fiap.hackthon.frameworks.configs;

import br.com.fiap.hackthon.application.gateways.MedicoGateway;
import br.com.fiap.hackthon.application.usecases.medico.BuscarMedico;
import br.com.fiap.hackthon.application.usecases.medico.impl.BuscarMedicoImpl;
import br.com.fiap.hackthon.frameworks.web.medico.BuscarMedicoWeb;
import br.com.fiap.hackthon.frameworks.web.medico.impl.BuscarMedicoWebImpl;
import br.com.fiap.hackthon.interfaces.controllers.agenda.converters.AgendaToAgendaResponse;
import br.com.fiap.hackthon.interfaces.controllers.medico.BuscarMedicoController;
import br.com.fiap.hackthon.interfaces.controllers.medico.converters.MedicoToMedicoResponse;
import br.com.fiap.hackthon.interfaces.controllers.medico.impl.BuscarMedicoControllerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MedicoBean {

    @Bean
    MedicoToMedicoResponse medicoToMedicoResponse(final AgendaToAgendaResponse agendaToAgendaResponse) {
        return new MedicoToMedicoResponse(agendaToAgendaResponse);
    }

    @Bean
    BuscarMedicoController buscarMedicoController(final BuscarMedico buscarMedico,
                                                  final MedicoToMedicoResponse medicoToMedicoResponse) {
        return new BuscarMedicoControllerImpl(buscarMedico, medicoToMedicoResponse);
    }

    @Bean
    BuscarMedico buscarMedico(final MedicoGateway medicoGateway) {
        return new BuscarMedicoImpl(medicoGateway);
    }

    @Bean
    BuscarMedicoWeb buscarMedicoWeb(BuscarMedicoController buscarMedicoController) {
        return new BuscarMedicoWebImpl(buscarMedicoController);
    }
}
