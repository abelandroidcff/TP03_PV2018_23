package punto10.util;

import java.text.DecimalFormat;
import java.util.Scanner;
import punto10.dominio.Producto;
import punto10.dominio.Venta;

public class TransaccionUtil {

    private Venta[] listado;

    public void realizarTransaccion() {
        int cantidadVenta;
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingrese cantidad de productos a comprar: ");
        cantidadVenta = scn.nextInt();
        listado = new Venta[cantidadVenta];
        for (int i = 0; i < cantidadVenta; i++) {
            Venta venta = new Venta();
            Producto producto = new Producto();
            Scanner datos = new Scanner(System.in);
            System.out.println("\nPRODUCTO 0" + (i + 1));
            System.out.print("Ingrese nombre del producto: ");
            producto.setNombre(datos.nextLine());
            System.out.print("Ingrese precio del producto: $");
            producto.setPrecioUnitario(datos.nextDouble());
            System.out.print("Ingrese cantidad de cuotas: ");
            venta.setCuota(datos.nextInt());
            producto.setCodigo(800000080 + i);
            venta.setProducto(producto);
            listado[i] = venta;
        }
    }

    public void mostrarPlanDeCuotas(double precio, int cantidad) {
        DecimalFormat df = new DecimalFormat("0.00");
        double precioCuota = precio / cantidad;
        double precioCuotaInteres;
        double precioTotal = 0;
        double interes = 0.015;
        for (int i = 0; i < cantidad; i++) {
            if (i == 0) {
                precioCuotaInteres = precioCuota;
                System.out.println("Cuota N°" + (i + 1) + ": " + df.format(precioCuotaInteres));
            } else {
                precioCuotaInteres = precioCuota + (precioCuota * interes);
                System.out.println("Cuota N°" + (i + 1) + ": " + df.format(precioCuotaInteres));
                interes += 0.015;
            }
            precioTotal += precioCuotaInteres;
        }
        System.out.println("TOTAL: $" + df.format(precioTotal));
    }

    public void mostrarListadoVentas() {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("\n______________RESUMEN______________");
        for (int i = 0; i < listado.length; i++) {
            System.out.println("\nPRODUCTO 0" + (i + 1) + "\nCodigo: " + listado[i].producto.getCodigo()
                    + "\nNombre: " + listado[i].producto.getNombre()
                    + "\nPrecio: $" + df.format(listado[i].producto.getPrecioUnitario())
                    + "\nCant.Cuotas: " + listado[i].cuota);
            mostrarPlanDeCuotas(listado[i].getProducto().getPrecioUnitario(), listado[i].cuota);
        }
    }

    public Venta[] getListado() {
        return listado;
    }

    public void setListado(Venta[] listado) {
        this.listado = listado;
    }
}
