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
}
