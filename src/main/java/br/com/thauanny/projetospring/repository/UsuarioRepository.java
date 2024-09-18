package br.com.thauanny.projetospring.repository;

import br.com.thauanny.projetospring.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

}
