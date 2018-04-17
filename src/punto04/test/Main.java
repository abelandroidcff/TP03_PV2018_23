
package punto04.test;

import punto04.dominio.ArrayDeNumeros;


public class Main {
    
    public static void main(String[] args) {
        ArrayDeNumeros num = new ArrayDeNumeros();
        
        num.ingresarNumeros();
        num.mostrarNumeros();
        System.out.println("--------------------------------------------------");
        System.out.println("Valor Mayor: " + num.obtenerMayor()+ "   Valor Menor: " + num.obtenerMenor() + "    Promedio: " + num.obtenerPromedio());
        System.out.println("--------------------------------------------------");
       
        
    }
}
