package com.proyecto;

public class Videojuego {
    
    public String nombre;
    public float precio;
    public String fechaSalida;
    public String genero;
    public Jugador idJugador;

public Videojuego(String nombre, float precio, String fechaSalida, String genero, Jugador idJugador) {
    this.nombre = nombre;
    this.precio = precio;
    this.fechaSalida = fechaSalida;
    this.genero = genero;
    this.idJugador = idJugador;
}

public String getNombre() {
    return nombre;
}

public float getPrecio() {
    return precio;
}

public String getFechaSalida() {
    return fechaSalida;
}

public String getGenero() {
    return genero;
}

public Jugador getIdJugador() {
    return idJugador;
}

public void setIdJugador(Jugador idJugador) {
    this.idJugador = idJugador;
}

public void mostrarDetalles(){
    System.out.println("Nombre: " + nombre);
    System.out.println("Precio: " + precio);
    System.out.println("Fecha de Salida: " + fechaSalida);
    System.out.println("Genero: " + genero);
    System.out.println("Id del jugador: " + idJugador.getId());
}

public void getPerfilJugador(Jugador j){
    System.out.println("Nombre del Jugador: " + j.getNombre());
    System.out.println("Id del Jugador: " + j.getId());
    System.out.println("Nivel del Jugador: " + j.getNivelCuenta());
}


}