package br.com.thauanny.projetospring.service;

import br.com.thauanny.projetospring.dto.RecursoDTO;
import br.com.thauanny.projetospring.entity.RecursoEntity;
import br.com.thauanny.projetospring.repository.RecursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RecursoService {

    @Autowired
    private RecursoRepository recursoRepository;

    public List<RecursoDTO> ListarTodos(){
        List<RecursoEntity> recursos = recursoRepository.findAll();
        return recursos.stream().map(RecursoDTO:: new).toList();
    }

    public void inserir (RecursoDTO recurso){
        RecursoEntity recursoEntity = new RecursoEntity(recurso);
        recursoRepository.save(recursoEntity);
    }

    public RecursoDTO alterar(RecursoDTO recurso){
        RecursoEntity recursoEntity = new RecursoEntity(recurso);
        return new RecursoDTO(recursoRepository.save(recursoEntity));
    }

    public void excluir (Long id){
        RecursoEntity recurso = recursoRepository.findById(id).get();
        recursoRepository.delete(recurso);
    }

    public RecursoDTO buscarPorId(Long id){
        return new RecursoDTO(recursoRepository.findById(id).get());
    }
}
