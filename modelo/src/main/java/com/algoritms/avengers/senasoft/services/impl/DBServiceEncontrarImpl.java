package com.algoritms.avengers.senasoft.services.impl;

import com.algoritms.avengers.senasoft.model.MotivosDesercion;
import com.algoritms.avengers.senasoft.model.Recursos;
import com.algoritms.avengers.senasoft.model.Sector;
import com.algoritms.avengers.senasoft.model.Usuarios;
import com.algoritms.avengers.senasoft.repository.MotivosRepository;
import com.algoritms.avengers.senasoft.repository.RecursosRepository;
import com.algoritms.avengers.senasoft.repository.SectorRepository;
import com.algoritms.avengers.senasoft.repository.UsuarioRepository;
import com.algoritms.avengers.senasoft.services.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DBServiceEncontrarImpl implements DBService {

    @Autowired
    UsuarioRepository usuarioRepository;
    @Autowired
    SectorRepository sectorRepository;
    @Autowired
    RecursosRepository recursosRepository;
    @Autowired
    MotivosRepository motivosRepository;


    //Obtener toda la informacion de la bases de datos dependiendo de la entidad

    public List<Usuarios> encontrarTodoUsuario() {
        return usuarioRepository.findAll();
    }


    public List<Sector> encontrarTodoSector() {
        return sectorRepository.findAll();
    }


    public List<Recursos> encontrarTodoRecursos() {
        return recursosRepository.findAll();
    }

    public List<MotivosDesercion> encontrarTodoMotivos() {
        return motivosRepository.findAll();
    }


    //Obtener solo la infomacion por id dependiendo de la entidad
    public Optional<Usuarios> encotrarPorIdUsuario(int id) {
        return usuarioRepository.findById(id);
    }


    public Optional<Sector> encontrarPorIdSector(int id) {
        return sectorRepository.findById(id);
    }


    public Optional<Recursos> encontrarPorIdRecursos(int id) {
        return recursosRepository.findById(id);
    }

    public Optional<MotivosDesercion> encontrarPorIdMotivos(int id) {
        return motivosRepository.findById(id);
    }


}
