package br.com.thauanny.projetospring.repository;

import br.com.thauanny.projetospring.entity.RecursoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecursoRepository extends JpaRepository<RecursoEntity, Long> {

}
