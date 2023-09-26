package com.algoritms.avengers.senasoft.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;


public record Usuarios(@Id @Column(name = "id_usuario") int id,
                       @Column(name = "id_sector") int idSector,
                       @Column(name = "nombre") String nombre,
                       @Column(name = "apellido") String apellido,
                       @Column(name = "correo") String correo,
                       @Column(name = "clave") String clave){
}
