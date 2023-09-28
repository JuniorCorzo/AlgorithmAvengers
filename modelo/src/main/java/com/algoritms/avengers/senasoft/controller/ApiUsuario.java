package com.algoritms.avengers.senasoft.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algoritms.avengers.senasoft.model.Usuarios;
import com.algoritms.avengers.senasoft.repository.UsuarioRepository;

@RestController
@RequestMapping("/api/v1/usuario")
public class ApiUsuario {
    private final UsuarioRepository usuarioRepository;

    @Autowired
    public ApiUsuario(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping("/")
    public List<Usuarios> obtenerTodoUsuario() {
        return usuarioRepository.findAll();
    }

    @GetMapping("/{idUsuario}")
    public Usuarios obteneridUsuario(@PathVariable int idUsuario) {
        return usuarioRepository.findById(idUsuario)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado con id: " + idUsuario));
    }

    @PostMapping("/")
    public Usuarios crearUsuario(@RequestBody Usuarios usuario) {
        return usuarioRepository.save(usuario);
    }

    @PutMapping("/{idUsuario}/editar")
    public Usuarios editarUsuario(@PathVariable int idUsuario, @RequestBody Usuarios usuario) {
        if (!usuarioRepository.existsById(idUsuario)) {
            throw new RuntimeException("Usuario no encontrado con id: " + idUsuario);
        }
        return usuarioRepository.save(usuario);
    }
    
    @DeleteMapping("/{idUsuario}")
    public void eliminarusuario(@PathVariable int idUsuario) {
        if (!usuarioRepository.existsById(idUsuario)) {
            throw new RuntimeException("Usuario no encontrado con id: " + idUsuario);
        }
        usuarioRepository.deleteById(idUsuario);
    }
}