package org.japrova.agenda.agenda;

import java.util.Date;

public class Seccion {
    private String titulo;
    private String parrafo;
    private Date fechaCreaccion;

    public Seccion(String titulo, String parrafo) {
        this.titulo = titulo;
        this.parrafo = parrafo;
        this.fechaCreaccion = new Date();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getParrafo() {
        return parrafo;
    }
}
