package punto10.test;

import punto10.util.TransaccionUtil;

public class Main {
    public static void main(String[] args) {
        TransaccionUtil transaccion = new TransaccionUtil();
        transaccion.cargarProductos();
        transaccion.mostrarListadoVentas();
    }
}
