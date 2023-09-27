package com.algoritms.avengers.senasoft.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Recursos {
    @Id
    @Column(name = "id_recurso")
    private int id;
    @Column(name = "id_sector")
    private int idRecurso;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "enlace")
    private String enlace;

    public Recursos(int id, int idRecurso, String titulo, String tipo, String enlace) {
        this.id = id;
        this.idRecurso = idRecurso;
        this.titulo = titulo;
        this.tipo = tipo;
        this.enlace = enlace;
    }

    public Recursos() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdRecurso() {
        return idRecurso;
    }

    public void setIdRecurso(int idRecurso) {
        this.idRecurso = idRecurso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }
}
