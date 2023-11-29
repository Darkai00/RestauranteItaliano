/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesPlatillos;

/**
 *
 * @author alepe
 */
public class Bebidas {
    private short ml;
    private String sabor;
    private String color;
    private boolean EsAlcoholica;

    public Bebidas(short ml, String sabor, String color, boolean EsAlcoholica) {
        this.ml = ml;
        this.sabor = sabor;
        this.color = color;
        this.EsAlcoholica = EsAlcoholica;
    }

    public short getMl() {
        return ml;
    }

    public void setMl(short ml) {
        this.ml = ml;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEsAlcoholica() {
        return EsAlcoholica;
    }

    public void setEsAlcoholica(boolean EsAlcoholica) {
        this.EsAlcoholica = EsAlcoholica;
    }

    @Override
    public String toString() {
        return "Bebidas{" + "ml=" + ml + ", sabor=" + sabor + ", color=" + color + ", EsAlcoholica=" + EsAlcoholica + '}';
    }
    
    
}
