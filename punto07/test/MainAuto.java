/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto07.test;

import java.util.Scanner;
import punto07.dominio.Auto;
import punto07.util.ArregloAuto;

/**
 *
 * @author ArielG
 */
public class MainAuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        Scanner ingreso = new Scanner(System.in);        
        
        Auto autoNro1 = new Auto("ABC 123", "Alfa Romeo", "Giula", "blanco", "nafta");
        Auto autoNro2 = new Auto("NRC 111", "BMW", "Serie 7", "rojo", "nafta");
        Auto autoNro3 = new Auto("AGM 488", "Peugeot", "4008", "azul", "diesel");
        Auto autoNro4 = new Auto("AA 123 AD", "Ferrari", "F12", "rojo", "nafta");
        Auto autoNro5 = new Auto("AA 999 XZ", "Toyota", "GT86", "blanco", "nafta");
        Auto autoNro6 = new Auto("AB 321 JY", "Renault", "Fluence", "verde", "diesel");
        Auto autoNro7 = new Auto("AA 456 TF", "Ford", "Mondeo", "verde", "gnc");
        Auto autoNro8 = new Auto("AB 010 TU", "Fiat", "Fiorino", "azul", "gnc");
        Auto autoNro9 = new Auto("AB 999 BA", "Volkswagen", "Polo", "negro", "diesel");
        Auto autoNro10 = new Auto("AB 001 MI", "Chevrolet", "Camaro", "blanco", "nafta");
               
        ArregloAuto listaDeAuto = new ArregloAuto(10);
        listaDeAuto.getArreglo()[0] = autoNro1;
        listaDeAuto.getArreglo()[1] = autoNro2;
        listaDeAuto.getArreglo()[2] = autoNro3;
        listaDeAuto.getArreglo()[3] = autoNro4;
        listaDeAuto.getArreglo()[4] = autoNro5;
        listaDeAuto.getArreglo()[5] = autoNro6;
        listaDeAuto.getArreglo()[6] = autoNro7;
        listaDeAuto.getArreglo()[7] = autoNro8;
        listaDeAuto.getArreglo()[8] = autoNro9;
        listaDeAuto.getArreglo()[9] = autoNro10;        
        
        listaDeAuto.verArreglo();
        
        System.out.print("Para cambiar datos de un auto ingrese patente: ");
        String nroPatente = ingreso.nextLine();
        if(listaDeAuto.buscarAuto(nroPatente)> 1)
            listaDeAuto.cambiarDato(listaDeAuto.buscarAuto(nroPatente));
        else
            System.out.println("Error. Patente no encontrada");
        
        listaDeAuto.verArreglo();
    }
    
}
