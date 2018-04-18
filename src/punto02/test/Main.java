/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto02.test;

import punto02.dominio.Rectangulo;

/**
 *
 * @author abel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 02
        System.out.println("-------------Punto 2-------------------------------");
        Rectangulo unRectangulo = new Rectangulo(1, 3, 6, 4);
        System.out.println("El perimetro es: " + unRectangulo.obtenerPerimetroRectangulo());
        System.out.println("La Superficie es: " + unRectangulo.obtenerSuperficieRectangulo());
        System.out.println("La Posicion del Vertice(1) ingresado es: " + "("+unRectangulo.getX()+","+ unRectangulo.getY()+")");
        System.out.println("La Posicion del Vertice(2) es: " + "("+unRectangulo.verticeDosX()+","+ unRectangulo.verticeDosY()+")");
        System.out.println("La Posicion del Vertice(3) es: " + "("+unRectangulo.verticeTresX()+","+ unRectangulo.verticeTresY()+")");
        System.out.println("La Posicion del Vertice(4) es: " + "("+unRectangulo.verticeCuatroX()+","+ unRectangulo.verticeCuatroY()+")");
    }
}
