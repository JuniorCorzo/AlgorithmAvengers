package com.algoritms.avengers.senasoft.services.impl;

import com.algoritms.avengers.senasoft.model.MotivosDesercion;
import com.algoritms.avengers.senasoft.model.Recursos;
import com.algoritms.avengers.senasoft.model.Sectores;
import com.algoritms.avengers.senasoft.model.Usuarios;
import com.algoritms.avengers.senasoft.repository.MotivosRepository;
import com.algoritms.avengers.senasoft.repository.RecursosRepository;
import com.algoritms.avengers.senasoft.repository.SectoresRepository;
import com.algoritms.avengers.senasoft.repository.UsuarioRepository;
import com.algoritms.avengers.senasoft.services.DBService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DBServiceEncontrarImpl implements DBService {

    final UsuarioRepository usuarioRepository;
    final SectoresRepository sectorRepository;
    final RecursosRepository recursosRepository;
    final MotivosRepository motivosRepository;

    public DBServiceEncontrarImpl(SectoresRepository sectorRepository, UsuarioRepository usuarioRepository, RecursosRepository recursosRepository, MotivosRepository motivosRepository) {
        this.sectorRepository = sectorRepository;
        this.usuarioRepository = usuarioRepository;
        this.recursosRepository = recursosRepository;
        this.motivosRepository = motivosRepository;
    }


    //Obtener toda la informacion de la bases de datos dependiendo de la entidad

    public List<Usuarios> encontrarTodoUsuario() {
        return usuarioRepository.findAll();
    }


    public List<Sectores> encontrarTodoSector() {
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


    public Optional<Sectores> encontrarPorIdSector(int id) {
        return sectorRepository.findById(id);
    }


    public Optional<Recursos> encontrarPorIdRecursos(int id) {
        return recursosRepository.findById(id);
    }

    public Optional<MotivosDesercion> encontrarPorIdMotivos(int id) {
        return motivosRepository.findById(id);
    }


}
