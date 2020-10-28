/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos1;

/**
 *
 * @author Karla
 */
public class FIgura {
    private String nombre;
    private double area;
    private float base;
    private int altura;
    
    public FIgura () {
    }

    public FIgura(String nombre, double area, float base, int altura) {
        this.nombre = nombre;
        this.area = area;
        this.base = base;
        this.altura = altura;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
}
