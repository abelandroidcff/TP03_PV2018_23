package punto05.util;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import punto05.dominio.Circulo;

public class CirculoUtil {

    private List<Circulo> circulos;

    public CirculoUtil() {
        circulos = new ArrayList<>();
    }

    /**
     * Metodo que se encarga de cargar un arreglo de circulos.
     */
    public void cargarTablaCirculo() {
        circulos.add(new Circulo("circulo 01", 2.3));
        circulos.add(new Circulo("circulo 02", 1.2));
        circulos.add(new Circulo("circulo 03", 0.8));
        circulos.add(new Circulo("circulo 04", 1.7));
    }

    /**
     * Metodo que recorre el arreglo de circulos.
     */
    public void mostrarTablaCirculos() {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("\n__________LISTA DE CIRCULOS__________");
        for (Circulo arrayCirculo : circulos) {
            System.out.println("\nNOMBRE: " + arrayCirculo.getNombre()
                    + "\nRADIO: " + df.format(arrayCirculo.getRadio())
                    + "\nAREA: " + df.format(arrayCirculo.getSuperficie()));
        }
    }

    /**
     * Metodo que se encarga de crear un nuevo Circulo con datos ingresados por
     * consola.
     */
    public void crearNuevoCirculo() {
        try {
            String nombre;
            double radio;
            Scanner scn = new Scanner(System.in);
            System.out.println("\n__________CREAR NUEVO CIRCULO__________");
            System.out.print("Ingrese nombre del circulo: ");
            nombre = scn.nextLine();
            System.out.print("Ingrese radio del circulo: ");
            radio = scn.nextDouble();
            circulos.add(new Circulo(nombre, radio));
            mostrarTablaCirculos();
        } catch (Exception e) {
            System.out.println("El valor ingresado es incorrecto!");
        }
    }

    public List<Circulo> getCirculos() {
        return circulos;
    }

    public void setCirculos(List<Circulo> circulos) {
        this.circulos = circulos;
    }

}
