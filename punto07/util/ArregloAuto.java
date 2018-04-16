/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto07.util;

import java.util.Scanner;
import punto07.dominio.Auto;

/**
 *
 * @author ArielG
 */
public class ArregloAuto {
    private Auto[] arreglo;
    
    public ArregloAuto() {
        arreglo = new Auto[10];
    }
    
    public ArregloAuto(Auto[] arreglo){
        this.arreglo = arreglo;
    }
    
    public ArregloAuto(int tamanioArreglo){
        arreglo = new Auto[tamanioArreglo];
    }
    
    public void verArreglo(){
        for(int i=0;i < arreglo.length;i++){
            if(arreglo[i] != null){
                Auto unAuto = arreglo[i];
                System.out.println("Auto N° " + (i+1) + ": " + unAuto.toString());
            }else
                System.out.println("No existe un cuadrado en la posición "+i);
        }
    }
    
    public int buscarAuto(String unaPatente){
        int encontrado = -1;
        for(int i=0; i<arreglo.length; i++){
            if(unaPatente.equals(arreglo[i].getPatente()))
                encontrado = i;
        }
        return encontrado;
    }
    
    public void cambiarDato(int posicion){
        Scanner teclado = new Scanner(System.in);
        for(int i=0; i<arreglo.length; i++){
            if(posicion == i){
                System.out.print("Patente: ");
                arreglo[i].setPatente(teclado.nextLine());
                System.out.print("Marca: ");
                arreglo[i].setMarca(teclado.nextLine());
                System.out.print("Modelo: ");
                arreglo[i].setModelo(teclado.nextLine());
                System.out.print("Color: ");
                arreglo[i].setColor(teclado.nextLine());
                System.out.print("Combustible: ");
                arreglo[i].setCombustible(teclado.nextLine());
            }
        }
    }
    
    /**
     * @return the arreglo
     */
    public Auto[] getArreglo() {
        return arreglo;
    }

    /**
     * @param arreglo the arreglo to set
     */
    public void setArreglo(Auto[] arreglo) {
        this.arreglo = arreglo;
    }
   
}
