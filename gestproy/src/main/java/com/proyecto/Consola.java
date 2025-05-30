package com.proyecto;

public class Consola implements Plataforma {

    private String modelo;
    private String almacenamiento;
    private boolean esPortatil;

    public Consola(String modelo, String almacenamiento, boolean esPortatil) {
        this.modelo = modelo;
        this.almacenamiento = almacenamiento;
        this.esPortatil = esPortatil;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isEsPortatil() {
        return esPortatil;
    }

    public void verConsola() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Almacenamiento: " + almacenamiento);
        if (esPortatil = true) {
            System.out.println("Es portatil");
        } else {
            System.out.println("No es portatil");
        }
    }

    public void sincronizarMando() {
        System.out.println("Sincronizando mando de la consola " + modelo);
        if (esPortatil = true) {
            System.out.println("La consola es portatil, no se puede vincular el mando");
        } else {
            System.out.println("El mando se ha vinculado correctamente");
        }
    }

    @Override
    public void iniciar() {
        System.out.println("El sistema se ha iniciado correctamente, está listo para usarse");
        System.out.println("Bienvenido a su consola " + this.modelo);
        System.out.println("Iniciando el juego...");
    }

    @Override
    public void detener() {
        System.out.println("El sistema se ha detenido correctamente");
        System.out.println("Su consola se ha apagado");
    }

    @Override
    public void conectarRed() {
        System.out.println("La consola se ha conectado a la red");
    }

    @Override
    public void desconectarRed() {
        System.out.println("La consola se ha desconectado de la red");
    }

}
