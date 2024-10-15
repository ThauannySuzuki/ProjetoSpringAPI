package br.com.thauanny.projetospring.controller;

import br.com.thauanny.projetospring.dto.RecursoDTO;
import br.com.thauanny.projetospring.entity.RecursoEntity;
import br.com.thauanny.projetospring.service.RecursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/recurso")
@CrossOrigin
public class RecursoController {

    @Autowired
    private RecursoService recursoService;

    @GetMapping
    public List<RecursoDTO> ListarTodos(){
        return recursoService.ListarTodos();
    }

    @PostMapping
    public void inserir(@RequestBody RecursoDTO recurso){
        recursoService.inserir(recurso);
    }

    @PutMapping
    public RecursoDTO alterar (@RequestBody RecursoDTO recurso){
        return recursoService.alterar(recurso);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void>excluir(@PathVariable("id") Long id){
        recursoService.excluir(id);
        return ResponseEntity.ok().build();
    }

}



