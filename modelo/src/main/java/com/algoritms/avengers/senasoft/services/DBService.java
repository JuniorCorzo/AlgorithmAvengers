package com.algoritms.avengers.senasoft.services;

import com.algoritms.avengers.senasoft.model.MotivosDesercion;
import com.algoritms.avengers.senasoft.model.Recursos;
import com.algoritms.avengers.senasoft.model.Sector;
import com.algoritms.avengers.senasoft.model.Usuarios;

import java.util.List;
import java.util.Optional;

public interface DBService {

    //Obtener toda la informacion almacenada en la tabla de las diversas entidades
    List<Usuarios> encontrarTodoUsuario();
    List<Sector> encontrarTodoSector();
    List<Recursos> encontrarTodoRecursos();
    List<MotivosDesercion> encontrarTodoMotivos();

    //Obtener la infomacion por id en cada una de las entidades
    Optional<Usuarios> encotrarPorIdUsuario(int id);
    Optional<Sector> encontrarPorIdSector(int id);
    Optional<Recursos> encontrarPorIdRecursos(int id);
    Optional<MotivosDesercion> encontrarPorIdMotivos(int id);


}
