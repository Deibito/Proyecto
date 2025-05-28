package com.proyecto;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VideojuegoTest {
    
    @Test
    public void pruebaGetPrecio()
    {
        Videojuego juego = new Videojuego("Geometry Dash", 2, "2013", "Música", null);
        float precio = juego.getPrecio();
        assertEquals( 2, precio, 0.01 );
    }
}
