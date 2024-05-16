package ac2.ac2.services;

import ac2.ac2.repositories.ProfessorRepository;

public class ProfessorServiceImpl implements ProfessorService {
    private ProfessorRepository professorRepository;
    
    public ProfessorServiceImpl(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }



    
}
