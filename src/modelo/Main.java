/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import dominio.punto1.Punto;

/**
 *
 * @author abel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Punto 1
        Punto punto1= new Punto(1,2);
        Punto punto2= new Punto(3,4);
        
        System.out.println("La distancia entre el Punto 1 y el Punto 2 es: "+ punto1.calcularDistanciaEntrePuntos(punto2));
        
    }
    
}
