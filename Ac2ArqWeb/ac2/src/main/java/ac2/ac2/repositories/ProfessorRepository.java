package ac2.ac2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ac2.ac2.models.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    @Query("select p from Profesor p left join fetch p.curso c where p.id = :id ")
Professor findProfessorCurso(@Param("id") Long id);
}

