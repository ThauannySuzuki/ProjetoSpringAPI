package br.com.thauanny.projetospring.repository;

import br.com.thauanny.projetospring.entity.PerfilEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilRepository extends JpaRepository<PerfilEntity, Long> {
}
