package org.japrova.agenda.agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Seccion> secciones;
    private String nombre;

    public Agenda(String nombre) {
        this.nombre = nombre;
        this.secciones = new ArrayList<>();
    }

    public Agenda agregarSecciones(Seccion seccion) {
        if(seccion != null) {
            this.secciones.add(seccion);
        }
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Seccion> getSecciones() {
        return secciones;
    }
}
