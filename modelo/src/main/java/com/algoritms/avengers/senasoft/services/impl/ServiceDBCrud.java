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
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ServiceDBCrud implements DBService {
    final UsuarioRepository usuarioRepository;
    final SectoresRepository sectorRepository;
    final RecursosRepository recursosRepository;
    final MotivosRepository motivosRepository;


    public ServiceDBCrud(UsuarioRepository usuarioRepository, SectoresRepository sectorRepository, RecursosRepository recursosRepository, MotivosRepository motivosRepository) {
        this.usuarioRepository = usuarioRepository;
        this.sectorRepository = sectorRepository;
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
    public List<Recursos> obtenerRecursosIdSector(int id){
        return recursosRepository.findAllByIdSector(id);
    }

    public Optional<MotivosDesercion> encontrarPorIdMotivos(int id) {
        return motivosRepository.findById(id);
    }

    //Guardar la infomacion dentro de la base de datos
    public Usuarios guardar(Usuarios usuario){
        return usuarioRepository.save(usuario);
    }

    public Sectores guardar(Sectores sector){
        return sectorRepository.save(sector);
    }

    public Recursos guardar(Recursos recurso){
        return  recursosRepository.save(recurso);
    }

    public MotivosDesercion guardar(MotivosDesercion motivo){
        return motivosRepository.save(motivo);
    }

    //Actualizar la informacion dentro de la base de datos
    //uso chat gpt
    public Usuarios actualizar(int id, Usuarios usuario){
        usuarioRepository.findById(id).orElseThrow(() -> new NoSuchElementException("No se encontro el usuario"));
        return usuarioRepository.save(usuario);
    }

    public Sectores actualizar(int id, Sectores sector){
        sectorRepository.findById(id).orElseThrow(() -> new NoSuchElementException("No se encontro el sector"));
        return sectorRepository.save(sector);
    }

    public Recursos actualizar(int id, Recursos recursos){
        recursosRepository.findById(id).orElseThrow(() -> new NoSuchElementException("No se encontro el recurso"));
        return recursosRepository.save(recursos);
    }

    public MotivosDesercion actualizar(int id, MotivosDesercion motivos){
        motivosRepository.findById(id).orElseThrow(() -> new NoSuchElementException("No se encontro el motivo de la dercesion"));
        return motivosRepository.save(motivos);
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

    public boolean existsRecursoById(int idRecurso) {
        return recursosRepository.existsById(idRecurso);
    }

    public boolean existsUsuarioById(int idUsuario) {
        return usuarioRepository.existsById(idUsuario);
    }
}
