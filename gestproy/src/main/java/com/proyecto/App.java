package com.proyecto;

public class App {
    public static void main(String[] args) {
        // Creo 3 jugadores y creo un videojuego normal y un videojuego de tipo estrategia
        Jugador jugador1 = new Jugador("Juan", "Juanito", 27);
        Jugador jugador2 = new Jugador("Antonio", "Tony", 56);
        Jugador jugador3 = new Jugador("David", "ElMisterx", 70);
        Videojuego juego1 = new Videojuego("Geometry Dash", 2, "12/08/2013", "Música", null);
        Videojuego juego2 = new Videojuego("Honkai Star Rail", 0, "26/04/2023", "RPG", null);
        VideojuegoEstrategia juegoEstrategia = new VideojuegoEstrategia("UnderTale", 15, "15/09/2015", "Aventura", null,
                "Tablero y fichas", 50);

        // Aplico los métodos de la clase Jugador
        jugador1.muestraPerfil();
        jugador1.aumentarNivel();
        System.out.println();
        jugador2.muestraPerfil();
        jugador2.aumentarNivel();
        System.out.println();
        jugador3.muestraPerfil();
        System.out.println();

        // Aplico los métodos de la clase Videojuego
        System.out.println("Primer juego:");
        juego1.setIdJugador(jugador1);
        juego1.mostrarDetalles();
        juego1.getPerfilJugador(jugador1);
        System.out.println();
        System.out.println("Segundo juego:");
        juego2.setIdJugador(jugador3);
        juego2.mostrarDetalles();
        juego2.getPerfilJugador(jugador3);
        System.out.println();

        // Aplico los métodos de la clase VideojuegoEstrategia
        System.out.println("Tercer juego:");
        juegoEstrategia.setIdJugador(jugador2);
        juegoEstrategia.mostrarDetalles();
        juegoEstrategia.mostrarDetallesEstrategia();
        System.out.println();

        // Creo un objetos para todos los tipos de la clase Plataforma
        PC pc = new PC("MSI Bravo 15 B5ED", "Windows 11", "Intel Core i9", "32GB");
        Consola consola = new Consola("PlayStation 5", "1TB", true);
        Movil movil = new Movil("Samsung S22", "78%", true);

        // Aplico los métodos de la clase PC
        pc.verCaracterísticas();
        pc.iniciar();
        pc.conectarRed();
        System.out.println();

        // Aplico los métodos de la clase Consola
        consola.verConsola();
        consola.sincronizarMando();
        consola.iniciar();
        consola.conectarRed();
        consola.detener();
        System.out.println();

        // Aplico los métodos de la clase Movil
        movil.verDetalles();
        movil.iniciar();
        movil.conectarRed();
        movil.controlarNotificaciones();
        movil.desconectarRed();
        movil.detener();
        System.out.println();

        // Aplico algunos ejemplos juntando los objetos en una misma sentencia
        System.out.println("El jugador " + jugador1.getNombre() + " está jugando actualmente a " + juego1.getNombre()
                + " en su " + pc.getModelo());
        System.out.println("El jugador " + jugador2.getNombre() + " está jugando actualmente a "
                + juegoEstrategia.getNombre() + " en su " + consola.getModelo());
        System.out.println("El jugador " + jugador3.getNombre() + " está jugando actualmente a " + juego2.getNombre()
                + " en su " + movil.getModelo());
    }
}
