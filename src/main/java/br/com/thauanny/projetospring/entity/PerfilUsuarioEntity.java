package br.com.thauanny.projetospring.entity;


import br.com.thauanny.projetospring.dto.PerfilDTO;
import br.com.thauanny.projetospring.dto.PerfilUsuarioDTO;
import br.com.thauanny.projetospring.dto.UsuarioDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Entity
@Table(name = "TMS_PERFIL_USUARIO")
@Getter
@Setter
@NoArgsConstructor
public class PerfilUsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn( name = "ID_USUARIO")
    private UsuarioEntity usuario;

    @ManyToOne
    @JoinColumn (name = "ID_PERFIL")
    private PerfilEntity perfil;

    public PerfilUsuarioEntity(PerfilUsuarioDTO perfilUsuario){
        BeanUtils.copyProperties(perfilUsuario, this);
        if (perfilUsuario != null && perfilUsuario.getUsuario() != null){
            this.usuario = new UsuarioEntity(perfilUsuario.getUsuario());
        }
        if (perfilUsuario != null && perfilUsuario.getPerfil() != null){
            this.perfil = new PerfilEntity(perfilUsuario.getPerfil());
        }
    }
}
