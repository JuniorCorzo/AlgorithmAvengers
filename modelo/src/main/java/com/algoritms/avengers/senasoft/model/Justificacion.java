package com.algoritms.avengers.senasoft.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Justificacion {
    @Id
    @Column(name = "id_usuario")
    private int idUsuario;

    @Column(name = "justificacion")
    private String justificacion;

    public Justificacion() {
    }

    public Justificacion(int idUsuario, String justificacion) {
        this.idUsuario = idUsuario;
        this.justificacion = justificacion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }
}
