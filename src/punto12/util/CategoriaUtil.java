package punto12.util;

import java.util.ArrayList;
import java.util.List;

public class CategoriaUtil {

    private List<String> categorias;

    public CategoriaUtil() {
        categorias = new ArrayList<>();
    }

    public List<String> getCategorias() {
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

    public void setCategorias(List<String> categorias) {
        this.categorias = categorias;
    }
}
