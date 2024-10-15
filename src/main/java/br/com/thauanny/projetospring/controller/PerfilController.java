package br.com.thauanny.projetospring.controller;

import br.com.thauanny.projetospring.dto.PerfilDTO;
import br.com.thauanny.projetospring.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/perfil")
@CrossOrigin
public class PerfilController {

    @Autowired
    private PerfilService perfilService;

    @GetMapping
    public List<PerfilDTO>ListarTodos(){
        return perfilService.ListarTodos();
    }

    @PostMapping
    public void inserir(@RequestBody PerfilDTO perfil){
        perfilService.inserir(perfil);
    }

    @PutMapping
    public PerfilDTO alterar(@RequestBody PerfilDTO perfil){
        return perfilService.alterar(perfil);
    }

    @DeleteMapping
    public ResponseEntity<Void>excluir(@PathVariable("id") Long id){
        perfilService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
