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
import java.util.NoSuchElementException;

@Service("manejoDatos")
public class DBServiceManejoDatosImpl implements DBService {
    final UsuarioRepository usuarioRepository;
    final SectorRepository sectorRepository;
    final RecursosRepository recursosRepository;
    final MotivosRepository motivosRepository;


    public DBServiceManejoDatosImpl(UsuarioRepository usuarioRepository, SectorRepository sectorRepository, RecursosRepository recursosRepository, MotivosRepository motivosRepository) {
        this.usuarioRepository = usuarioRepository;
        this.sectorRepository = sectorRepository;
        this.recursosRepository = recursosRepository;
        this.motivosRepository = motivosRepository;
    }


    //Guardar la infomacion dentro de la base de datos
    public void guardarUsuario(Usuarios usuario){
        usuarioRepository.save(usuario);
    }

    public void guardarSector(Sector sector){
        sectorRepository.save(sector);
    }

    public void guardarRecursos(Recursos recurso){
        recursosRepository.save(recurso);
    }

    public void guardarMotivo(MotivosDesercion motivo){
        motivosRepository.save(motivo);
    }

    //Actualizar la informacion dentro de la base de datos
    //uso chat gpt
    public void actualizarUsuario(int id, Usuarios usuario){
        usuarioRepository.findById(id).orElseThrow(() -> new NoSuchElementException("No se encontro el usuario"));
        usuarioRepository.save(usuario);
    }

    public void actualizarSector(int id, Sector sector){
        sectorRepository.findById(id).orElseThrow(() -> new NoSuchElementException("No se encontro el sector"));
        sectorRepository.save(sector);
    }

    public void actualizarRecurso(int id, Recursos recursos){
        recursosRepository.findById(id).orElseThrow(() -> new NoSuchElementException("No se encontro el recurso"));
        recursosRepository.save(recursos);
    }

    public void actualizarRecurso(int id, MotivosDesercion motivos){
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
