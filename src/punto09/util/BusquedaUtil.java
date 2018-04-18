package punto09.util;

import java.util.Scanner;
import punto12.dominio.Libro;
import punto12.util.LibroUtil;

public class BusquedaUtil {

    /**
     * Metodo que imprime por pantalla todos los libros existentes.
     */
    public void mostrarLibros() {
        LibroUtil libro = new LibroUtil();
        System.out.println("___________________LIBROS___________________");
        for (Libro libros : libro.getArrayLibros()) {
            System.out.println("Nombre: " + libros.getNombre());
        }
    }

    /**
     * Metodo que busca un libro, dentro de un arreglo de libros, por su titulo.
     */
    public void buscarLibro() {
        LibroUtil libro = new LibroUtil();
        int contador = 0;
        String nombreLibro;
        Scanner entradaTitulo = new Scanner(System.in);
        System.out.println("\n_________________BUSQUEDA____________________");
        System.out.print("\nIngrese nombre Titulo: ");
        nombreLibro = entradaTitulo.nextLine().toLowerCase();
        for (Libro libros : libro.getArrayLibros()) {
            if (libros.getNombre().toLowerCase().equals(nombreLibro)) {
                System.out.println("\nLibro: " + libros.getNombre()
                        + "\nCategoria: " + libros.getCategoria()
                        + "\nAutor: " + libros.getAutor());
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("\nNO SE CARGARON LIBROS CON EL NOMBRE INGRESADO.");
        }
    }

}
