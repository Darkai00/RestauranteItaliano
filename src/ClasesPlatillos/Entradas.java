/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesPlatillos;

/**
 *
 * @author alepe
 */
public class Entradas extends Comida{
    private String tipoPlato;
    private String tamañoPorcion;

    public Entradas(String tipoPlato, String tamañoPorcion, String nombre, String temperatura, String ingredientes, String tipoComida, short calorias, short tiempoPreparacion) {
        super(nombre, temperatura, ingredientes, tipoComida, calorias, tiempoPreparacion);
        this.tipoPlato = tipoPlato;
        this.tamañoPorcion = tamañoPorcion;
    }

    

    public String getTipoPlato() {
        return tipoPlato;
    }

    public void setTipoPlato(String tipoPlato) {
        this.tipoPlato = tipoPlato;
    }

    public String getTamañoPorcion() {
        return tamañoPorcion;
    }

    public void setTamañoPorcion(String tamañoPorcion) {
        this.tamañoPorcion = tamañoPorcion;
    }

    @Override
    public String toString() {
        return "Entradas{" + "tipoPlato=" + tipoPlato + ", tama\u00f1oPorcion=" + tamañoPorcion + '}';
    }
    
    
}
