package com.algoritms.avengers.senasoft.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public record MotivosDesercion(@Id
                               @Column(name = "id_motivo")
                               int id,
                               @Column(name = "id_usuario")
                               int idUsuario,
                               @Column(name = "tipo")
                               String tipo,
                               @Column(name = "justificacion")
                               String justificacion){
}
