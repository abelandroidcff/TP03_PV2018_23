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

    private double x;
    private double y;
    private double base;
    private double altura;

    public Rectangulo(double x, double y, double base, double altura) {
        this.x = x;
        this.y = y;
        this.base = base;
        this.altura = altura;
    }

    public void obtenerPuntosDelRectangulo() {

    }

    public double obtenerPerimetroRectangulo() {

        return 2 * base + 2 * altura;
    }

    public double obtenerSuperficieRectangulo() {
        return base * altura;
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    /* Metodos que calculan los tres vertices restantes del Rectangulo*/
    public double verticeDosX() {
        return x + base;

    }

    public double verticeDosY() {
        return y;

    }

    public double verticeTresX() {
        return x + base;

    }

    public double verticeTresY() {
        return y + altura;

    }

    public double verticeCuatroX() {
        return x;

    }

    public double verticeCuatroY() {
        return y + altura;
    }

}
