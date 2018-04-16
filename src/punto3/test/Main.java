/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3.test;

import punto3.dominio.Triangulo;

/**
 *
 * @author abel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 03
        System.out.println("--------------Punto 3----------------------------");
        Triangulo unTriangulo= new Triangulo(1,1,5);
        unTriangulo.verificarTriangulo();
    }
    
}
