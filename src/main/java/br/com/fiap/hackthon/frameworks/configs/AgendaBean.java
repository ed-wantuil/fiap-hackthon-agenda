package br.com.fiap.hackthon.frameworks.configs;

import br.com.fiap.hackthon.application.gateways.AgendaGateway;
import br.com.fiap.hackthon.application.usecases.agenda.CriarAgenda;
import br.com.fiap.hackthon.application.usecases.agenda.EditarAgenda;
import br.com.fiap.hackthon.application.usecases.agenda.impl.CriarAgendaImpl;
import br.com.fiap.hackthon.application.usecases.agenda.impl.EditarAgendaImpl;
import br.com.fiap.hackthon.frameworks.web.agenda.CriarAgendaWeb;
import br.com.fiap.hackthon.frameworks.web.agenda.EditarAgendaWeb;
import br.com.fiap.hackthon.frameworks.web.agenda.impl.CriarAgendaWebImpl;
import br.com.fiap.hackthon.frameworks.web.agenda.impl.EditarAgendaWebImpl;
import br.com.fiap.hackthon.interfaces.controllers.agenda.CriarAgendaController;
import br.com.fiap.hackthon.interfaces.controllers.agenda.EditarAgendaController;
import br.com.fiap.hackthon.interfaces.controllers.agenda.converters.AgendaRequestToAgenda;
import br.com.fiap.hackthon.interfaces.controllers.agenda.converters.AgendaToAgendaResponse;
import br.com.fiap.hackthon.interfaces.controllers.agenda.impl.CriarAgendaControllerImpl;
import br.com.fiap.hackthon.interfaces.controllers.agenda.impl.EditarControllerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AgendaBean {

    @Bean
    AgendaToAgendaResponse agendaToAgendaResponse() {
        return new AgendaToAgendaResponse();
    }

    @Bean
    CriarAgendaController criarAgendaController(final CriarAgenda criarAgenda,
                                                final AgendaRequestToAgenda agendaRequestToAgenda,
                                                final AgendaToAgendaResponse agendaToAgendaResponse) {
        return new CriarAgendaControllerImpl(criarAgenda, agendaRequestToAgenda, agendaToAgendaResponse);
    }

    @Bean
    AgendaRequestToAgenda agendaRequestToAgenda() {
        return new AgendaRequestToAgenda();
    }

    @Bean
    CriarAgenda criarAgenda(final AgendaGateway agendaGateway) {
        return new CriarAgendaImpl(agendaGateway);
    }


    @Bean
    CriarAgendaWeb criarAgendaWeb(final CriarAgendaController criarAgendaController) {
        return new CriarAgendaWebImpl(criarAgendaController);
    }

    @Bean
    EditarAgendaWeb editarAgendaWeb(final EditarAgendaController editarAgendaController) {
        return new EditarAgendaWebImpl(editarAgendaController);
    }

    @Bean
    EditarAgendaController editarAgendaController(EditarAgenda editarAgenda,
                                                  AgendaRequestToAgenda agendaRequestToAgenda,
                                                  AgendaToAgendaResponse agendaToAgendaResponse) {
        return new EditarControllerImpl(editarAgenda, agendaRequestToAgenda, agendaToAgendaResponse);
    }

    @Bean
    EditarAgenda editarAgenda(final AgendaGateway agendaGateway) {
        return new EditarAgendaImpl(agendaGateway);
    }
}
