package com.algoritms.avengers.senasoft.services.impl;

import com.algoritms.avengers.senasoft.repository.MotivosRepository;
import com.algoritms.avengers.senasoft.repository.RecursosRepository;
import com.algoritms.avengers.senasoft.repository.SectorRepository;
import com.algoritms.avengers.senasoft.repository.UsuarioRepository;
import com.algoritms.avengers.senasoft.services.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
