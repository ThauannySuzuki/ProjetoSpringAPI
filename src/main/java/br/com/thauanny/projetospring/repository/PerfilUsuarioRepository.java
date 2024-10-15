package br.com.thauanny.projetospring.repository;

import br.com.thauanny.projetospring.entity.PerfilUsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilUsuarioRepository extends JpaRepository<PerfilUsuarioEntity, Long> {
}
