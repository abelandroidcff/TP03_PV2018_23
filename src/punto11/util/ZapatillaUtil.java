package punto11.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import punto11.dominio.Zapatilla;

public class ZapatillaUtil {

    private List<String> listadoZapatillasOficiales;
    private List<Zapatilla> listaZapatillas;

    public ZapatillaUtil() {
        listadoZapatillasOficiales = new ArrayList<>();
        listaZapatillas = new ArrayList<>();
    }

    /**
     * Metodo que carga datos de zapatillas por consola.
     */
    public void cargarZapatillas() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingrese cantidad de zapatillas a cargar: ");
        int cantidad = scn.nextInt();
        for (int i = 0; i < cantidad; i++) {
            Zapatilla zapatilla = new Zapatilla();
            Scanner dato = new Scanner(System.in);
            System.out.print("Nombre Calzado: ");
            zapatilla.setMarca(dato.nextLine());
            zapatilla.setCalidad(true);
            listaZapatillas.add(zapatilla);
        }
    }

    /**
     * Metodo que verifica la autenticidad de los datos ingresados en el metodo
     * cargarZapatillas().
     */
    public void compararMarcas() {
        listadoZapatillasOficiales.add("adidas");
        listadoZapatillasOficiales.add("nike");
        listadoZapatillasOficiales.add("reebok");
        listadoZapatillasOficiales.add("puma");
        listadoZapatillasOficiales.add("vans");
        listadoZapatillasOficiales.add("converse");
        listadoZapatillasOficiales.add("john foos");
        listadoZapatillasOficiales.add("wilson");
        listadoZapatillasOficiales.add("umbro");
        listadoZapatillasOficiales.add("dunlop");
        listadoZapatillasOficiales.add("fila");
        listadoZapatillasOficiales.add("joma");
        listadoZapatillasOficiales.add("kappa");
        for (int i = 0; i < listaZapatillas.size(); i++) {
            if (!listadoZapatillasOficiales.contains(listaZapatillas.get(i).getMarca().toLowerCase())) {
                listaZapatillas.get(i).setCalidad(false);
            }
        }
    }

    /**
     * Muestra una tabla con los resultados de los datos ingresados por consola.
     */
    public void mostrarTablaVerificada() {
        System.out.println("\n_____________LISTADO_____________");
        System.out.println("NOMBRE\t\tMARCA");
        String marca;
        for (int i = 0; i < listaZapatillas.size(); i++) {
            if (listaZapatillas.get(i).isCalidad() == true) {
                marca = "Original";
            } else {
                marca = "Copia";
            }
            System.out.println(listaZapatillas.get(i).getMarca() + "\t\t" + marca);
        }
    }

    public List<String> getListadoZapatillasOficiales() {
        return listadoZapatillasOficiales;
    }

    public void setListadoZapatillasOficiales(List<String> listadoZapatillasOficiales) {
        this.listadoZapatillasOficiales = listadoZapatillasOficiales;
    }

    public List<Zapatilla> getListaZapatillas() {
        return listaZapatillas;
    }

    public void setListaZapatillas(List<Zapatilla> listaZapatillas) {
        this.listaZapatillas = listaZapatillas;
    }
}
