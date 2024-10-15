package br.com.thauanny.projetospring.controller;

import br.com.thauanny.projetospring.dto.PerfilUsuarioDTO;
import br.com.thauanny.projetospring.service.PerfilUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/perfil-usuario")
@CrossOrigin
public class PerfilUsuarioController {

    @Autowired
    private PerfilUsuarioService perfilUsuarioService;

    @GetMapping
    public List<PerfilUsuarioDTO> ListarTodos(){
        return perfilUsuarioService.ListarTodos();
    }

    @PostMapping
    public void inserir(@RequestBody PerfilUsuarioDTO perfilUsuario){
        perfilUsuarioService.inserir(perfilUsuario);
    }

    @PutMapping
    public PerfilUsuarioDTO alterar(@RequestBody PerfilUsuarioDTO perfilUsuario){
        return perfilUsuarioService.alterar(perfilUsuario);
    }

    @DeleteMapping
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        perfilUsuarioService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
