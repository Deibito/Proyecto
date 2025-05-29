package com.proyecto;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VideojuegoTest {

    @Test
    public void pruebaGetPrecio() {
        Videojuego juego = new Videojuego("Geometry Dash", 2, "12/08/2013", "Música", null);
        float precio = juego.getPrecio();
        assertEquals(2, precio, 0.01);
    }

    @Test
    public void pruebaGetPerfilJugador() {
        Jugador jugador = new Jugador("Juan", "Juanito", 27);
        Videojuego juego = new Videojuego("Geometry Dash", 2, "12/08/2013", "Música", jugador);
        String perfil = juego.getPerfilJugador(jugador);
        String salidaEsperada = "Nombre del Jugador: Juan\n"
                + "Id del Jugador: Juanito\n"
                + "Nivel del Jugador: 27";
        assertEquals(salidaEsperada, perfil);
    }

    @Test
    public void pruebaSetIdJugador() {
        Jugador jugador = new Jugador("David", "ElMisterx", 70);
        Videojuego juego = new Videojuego("Honkai Star Rail", 0, "26/04/2023", "RPG", null);
        juego.setIdJugador(jugador);
        assertEquals(jugador, juego.getIdJugador());
    }
}
