/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesPlatillos;

/**
 *
 * @author alepe
 */
public class Comida {
    private String nombre;
    private String temperatura;
    private String ingredientes;
    private String tipoComida;
    private short calorias;
    private short tiempoPreparacion;

    public Comida(String nombre, String temperatura, String ingredientes, String tipoComida, short calorias, short tiempoPreparacion) {
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.ingredientes = ingredientes;
        this.tipoComida = tipoComida;
        this.calorias = calorias;
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    
    
    public String getTemperatura() {
        return temperatura;
    }

    

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public short getCalorias() {
        return calorias;
    }

    public void setCalorias(short calorias) {
        this.calorias = calorias;
    }

    public short getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(short tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    @Override
    public String toString() {
        return "Comida{" + "temperatura=" + temperatura + ", tipoComida=" + tipoComida + ", calorias=" + calorias + ", tiempoPreparacion=" + tiempoPreparacion + '}';
    }
    
    
}
