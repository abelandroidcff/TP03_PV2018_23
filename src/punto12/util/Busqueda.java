package punto12.util;

import java.util.Scanner;
import punto12.dominio.Libro;

public class Busqueda {

    /**
     * Metodo que muestra por consola todas las categorias existentes.
     */
    public void mostrarInformacionLibros() {
        System.out.println("______________CATALOGO LIBROS______________");
        LibroUtil libros = new LibroUtil();
        for (Libro listaLibros : libros.getArrayLibros()) {
            System.out.println("[NOMBRE: " + listaLibros.getNombre() + "] "
                    + " [CATEGORIA: " + listaLibros.getCategoria() + "] "
                    + " [AUTOR: " + listaLibros.getAutor() + "]");
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
        System.out.println("3) Por Autor");
        System.out.println("4) Por Categoria y Titulo");
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
                buscarPorAutor();
                break;
            case 4:
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
        System.out.println("\n_______________LIBROS_______________");
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
        System.out.println("\n_______________LIBROS_______________");
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
     * Metodo que busca un libro teniendo en cuenta una lista previa de los
     * autores precargados.
     */
    public void buscarPorAutor() {
        AutorUtil autores = new AutorUtil();
        LibroUtil libro = new LibroUtil();
        int contador = 0;
        String nombreAutor;
        Scanner autor = new Scanner(System.in);
        System.out.print("\nIngrese nombre Autor: ");
        nombreAutor = autor.nextLine().toUpperCase();
        System.out.println("\n_______________LIBROS_______________");
        if (autores.getAutores().contains(nombreAutor)) {
            for (Libro libros : libro.getArrayLibros()) {
                if (libros.getAutor().toUpperCase().equals(nombreAutor)) {
                    System.out.println("\nLibro: " + libros.getNombre()
                            + "\nCategoria: " + libros.getCategoria()
                            + "\nAutor: " + libros.getAutor());
                    contador++;
                }
            }
            if (contador == 0) {
                System.out.println("\nNO SE CARGARON LIBROS CON EL AUTOR INGRESADO.");
            }
        } else {
            System.out.println("\nEL AUTOR INGRESADO NO EXISTE.");
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
        System.out.println("\n_______________LIBROS_______________");
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
