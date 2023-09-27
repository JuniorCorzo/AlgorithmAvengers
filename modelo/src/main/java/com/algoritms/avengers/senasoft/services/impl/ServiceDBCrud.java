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

import java.util.NoSuchElementException;

@Service
public class DBServiceManejoDatosImpl implements DBService {
    final UsuarioRepository usuarioRepository;
    final SectoresRepository sectorRepository;
    final RecursosRepository recursosRepository;
    final MotivosRepository motivosRepository;


    public DBServiceManejoDatosImpl(UsuarioRepository usuarioRepository, SectoresRepository sectorRepository, RecursosRepository recursosRepository, MotivosRepository motivosRepository) {
        this.usuarioRepository = usuarioRepository;
        this.sectorRepository = sectorRepository;
        this.recursosRepository = recursosRepository;
        this.motivosRepository = motivosRepository;
    }


    //Guardar la infomacion dentro de la base de datos
    public void guardar(Usuarios usuario){
        usuarioRepository.save(usuario);
    }

    public void guardar(Sectores sector){
        sectorRepository.save(sector);
    }

    public void guardar(Recursos recurso){
        recursosRepository.save(recurso);
    }

    public void guardar(MotivosDesercion motivo){
        motivosRepository.save(motivo);
    }

    //Actualizar la informacion dentro de la base de datos
    //uso chat gpt
    public void actualizar(int id, Usuarios usuario){
        usuarioRepository.findById(id).orElseThrow(() -> new NoSuchElementException("No se encontro el usuario"));
        usuarioRepository.save(usuario);
    }

    public void actualizar(int id, Sectores sector){
        sectorRepository.findById(id).orElseThrow(() -> new NoSuchElementException("No se encontro el sector"));
        sectorRepository.save(sector);
    }

    public void actualizar(int id, Recursos recursos){
        recursosRepository.findById(id).orElseThrow(() -> new NoSuchElementException("No se encontro el recurso"));
        recursosRepository.save(recursos);
    }

    public void actualizar(int id, MotivosDesercion motivos){
        motivosRepository.findById(id).orElseThrow(() -> new NoSuchElementException("No se encontro el motivo de la dercesion"));
        motivosRepository.save(motivos);
    }

    //Borrar informacion de la base de datos
    public void borrarUsuario(int id){
        usuarioRepository.deleteById(id);
    }

    public void borrarSector(int id){
        sectorRepository.deleteById(id);
    }

    public void borrarRecurso(int id){
        recursosRepository.deleteById(id);
    }

    public void borrarMotivo(int id){
        motivosRepository.deleteById(id);
    }
}
