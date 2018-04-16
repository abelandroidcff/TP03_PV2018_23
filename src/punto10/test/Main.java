package punto10.test;

import punto10.util.Transaccion;

public class Main {
    public static void main(String[] args) {
        Transaccion transaccion = new Transaccion();
        transaccion.realizarTransaccion();
        transaccion.mostrarListadoVentas();
    }
}
