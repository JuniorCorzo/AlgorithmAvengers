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
import com.algoritms.avengers.senasoft.model.Recursos;
import com.algoritms.avengers.senasoft.repository.RecursosRepository;

@RestController
@RequestMapping("/api/v1/recursos")
public class ApiRecursos {
    private final RecursosRepository recursosRepository;

    @Autowired
    public ApiRecursos(RecursosRepository recursosRepository){
        this.recursosRepository=recursosRepository;
    }

    //Por medio de GetMapping mapeamos las solicitud Http para traer los datos de todos los recursos  
    @GetMapping("/")
    public List<Recursos> obtenerTodosLosRecursos() {
        return recursosRepository.findAll();
    }

    //En este Mapeo se traen los datos solamente de un usuario
    @GetMapping("/{idRecurso}")
    public Recursos obteneridRecurso(@PathVariable int idRecurso) {
        return recursosRepository.findById(idRecurso)
                .orElseThrow(() -> new RuntimeException("Recurso no encontrado con id: " + idRecurso));
    }

    //Este metodo tiene como finalidad enviar peticiones para crear un recurso
    @PostMapping("/")
    public Recursos crearRecurso(@RequestBody Recursos recursos) {
        return recursosRepository.save(recursos);
    }

    //En este metodo cumple con la funcionalidad de actualizar datos de un recurso por medio de peticiones tipo PUT
    @PutMapping("/{idRecurso}/editar")
    public Recursos editarRecurso(@PathVariable int idRecurso, @RequestBody Recursos recursos) {
        if (!recursosRepository.existsById(idRecurso)) {
            throw new RuntimeException("Recurso no encontrado con id: " + idRecurso);
        }
        return recursosRepository.save(recursos);
    }
     //Este metodo tiene como finalidad por medio de la petición tipo DELETE borrar un recurso del sistema
    @DeleteMapping("/{idRecurso}")
    public void eliminarRecurso(@PathVariable int idRecurso) {
        if (!recursosRepository.existsById(idRecurso)) {
            throw new RuntimeException("Recurso no encontrado con id: " + idRecurso);
        }
        recursosRepository.deleteById(idRecurso);
    }
}
