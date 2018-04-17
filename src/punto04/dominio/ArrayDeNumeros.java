
package punto04.dominio;

import java.util.Scanner;


public class ArrayDeNumeros {
    
  Scanner entrada = new Scanner(System.in);  
  private int numeros[] = new int [10];

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public ArrayDeNumeros() {
    }
    /*Metodo que carga el array por teclado*/
  public void ingresarNumeros(){
      for(int i=0; i<numeros.length; i++){
          System.out.print("Ingresar el Numero["+i+"]: ");
          numeros[i] = entrada.nextInt();
      }
  }
   /*Metodo que visualiza el array */
public void mostrarNumeros(){
        System.out.println("--------------------------------------------------");
        for(int i=0;i<numeros.length;i++){
            System.out.println("En el indice "+i+" esta el número "+numeros[i]);
        }
    }

/*Metodos que realizan los calculos pedidos: Mayor, Menor, Promedio*/
    public int obtenerMayor(){
        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        return mayor;
    }
    
    public int obtenerMenor(){
        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        return menor;
    }
    
    public double obtenerPromedio(){
        int aux=0;
        for (int i = 0; i < numeros.length; i++) {
             aux = aux + numeros[i];
        }
        return  aux/numeros.length;
    }
    
}
