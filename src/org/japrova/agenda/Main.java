package org.japrova.agenda;

import org.japrova.agenda.agenda.Agenda;
import org.japrova.agenda.agenda.Seccion;
import org.japrova.agenda.usuario.Usuario;
import static org.japrova.agenda.usuario.Usuario.getBaseDatos;

public class Main {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("jhosep", "jhosep123");
        usuario1.crearAgenda("Registro de mejorar Programación");

        usuario1.getAgenda().agregarSecciones(new Seccion("Leer un libro sobre JAVA", "En este seccion" +
                " tendre que buscar un libro sobre JAVA y comenzar sobre JAVA"))
                .agregarSecciones(new Seccion("Encender la laptop para practicar", "No sirvira para " +
                        "practicar y ganar campo en el lenguaje"));

        Usuario usuario2 = new Usuario("Kei", "Karuizawa");
        usuario2.crearAgenda("Como ser una chica popular");

        usuario2.getAgenda().agregarSecciones(new Seccion("Dia 1", "Para ser una chica popular tendre que " +
                "cambiar de peinado y cambiar de ropa")) // ESTO SE LLAMAN MÉTODOS ENCADENADOS
                .agregarSecciones(new Seccion("Dia 2", "Tendré que socializar y hacer gestos de ahegao"));


        Usuario[] usuarios = getBaseDatos().getUsuarios();

        for (Usuario u : usuarios) {
            Agenda agenda = u.getAgenda();

            System.out.println("==== ---- ====");
            System.out.println("Usuario de la Agenda: " + u.getUsuario());
            System.out.println("NOMBRE DE LA AGENDA: " + u.getAgenda().getNombre() + "\n");

            if(agenda.getSecciones().isEmpty()) {
                System.out.println("El usuario: " + u.getUsuario() + ", tiene una agenda pero no " +
                        "comenzó a guardar nada aún");
            }
            for (Seccion sec : agenda.getSecciones()) {

                System.out.println("Titulo: " + sec.getTitulo());
                System.out.println("Parrafo: " + sec.getParrafo() + "\n");
            }
        }
    }
}
