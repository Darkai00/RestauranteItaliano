/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesPlatillos;

/**
 *
 * @author alepe
 */
public class Postres extends Comida{
    private String tipoPostre;
    private String tamanioPorcion;
    private String nivelDulzura;
    private String acompaniamiento;

    public Postres(String tipoPostre, String tamanioPorcion, String nivelDulzura, String acompaniamiento, String nombre, String temperatura, String ingredientes, String tipoComida, short calorias, short tiempoPreparacion) {
        super(nombre, temperatura, ingredientes, tipoComida, calorias, tiempoPreparacion);
        this.tipoPostre = tipoPostre;
        this.tamanioPorcion = tamanioPorcion;
        this.nivelDulzura = nivelDulzura;
        this.acompaniamiento = acompaniamiento;
    }

    public String getTipoPostre() {
        return tipoPostre;
    }

    public void setTipoPostre(String tipoPostre) {
        this.tipoPostre = tipoPostre;
    }

    public String getTamanioPorcion() {
        return tamanioPorcion;
    }

    public void setTamanioPorcion(String tamanioPorcion) {
        this.tamanioPorcion = tamanioPorcion;
    }

    public String getNivelDulzura() {
        return nivelDulzura;
    }

    public void setNivelDulzura(String nivelDulzura) {
        this.nivelDulzura = nivelDulzura;
    }

    public String getAcompaniamiento() {
        return acompaniamiento;
    }

    public void setAcompaniamiento(String acompaniamiento) {
        this.acompaniamiento = acompaniamiento;
    }

    @Override
    public String toString() {
        return "Postres{" + "tipoPostre=" + tipoPostre + ", tamanioPorcion=" + tamanioPorcion + ", nivelDulzura=" + nivelDulzura + ", acompaniamiento=" + acompaniamiento + '}';
    }
    
    
}
