package org.japrova.agenda.usuario;

import org.japrova.agenda.Bd;
import org.japrova.agenda.agenda.Agenda;

public class Usuario {
    private int idUsuario;
    private static int contador;
    private String usuario;
    private String password;
    private Agenda agenda;
    private static final Bd baseDatos = new Bd();

    public Usuario(String usuario, String password) {
        this.idUsuario = ++Usuario.contador;
        this.usuario = usuario;
        this.password = password;
        Usuario.baseDatos.agregar(this);
    }

    public void crearAgenda(String nombre) {
        this.agenda = new Agenda(nombre);
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public static Bd getBaseDatos() {
        return baseDatos;
    }

    public String getUsuario() {
        return usuario;
    }
}
