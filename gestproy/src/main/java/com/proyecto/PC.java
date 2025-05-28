package com.proyecto;

public class PC implements Plataforma {

    private String sistemaOperativo;
    private String procesador;
    private String ram;

    public PC(String sistemaOperativo, String procesador, String ram) {
        this.sistemaOperativo = sistemaOperativo;
        this.procesador = procesador;
        this.ram = ram;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void verificarRequisitos() {
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
