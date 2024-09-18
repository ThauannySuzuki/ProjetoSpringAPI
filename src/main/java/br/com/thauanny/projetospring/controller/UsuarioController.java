package br.com.thauanny.projetospring.controller;

import br.com.thauanny.projetospring.dto.UsuarioDTO;
import br.com.thauanny.projetospring.entity.UsuarioEntity;
import br.com.thauanny.projetospring.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (value = "/Usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<UsuarioDTO> ListarTodos(){
        return usuarioService.ListarTodos();
    }
    @PostMapping
    public void inserir(@RequestBody UsuarioDTO usuario){
        usuarioService.inserir(usuario);
    }
    @PutMapping
    public UsuarioDTO alterar (@RequestBody      UsuarioDTO usuario){
        return usuarioService.alterar(usuario);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        usuarioService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
