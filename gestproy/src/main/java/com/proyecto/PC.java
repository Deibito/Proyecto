package com.proyecto;

public class PC implements Plataforma {

    private String modelo;
    private String sistemaOperativo;
    private String procesador;
    private String ram;

    public PC(String modelo, String sistemaOperativo, String procesador, String ram) {
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.procesador = procesador;
        this.ram = ram;
    }

    public String getModelo() {
        return modelo;
    }

    public void verificarRequisitos() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Sistema Operativo: " + sistemaOperativo);
        System.out.println("Procesador: " + procesador);
        System.out.println("Tiene " + ram + " GB de RAM");
    }

    @Override
    public void iniciar() {
        System.out.println("El sistema se ha iniciado correctamente, está listo para usarse");
        System.out.println("Bienvenido a su PC personal");
    }

    @Override
    public void detener() {
        System.out.println("El sistema se ha detenido correctamente");
        System.out.println("Su PC se ha apagado");
    }

    @Override
    public void conectarRed() {
        System.out.println("El PC se ha conectado a la red");
    }

    @Override
    public void desconectarRed() {
        System.out.println("El PC se ha desconectado de la red");
    }
}
