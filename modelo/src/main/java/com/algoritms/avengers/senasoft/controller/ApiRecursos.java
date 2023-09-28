package com.algoritms.avengers.senasoft.controller;
import java.util.List;

import com.algoritms.avengers.senasoft.services.DBService;
import com.algoritms.avengers.senasoft.services.impl.ServiceDBCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.algoritms.avengers.senasoft.model.Recursos;

@RestController
@RequestMapping("/api/v1/recursos")
public class ApiRecursos {
    @Qualifier("serviceDBCrud")
    @Autowired
    private ServiceDBCrud allRepository;



    //Por medio de GetMapping mapeamos las solicitud Http para traer los datos de todos los recursos
    @GetMapping("/")
    public List<Recursos> obtenerTodosLosRecursos() {
        return allRepository.encontrarTodoRecursos();
    }

    //En este Mapeo se traen los datos solamente de un usuario
    @GetMapping("/{idRecurso}")
    public Recursos obteneridRecurso(@PathVariable int idRecurso) {
        return allRepository.encontrarPorIdRecursos(idRecurso)
                .orElseThrow(() -> new RuntimeException("Recurso no encontrado con id: " + idRecurso));
    }

    //Este metodo tiene como finalidad enviar peticiones para crear un recurso
    @PostMapping("/")
    public Recursos crearRecurso(@RequestBody Recursos recursos) {
        return allRepository.guardar(recursos);
    }

    //En este metodo cumple con la funcionalidad de actualizar datos de un recurso por medio de peticiones tipo PUT
    @PutMapping("/{idRecurso}/editar")
    public Recursos editarRecurso(@PathVariable int idRecurso, @RequestBody Recursos recursos) {
        if (!allRepository.existsRecursoById(idRecurso)) {
            throw new RuntimeException("Recurso no encontrado con id: " + idRecurso);
        }
        return allRepository.guardar(recursos);
    }
     //Este metodo tiene como finalidad por medio de la petición tipo DELETE borrar un recurso del sistema
    @DeleteMapping("/{idRecurso}")
    public void eliminarRecurso(@PathVariable int idRecurso) {
        if (!allRepository.existsRecursoById(idRecurso)) {
            throw new RuntimeException("Recurso no encontrado con id: " + idRecurso);
        }
        allRepository.borrarRecurso(idRecurso);
    }
}
