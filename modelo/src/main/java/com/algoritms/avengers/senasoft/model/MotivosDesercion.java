package com.algoritms.avengers.senasoft.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MotivosDesercion{
    @Id
    @Column(name = "id_motivo")
    private int id;
    @Column(name = "tipo")
    private String tipo;

    public MotivosDesercion() {
    }

    public MotivosDesercion(int id, int idUsuario, String tipo, String justificacion) {
        this.id = id;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
