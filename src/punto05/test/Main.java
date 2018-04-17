package punto05.test;

import java.util.Scanner;
import punto05.util.CirculoUtil;

public class Main {

    public static void main(String[] args) {
        /*CirculoUtil circulo = new CirculoUtil();
        circulo.registrarCirculos();
        circulo.mostrarCirculos();*/
        Scanner sca = new Scanner(System.in);
        boolean continuo = true;
        String opcion = "";
        do {
            System.out.println("------------------------------------");
            System.out.println("----------------MENU----------------");
            System.out.println("1- Agregar Circulos");
            System.out.println("2- Mostrar Circulos");
            System.out.println("3- Salir");
            System.out.println("----------------------------------------   ");
            CirculoUtil circulo = new CirculoUtil();
            do {
                System.out.print("Ingrese Una Opción: ");
                opcion = sca.nextLine();
                if ((opcion.matches("[1-3]") == false)) {
                    System.out.println("Error: Ingrese Opcion Correcta [1-2-3]");
                }

            } while (!(opcion.matches("[123]")));

            switch (opcion) {
                case "1":

                    circulo.registrarCirculos();
                    break;
                case "2":
                    circulo.mostrarCirculos();
                    break;
                case "3":
                    continuo = false;
                    break;
            }
        } while (continuo);
    }
}