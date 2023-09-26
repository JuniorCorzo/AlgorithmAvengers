package com.algoritms.avengers.senasoft.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public record Sector(@Id @Column(name = "id_sector") int id,
                     @Column(name = "nombre")
                     String nombre) {
}
