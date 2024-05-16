package ac2.ac2.services;

import ac2.ac2.repositories.CursoRepository;

public class CursoServiceImpl implements CursoService {
    private CursoRepository cursoRepository;

    public CursoServiceImpl(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }
}
