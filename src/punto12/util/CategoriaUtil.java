package punto12.util;

import java.util.ArrayList;

public class CategoriaUtil {

    private ArrayList<String> categorias;

    public CategoriaUtil() {
        categorias = new ArrayList<>();
    }

    public ArrayList<String> getCategorias() {
        categorias = new ArrayList<>();
        categorias.add("informatica");
        categorias.add("novelas");
        categorias.add("drama");
        categorias.add("accion");
        categorias.add("cuentos");
        categorias.add("ciencia");
        categorias.add("matematicas");
        categorias.add("lengua");
        categorias.add("historia");
        categorias.add("documental");
        return categorias;
    }

    public void setCategorias(ArrayList<String> categorias) {
        this.categorias = categorias;
    }
}
