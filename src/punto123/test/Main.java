/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto123.test;

import punto1.dominio.Punto;
import punto2.dominio.Rectangulo;

/**
 *
 * @author abel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 01
        Punto punto1= new Punto(1,2);
        Punto punto2= new Punto(3,4);
        System.out.println("-------------Punto 1 ------------------------------");
        System.out.println("La distancia entre el Punto 1 y el Punto 2 es: "+ punto1.calcularDistanciaEntrePuntos(punto2));
    
        // 02
        System.out.println("-------------Punto 2-------------------------------");
        Rectangulo unRectangulo= new Rectangulo(1,3,6,4);
        System.out.println("El perimetro es: "+ unRectangulo.obtenerPerimetroRectangulo());
        System.out.println("La Superficie es: "+ unRectangulo.obtenerSuperficieRectangulo());
        
        // 03
    
}
        
        
        
        
    
    
}
