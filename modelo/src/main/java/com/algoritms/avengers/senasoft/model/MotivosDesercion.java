package com.algoritms.avengers.senasoft.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MotivosDesercion{
    @Id
    @Column(name = "id_motivo")
    private int id;
    @Column(name = "id_usuario")
    private int idUsuario;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "justificacion")
    private String justificacion;

    public MotivosDesercion() {
    }

    public MotivosDesercion(int id, int idUsuario, String tipo, String justificacion) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.tipo = tipo;
        this.justificacion = justificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }
}
