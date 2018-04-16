package punto12.util;

import java.util.ArrayList;
import java.util.Scanner;
import punto12.dominio.Libro;

public class Busqueda {

    public void mostrarCategorias() {
        System.out.println("______________CATEGORIAS______________");
        CategoriaUtil categoria = new CategoriaUtil();
        ArrayList<String> listaCategorias = new ArrayList<>();
        listaCategorias = categoria.getCategorias();
        for (int i = 0; i < listaCategorias.size(); i++) {
            System.out.println(listaCategorias.get(i));
        }
    }

    public void realizarBusqueda() {
        Scanner scn = new Scanner(System.in);
        CategoriaUtil categoria = new CategoriaUtil();
        LibroUtil libro = new LibroUtil();
        int opcion;
        int contador = 0;
        String nombreCategoria;
        String nombreLibro;
        System.out.println("\n______________BUSQUEDA______________");
        System.out.println("1) Por Categoria");
        System.out.println("2) Por Titulo");
        System.out.println("3) Por Categoria y Titulo");
        System.out.print("Ingrese el modo de busqueda(nro): ");
        opcion = scn.nextInt();
        switch (opcion) {
            case 1:
                Scanner entradaCategoria = new Scanner(System.in);
                System.out.print("\nIngrese nombre Categoria: ");
                nombreCategoria = entradaCategoria.nextLine().toLowerCase();
                if (categoria.getCategorias().contains(nombreCategoria)) {
                    for (Libro libros : libro.getArrayLibros()) {
                        if (libros.getCategoria().equals(nombreCategoria)) {
                            System.out.println(libros.getNombre());
                            contador++;
                        }
                    }
                    if (contador == 0) {
                        System.out.println("\nNO SE CARGARON LIBROS PARA LA CATEGORIA INGRESADA.");
                    }
                } else {
                    System.out.println("\nLA CATEGORIA INGRESADA NO EXISTE.");
                }
                break;
            case 2:
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
                break;
            case 3:
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
                break;
            default:
                System.out.println("\nNOTA: La opcion ingresada no es correcta.");
                break;
        }
    }
}
