/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto03.test;

import punto03.dominio.Triangulo;

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
        //Se crea un objeto de la clase triangulo y se envia los datos por parametros
        Triangulo unTriangulo= new Triangulo(1,1,5);
        //Metodo que verifica si se introduzco valores para formar un triangulo
        unTriangulo.verificarTriangulo();
        //Se obtiene el perimetro del triangulo ingresado
        System.out.println("El perimetro del triangulo es: "+ unTriangulo.obtenerPerimetroTriangulo());
        
    }
}
