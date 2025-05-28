package com.proyecto;

public class Jugador {

    private String nombre;
    private String id;
    private int nivelCuenta;

    public Jugador(String nombre, String id, int nivelCuenta) {
        this.nombre = nombre;
        this.id = id;
        this.nivelCuenta = nivelCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public int getNivelCuenta() {
        return nivelCuenta;
    }

    public void muestraPerfil() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Nivel de la cuenta: " + nivelCuenta);
    }

    public void aumentarNivel() {
        nivelCuenta++;
        System.out.println("Has subido de nivel, tu nivel actual es " + nivelCuenta);
    }
}
