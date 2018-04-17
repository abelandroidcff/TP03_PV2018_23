package punto05.util;

import java.util.ArrayList;
import java.util.Scanner;
import punto05.dominio.Circulo;

public class CirculoUtil {

    Scanner scanner = new Scanner(System.in);
    /*private ArrayList<Circulo> listaCirculos;*/

    private ArrayList<Circulo> listaCirculos = new ArrayList();

    public CirculoUtil() {
    }

    public ArrayList<Circulo> getListaCirculos() {
        return listaCirculos;
    }

    public void setListaCirculos(ArrayList<Circulo> listaCirculos) {
        this.listaCirculos = listaCirculos;
    }

    public void registrarCirculos() {
        Circulo circulo = new Circulo();
        System.out.print("Ingrese Coordenada x del Circulo: ");
        circulo.setX(scanner.nextDouble());

        System.out.print("ingrese Coordenada y del circulo: ");
        circulo.setY(scanner.nextDouble());

        System.out.print("Ingrese el Radio del Circulo: ");
        circulo.setRadio(scanner.nextDouble());

        listaCirculos.add(circulo);
    }

    public void mostrarCirculos() {
        System.out.println("              CIRCULOS             ");
        System.out.println("----------------------------------------------");
        System.out.println("Coordenadas           Radio         Superficie");

        for (int i = 0; i < listaCirculos.size(); i++) {
            double auxiliarSuperficie = listaCirculos.get(i).obtenerSuperficie();
            /* System.out.println("("+listaCirculos.get(i).getX()+","+ listaCirculos.get(i).getY())+")"+"    "+listaCirculos.get(i).getRadio()+"    " + auxiliarSuperficie);*/
            System.out.println("(" + listaCirculos.get(i).getX() + "," + listaCirculos.get(i).getY() + ")" + ")" + "            " + listaCirculos.get(i).getRadio() + "           " + auxiliarSuperficie);
        }
        System.out.println("");
    }
}