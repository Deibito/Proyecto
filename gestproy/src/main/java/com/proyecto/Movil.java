package com.proyecto;

public class Movil implements Plataforma{

    private String sistemaOperativo;
    private int bateria;
    private boolean notificaciones;

    public Movil (String sistemaOperativo, int bateria, boolean notificaciones) {
        this.sistemaOperativo = sistemaOperativo;
        this.bateria = bateria;
        this.notificaciones = notificaciones;
    }
    
    public String getSistemaOperativo(){
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public boolean isNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(boolean notificaciones) {
        this.notificaciones = notificaciones;
    }

    public void controlarNotificaciones(){
        System.out.println("Notificaciones del movil");
        
    }

    @Override
    public void iniciar() {
        
    }

    @Override
    public void detener() {
        
    }

    @Override
    public void conectarRed() {
        
    }

    @Override
    public void desconectarRed() {
        
    }
    
}
