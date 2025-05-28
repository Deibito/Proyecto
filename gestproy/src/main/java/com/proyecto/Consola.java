package com.proyecto;

public class Consola implements Plataforma {

    private String modelo;
    private int almacenamiento;
    private boolean esPortatil;

    public Consola(String modelo, int almacenamiento, boolean esPortatil) {
        this.modelo = modelo;
        this.almacenamiento = almacenamiento;
        this.esPortatil = esPortatil;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public boolean isEsPortatil() {
        return esPortatil;
    }

    public void setEsPortatil(boolean esPortatil) {
        this.esPortatil = esPortatil;
    }

    public void sincronizarMando(){
        System.out.println("Sincronizando mando de la consola " + modelo);
        if (this.esPortatil=true){
            System.out.println("La consola es portatil, no se puede vincular el mando");
        }else{
            System.out.println("El mando se ha vinculado correctamente");
        }
    }

    @Override
    public void iniciar() {
        System.out.println("El sistema se ha iniciado correctamente, está listo para usarse");
        System.out.println("Bienvenido a su consola " + this.modelo);
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
