package com.proyecto;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JugadorTest {

    @Test
    public void pruebaAumentarNivel() {
        Jugador jugador = new Jugador("David", "ElMisterx", 70);
        jugador.aumentarNivel();
        assertEquals(71, jugador.getNivelCuenta());
    }
}
