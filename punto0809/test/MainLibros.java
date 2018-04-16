/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto0809.test;

import java.util.Scanner;
import punto0809.modelo.Libro;
import punto0809.util.ListaLibros;

/**
 * Programación Visual - APU
 * @author Ariel Mamaní - LU3051 - Grupo 23
 */
public class MainLibros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);        
        ListaLibros libros = new ListaLibros();
        String respuesta;
        
        do{
            Libro unLibro = new Libro();
            
            System.out.println("Registrar un libro");
            System.out.print("ISBN N°: ");
            unLibro.setIsbn(teclado.nextInt());
            System.out.print("Título: ");
            unLibro.setTitulo(teclado.nextLine());
            System.out.print("Autor: ");
            unLibro.setAutor(teclado.nextLine());
            System.out.print("Precio: $ ");
            unLibro.setPrecio(teclado.nextDouble());
            
            libros.agregarLibro(unLibro);
            
            for(Libro circulo: libros.getLibros()){
                System.out.println("ISBN: " + circulo.getIsbn());
                System.out.println("Título: " + circulo.getTitulo());
                System.out.println("Autor: " + circulo.getAutor());
                System.out.println("Precio: $ " + circulo.getPrecio());
                System.out.println();
            }            
            
            System.out.print("Desea seguir registrando libro? (S/N): ");
            respuesta = teclado.next();            
            
        }while("S".equals(respuesta.toUpperCase()));        
        
    }
    
}
