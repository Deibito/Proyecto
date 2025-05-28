package com.proyecto;

public class VideojuegoEstrategia extends Videojuego {

    private String tipoEstrategia;
    private float duracion;

    public VideojuegoEstrategia(String nombre, float precio, String fechaSalida, String genero,
            Jugador idJugador,String tipoEstrategia, float duracion) {
        super(nombre, precio, fechaSalida, genero, idJugador);
        this.tipoEstrategia = tipoEstrategia;
        this.duracion = duracion;
    }

    public void setIdJugador(Jugador idJugador) {
        this.idJugador = idJugador;
    }

    public void mostrarDetallesEstrategia(){
        System.out.println("Tipo de estrategia: " + tipoEstrategia);
        System.out.println("Duracion: " + duracion + " horas");
    }

    public void calcularDuracion(){
        System.out.println("La duracion del videojuego es: " + this.duracion + " horas");
    }

}
