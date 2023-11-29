/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesPlatillos;

/**
 *
 * @author alepe
 */
public class Pastas extends Comida{
    private String tipoPasta;

    public Pastas(String tipoPasta, String nombre, String temperatura, String ingredientes, String tipoComida, short calorias, short tiempoPreparacion) {
        super(nombre, temperatura, ingredientes, tipoComida, calorias, tiempoPreparacion);
        this.tipoPasta = tipoPasta;
    }

    

    public String getTipoPasta() {
        return tipoPasta;
    }

    public void setTipoPasta(String tipoPasta) {
        this.tipoPasta = tipoPasta;
    }

    @Override
    public String toString() {
        return "Pastas{" + "tipoPasta=" + tipoPasta + '}';
    }
    
    
}
