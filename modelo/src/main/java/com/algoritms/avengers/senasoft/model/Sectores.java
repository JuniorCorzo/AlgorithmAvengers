package com.algoritms.avengers.senasoft.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Sectores {
    @Id
    @Column(name = "id_sector")
    private int id;
    @Column(name = "nombre")
    private String nombre;

    public Sectores(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Sectores() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
