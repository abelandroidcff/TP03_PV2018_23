/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto02.dominio;

/**
 *
 * @author abel
 */
public class Rectangulo {
    private int x;
    private int y;
    private int base;
    private int altura;

    public Rectangulo(int x, int y, int base, int altura) {
        this.x = x;
        this.y = y;
        this.base = base;
        this.altura = altura;
    }
    
   public void obtenerPuntosDelRectangulo(){
       
    }
    public double obtenerPerimetroRectangulo(){
    
        return 2*base + 2* altura;
    }
    public double obtenerSuperficieRectangulo(){
        return base*altura;
    }
    
    

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
     
    
}
