package com.algoritms.avengers.senasoft.controller;

import java.util.List;

import com.algoritms.avengers.senasoft.services.impl.ServiceDBCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
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

    //Por medio de esta anotación se hace puede hacer una inyeccion de dependencia
    @Autowired
    @Qualifier("serviceDBCrud")
    private ServiceDBCrud allRepositorys;


    //Por medio de GetMapping mapeamos las solicitud Http para traer los datos de todos usuarios  
    @GetMapping("/")
    public List<Usuarios> obtenerTodoUsuario() {
        return allRepositorys.encontrarTodoUsuario();
    }

    //En este Mapeo se traen los datos solamente de un usuario
    @GetMapping("/{idUsuario}")
    public Usuarios obteneridUsuario(@PathVariable int idUsuario) {
        return allRepositorys.encotrarPorIdUsuario(idUsuario)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado con id: " + idUsuario));
    }

    //Este metodo tiene como finalidad enviar peticiones para crear a un usuario
    @PostMapping("/")
    public Usuarios crearUsuario(@RequestBody Usuarios usuario) {
        return allRepositorys.guardar(usuario);
    }


    //En este metodo cumple con la funcionalidad de actualizar datos de un usuario por medio de peticiones tipo PUT
    @PutMapping(path = "/{idUsuario}/editar", consumes= "application/json;charset=UTF-8")
    public Usuarios editarUsuario(@PathVariable int idUsuario, @RequestBody Usuarios usuario) {
        if (!allRepositorys.existsUsuarioById(idUsuario)) {
            throw new RuntimeException("Usuario no encontrado con id: " + idUsuario);
        }
        return allRepositorys.guardar(usuario);
    }
     //Este metodo tiene como finalidad por medio de la petición tipo DELETE borrar a un usuario del sistema
    @DeleteMapping("/{idUsuario}")
    public void eliminarusuario(@PathVariable int idUsuario) {
        if (!allRepositorys.existsUsuarioById(idUsuario)) {
            throw new RuntimeException("Usuario no encontrado con id: " + idUsuario);
        }
        allRepositorys.borrarUsuario(idUsuario);
    }
}