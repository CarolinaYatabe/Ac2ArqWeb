package ac2.ac2.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ac2.ac2.services.AgendaService;

@RestController
@RequestMapping("api/agenda")
public class AgendaController {
    private AgendaService agendaService;

    public AgendaController(AgendaService agendaService) {
        this.agendaService = agendaService;
    }

}
