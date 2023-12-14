package org.japrova.agenda;

import org.japrova.agenda.usuario.Usuario;

public class Bd {
    private Usuario[] usuarios;
    private static int contador;
    private static final int MAX_CANTIDAD = 2;

    public Bd() {
        this.usuarios = new Usuario[2];
    }

    public void agregar(Usuario usuario) {

        if(Bd.MAX_CANTIDAD > Bd.contador) {
            this.usuarios[Bd.contador++] = usuario;
            return;
        }
        System.out.println("nO agrega");
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }
}
