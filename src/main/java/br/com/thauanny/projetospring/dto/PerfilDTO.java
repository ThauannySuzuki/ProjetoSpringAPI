package br.com.thauanny.projetospring.dto;

import br.com.thauanny.projetospring.entity.PerfilEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
public class PerfilDTO {

    private Long id;
    private String descricao;

    public PerfilDTO(PerfilEntity perfil){
        BeanUtils.copyProperties(perfil, this);
    }
}
