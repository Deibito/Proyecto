package com.proyecto;

public class Jugador {
    
    private String nombre;
    private String id;
    private int nivelCuenta;

public Jugador(String nombre, String id, int nivelCuenta){
    this.nombre = nombre;
    this.id= id;
    this.nivelCuenta = nivelCuenta;
}

public String getNombre(){
    return nombre;
}

public String getId(){
    return id;
}

public int getNivelCuenta(){
    return nivelCuenta;
}

public void muestraPerfil(){
    System.out.println("Nombre: " + nombre);
    System.out.println("ID: " + id);
    System.out.println("Nivel de la cuenta: " + nivelCuenta);
}

public void aumentarNivel(){
    nivelCuenta++;
    System.out.println("Has subido de nivel, tu nivel actual es " + nivelCuenta);
}

public void getVideojuego(){
    Videojuego juego = new Videojuego("UnderTale", 15, "15/09/2015", "Aventura", null);
    System.out.println("Nombre del juego: " + juego.getNombre() + "\n" + 
    "Precio: " + juego.getPrecio() + "\n" + "Fecha de salida: " + juego.getFechaSalida() + "\n" +
    "Género: " + juego.getGenero() + "\n" + "Id del Jugador: " + juego.getIdJugador());
}


}
