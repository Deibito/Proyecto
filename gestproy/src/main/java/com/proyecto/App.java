package com.proyecto;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Jugador jugador1 = new Jugador("Juan", "Juanito", 27);
        Jugador jugador2 = new Jugador ("Antonio", "Tony" , 56);
        Videojuego juego = new Videojuego("Geometry Dash", 2, "2013", "Música", null);
        VideojuegoEstrategia juegoEstrategia = new VideojuegoEstrategia("UnderTale", 15, "15/09/2015", "Aventura", null ,"Tablero y fichas", 50);

        jugador1.muestraPerfil();
        jugador1.getVideojuego();
        jugador1.aumentarNivel();

        System.out.println();

        juego.setIdJugador(jugador1);
        juego.mostrarDetalles();
        juego.getPerfilJugador(jugador1);

        System.out.println();

        juegoEstrategia.setIdJugador(jugador2);
        juegoEstrategia.mostrarDetalles();
        juegoEstrategia.mostrarDetallesEstrategia();
        juegoEstrategia.calcularDuracion();

    }
}
