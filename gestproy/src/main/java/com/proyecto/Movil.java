package com.proyecto;

public class Movil implements Plataforma {

    private String modelo;
    private String bateria;
    private boolean notificaciones;

    public Movil(String modelo, String bateria, boolean notificaciones) {
        this.modelo = modelo;
        this.bateria = bateria;
        this.notificaciones = notificaciones;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isNotificaciones() {
        return notificaciones;
    }

    public void verDetalles(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Bateria: " + bateria);
        if (notificaciones = true) {
            System.out.println("Las notificaciones estan activadas");
        } else {
            System.out.println("Las notificaciones estan desactivadas");
        }
    }

    public void controlarNotificaciones() {
        System.out.println("Notificaciones del movil");
        if (notificaciones = true) {
            System.out.println("Las notificaciones estan activadas");
        } else {
            System.out.println("Las notificaciones estan desactivadas");
        }
    }

    @Override
    public void iniciar() {
        System.out.println("Su teléfono móvil está encendido");
        System.out.println("Bienvenido al móvil " + this.modelo);
    }

    @Override
    public void detener() {
        System.out.println("El móvil se está apagando");
    }

    @Override
    public void conectarRed() {
        System.out.println("Obteniendo dirección IP");
        System.out.println("...");
        System.out.println("Conectado sin internet");
        System.out.println("Conectado");
    }

    @Override
    public void desconectarRed() {
        System.out.println("Desconectando wifi");
    }

}
