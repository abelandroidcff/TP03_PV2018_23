
package punto06.test;

import java.util.Scanner;
import punto06.dominio.Rectangulo;
import punto06.util.ArregloDeRectangulos;


public class Main {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Rectangulo r1 = new Rectangulo(3.4, 2.0, 5,7);
        Rectangulo r2 = new Rectangulo(5.4, 2, 6, 7);
        Rectangulo r3 = new Rectangulo(3.0, 5.6, 10, 5);
        Rectangulo r4 = new Rectangulo(5, 4, 6, 2);
        Rectangulo r5 = new Rectangulo(0, 4.0, 6, 4);
        Rectangulo r6 = new Rectangulo(5, 1.4, 6, 8);
        Rectangulo r7 = new Rectangulo(10, 5.0, 6,8);
        Rectangulo r8 = new Rectangulo(1.4, 3, 7, 8);
        Rectangulo r9 = new Rectangulo(2.5, 3.4, 4, 12);
        Rectangulo r10 = new Rectangulo(0, 0, 12, 1);
        Rectangulo r11 = new Rectangulo(3, 2.0, 7, 9);
        Rectangulo r12 = new Rectangulo(10, 5, 6.5, 11.2);

       
        ArregloDeRectangulos arregloR = new ArregloDeRectangulos();
        arregloR.agregarRectangulo(r1);
        arregloR.agregarRectangulo(r2);
        arregloR.agregarRectangulo(r3);
        arregloR.agregarRectangulo(r4);
        arregloR.agregarRectangulo(r5);
        arregloR.agregarRectangulo(r6);
        arregloR.agregarRectangulo(r7);
        arregloR.agregarRectangulo(r8);
        arregloR.agregarRectangulo(r9);
        arregloR.agregarRectangulo(r10);
        arregloR.agregarRectangulo(r11);
        arregloR.agregarRectangulo(r12);
        
       arregloR.mostrarRectangulos();
       int posicion=0;
        System.out.print("Ingrese la posicion del Rectangulo a borrar: ");   
        posicion = entrada.nextInt();
        if (posicion>=0 && posicion <12){
        System.out.println("Valores del Rectangulo a borrar: ");
        arregloR.mostrarRectanguloBorrado(posicion);
        arregloR.borrarRectangulo(posicion);
        arregloR.mostrarRectangulos();
        }else
            System.out.println("Error: numero fuera de rango");   
        }   
}