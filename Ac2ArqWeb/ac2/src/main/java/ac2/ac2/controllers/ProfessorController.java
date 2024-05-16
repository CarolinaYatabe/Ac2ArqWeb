package ac2.ac2.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ac2.ac2.services.ProfessorService;

@RestController
@RequestMapping("api/professor")
public class ProfessorController {

    private ProfessorService professorService;
    
    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }


}
