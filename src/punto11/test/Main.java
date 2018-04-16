package punto11.test;

import punto11.util.ZapatillaUtil;

public class Main {
    
    public static void main(String[] args) {
        ZapatillaUtil zapatilla = new ZapatillaUtil();
        zapatilla.cargarZapatillas();
        zapatilla.compararMarcas();
        zapatilla.mostrarTablaVerificada();
    }
}
