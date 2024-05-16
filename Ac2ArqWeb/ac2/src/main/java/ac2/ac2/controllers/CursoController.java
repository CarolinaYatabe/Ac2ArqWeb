package ac2.ac2.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ac2.ac2.services.CursoService;

@RestController
@RequestMapping("api/curso")
public class CursoController {

    private CursoService cursoService;
    
    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }


}
