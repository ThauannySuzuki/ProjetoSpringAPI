package br.com.thauanny.projetospring.service;

import br.com.thauanny.projetospring.dto.PerfilDTO;
import br.com.thauanny.projetospring.entity.PerfilEntity;
import br.com.thauanny.projetospring.repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilService {

    @Autowired
    private PerfilRepository perfilRepository;

    public List<PerfilDTO>ListarTodos(){
        List<PerfilEntity> perfis = perfilRepository.findAll();
        return perfis.stream().map(PerfilDTO:: new).toList();
    }

    public void inserir (PerfilDTO perfil){
        PerfilEntity perfilEntity = new PerfilEntity(perfil);
        perfilRepository.save(perfilEntity);
    }

    public PerfilDTO alterar(PerfilDTO perfil){
        PerfilEntity perfilEntity = new PerfilEntity(perfil);
        return new PerfilDTO(perfilRepository.save(perfilEntity));
    }

    public void excluir(Long id){
        PerfilEntity perfil = perfilRepository.findById(id).get();
        perfilRepository.delete(perfil);
    }

    public PerfilDTO buscarPorId(Long id){
        return new PerfilDTO(perfilRepository.findById(id).get());
    }
}
