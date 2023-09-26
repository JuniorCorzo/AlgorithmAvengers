package com.algoritms.avengers.senasoft.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public record Recursos(@Id
                       @Column(name = "id_recurso")
                       int id,
                       @Column(name = "id_recurso")
                       int idRecurso,
                       @Column(name = "titulo")
                       String titulo,
                       @Column(name = "tipo")
                       String tipo,
                       @Column(name = "enlace")
                       String enlace) {
}
