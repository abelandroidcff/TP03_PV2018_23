package punto12.util;

import java.util.ArrayList;
import java.util.Scanner;
import punto12.dominio.Libro;

public class Busqueda {

    /**
     * Metodo que muestra por consola todas las categorias existentes.
     */
    public void mostrarCategorias() {
        System.out.println("______________CATEGORIAS______________");
        CategoriaUtil categoria = new CategoriaUtil();
        ArrayList<String> listaCategorias = new ArrayList<>();
        listaCategorias = categoria.getCategorias();
        for (int i = 0; i < listaCategorias.size(); i++) {
            System.out.println(listaCategorias.get(i));
        }
    }

    /**
     * Metodo con estructura de menu que se encarga de realizar la busqueda de
     * un libro.
     */
    public void realizarBusqueda() {
        Scanner scn = new Scanner(System.in);
        int opcion;
        System.out.println("\n______________BUSQUEDA______________");
        System.out.println("1) Por Categoria");
        System.out.println("2) Por Titulo");
        System.out.println("3) Por Categoria y Titulo");
        System.out.print("Ingrese el modo de busqueda(nro): ");
        opcion = scn.nextInt();
        switch (opcion) {
            case 1:
                buscarPorCategoria();
                break;
            case 2:
                buscarPorTitulo();
                break;
            case 3:
                buscarLibro();
                break;
            default:
                System.out.println("\nNOTA: La opcion ingresada no es correcta.");
                break;
        }
    }

    /**
     * Metodo que busca un libro teniendo en cuenta una lista previa de las
     * categorias precargadas.
     */
    public void buscarPorCategoria() {
        CategoriaUtil categoria = new CategoriaUtil();
        LibroUtil libro = new LibroUtil();
        int contador = 0;
        String nombreCategoria;
        Scanner entradaCategoria = new Scanner(System.in);
        System.out.print("\nIngrese nombre Categoria: ");
        nombreCategoria = entradaCategoria.nextLine().toLowerCase();
        if (categoria.getCategorias().contains(nombreCategoria)) {
            for (Libro libros : libro.getArrayLibros()) {
                if (libros.getCategoria().equals(nombreCategoria)) {
                    System.out.println("\nLibro: " + libros.getNombre()
                            + "\nCategoria: " + libros.getCategoria()
                            + "\nAutor: " + libros.getAutor());
                    contador++;
                }
            }
            if (contador == 0) {
                System.out.println("\nNO SE CARGARON LIBROS PARA LA CATEGORIA INGRESADA.");
            }
        } else {
            System.out.println("\nLA CATEGORIA INGRESADA NO EXISTE.");
        }
    }

    /**
     * Metodo que busca un libro, dentro de un arreglo de libros, por su titulo.
     */
    public void buscarPorTitulo() {
        LibroUtil libro = new LibroUtil();
        int contador = 0;
        String nombreLibro;
        Scanner entradaTitulo = new Scanner(System.in);
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

    /**
     * Metodo que busca un libro por categoria y titulo.
     */
    public void buscarLibro() {
        LibroUtil libro = new LibroUtil();
        int contador = 0;
        String nombreCategoria;
        String nombreLibro;
        Scanner entrada = new Scanner(System.in);
        System.out.print("\nIngrese nombre Categoria: ");
        nombreCategoria = entrada.nextLine().toLowerCase();
        System.out.print("Ingrese titulo del Libro: ");
        nombreLibro = entrada.nextLine().toLowerCase();
        for (Libro libros : libro.getArrayLibros()) {
            if (libros.getCategoria().equals(nombreCategoria) && libros.getNombre().toLowerCase().equals(nombreLibro)) {
                System.out.println("\nLibro: " + libros.getNombre()
                        + "\nCategoria: " + libros.getCategoria()
                        + "\nAutor: " + libros.getAutor());
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("\nEL LIBRO INGRESADO NO EXISTE O LOS DATOS SON ERRONEOS");
        }
    }
}
