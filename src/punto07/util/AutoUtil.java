package punto07.util;

import java.util.Scanner;
import punto07.dominio.Auto;

public class AutoUtil {

    private Auto[] listaAutos;

    public AutoUtil() {
        listaAutos = new Auto[6];
    }

    /**
     * Metodo que carga una tabla precargada de autos a un arreglo de tipo Auto.
     */
    public void cargarAuto() {
        listaAutos[0] = new Auto("GOL 123", "hundai", "553", "rojo", "nafta");
        listaAutos[1] = new Auto("SDE 444", "ferrari", "147", "gris", "diesel");
        listaAutos[2] = new Auto("AVG 777", "renault", "018", "blanco", "gasoil");
        listaAutos[3] = new Auto("HLT 212", "peugeot", "207", "verde", "nafta");
        listaAutos[4] = new Auto("JKD 666", "nissan", "223", "negro", "diesel");
        listaAutos[5] = new Auto("SQL 999", "toyota", "897", "azul", "gasoil");
    }

    /**
     * Metodo que imprime por consola todo el contenido del arreglo listaAutos.
     */
    public void mostrarAuto() {
        System.out.println("__________________LISTADO AUTOS__________________");
        for (int i = 0; i < listaAutos.length; i++) {
            System.out.println((i + 1) + ")" + " PATENTE: " + listaAutos[i].getPatente()
                    + "\nMARCA: " + listaAutos[i].getMarca()
                    + "\nMODELO: " + listaAutos[i].getModelo()
                    + "\nCOLOR: " + listaAutos[i].getColor()
                    + "\nCOMBUSTBLE: " + listaAutos[i].getTipoCombustible() + "\n");
        }
    }

    /**
     * Metodo encargado de editar un auto guiandose por el indice pasado por
     * parametro.
     *
     * @param dato
     */
    public void editarAuto(int dato) {
        int indice = dato - 1;
        String patente, marca, modelo, color, combustible;
        Scanner nuevo = new Scanner(System.in);
        System.out.print("\nPATENTE ACTUAL: " + listaAutos[indice].getPatente() + "\t\tNUEVO: ");
        patente = nuevo.nextLine();
        System.out.print("MARCA ACTUAL: " + listaAutos[indice].getMarca() + "\t\tNUEVO: ");
        marca = nuevo.nextLine().toLowerCase();
        System.out.print("MODELO ACTUAL: " + listaAutos[indice].getModelo() + "\t\tNUEVO: ");
        modelo = nuevo.nextLine();
        System.out.print("COLOR ACTUAL: " + listaAutos[indice].getColor() + "\t\tNUEVO: ");
        color = nuevo.nextLine();
        System.out.print("COMBUSTIBLE ACTUAL: " + listaAutos[indice].getTipoCombustible() + "\tNUEVO: ");
        combustible = nuevo.nextLine();
        listaAutos[indice].setPatente(patente);
        listaAutos[indice].setMarca(marca);
        listaAutos[indice].setModelo(modelo);
        listaAutos[indice].setColor(color);
        listaAutos[indice].setTipoCombustible(combustible);
        System.out.println("");
    }

    /**
     * Metodo que muestra por consola el menu "Editar".
     */
    public void mostrarMenuEditar() {
        try {
            Scanner scn = new Scanner(System.in);
            int dato;
            System.out.println("\n___________________EDITAR AUTO___________________");
            System.out.print("\nPor favor elija un auto para editar(numero): ");
            dato = scn.nextInt();
            switch (dato) {
                case 1:
                    editarAuto(dato);
                    mostrarAuto();
                    break;
                case 2:
                    editarAuto(dato);
                    mostrarAuto();
                    break;
                case 3:
                    editarAuto(dato);
                    mostrarAuto();
                    break;
                case 4:
                    editarAuto(dato);
                    mostrarAuto();
                    break;
                case 5:
                    editarAuto(dato);
                    mostrarAuto();
                    break;
                case 6:
                    editarAuto(dato);
                    mostrarAuto();
                    break;
                default:
                    System.out.println("La opcion ingresada no es correcta!");
            }
        } catch (Exception e) {
            System.out.println("La opcion ingresada no es correcta!");
        }

    }

    public Auto[] getListaAutos() {
        return listaAutos;
    }

    public void setListaAutos(Auto[] listaAutos) {
        this.listaAutos = listaAutos;
    }
}
