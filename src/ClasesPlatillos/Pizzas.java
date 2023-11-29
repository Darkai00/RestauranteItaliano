/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesPlatillos;

/**
 *
 * @author alepe
 */
public class Pizzas extends Comida{
    private String tamano;
    private String tipoMasa;
    private String salsa;
    private boolean hayEspecial;

    public Pizzas(String tamano, String tipoMasa, String salsa, boolean hayEspecial, String nombre, String temperatura, String ingredientes, String tipoComida, short calorias, short tiempoPreparacion) {
        super(nombre, temperatura, ingredientes, tipoComida, calorias, tiempoPreparacion);
        this.tamano = tamano;
        this.tipoMasa = tipoMasa;
        this.salsa = salsa;
        this.hayEspecial = hayEspecial;
    }

    

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getTipoMasa() {
        return tipoMasa;
    }

    public void setTipoMasa(String tipoMasa) {
        this.tipoMasa = tipoMasa;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public boolean isHayEspecial() {
        return hayEspecial;
    }

    public void setHayEspecial(boolean hayEspecial) {
        this.hayEspecial = hayEspecial;
    }

    @Override
    public String toString() {
        return "Pizzas{" + "tamano=" + tamano + ", tipoMasa=" + tipoMasa + ", salsa=" + salsa + ", hayEspecial=" + hayEspecial + '}';
    }
    
    
}
