package punto12.util;

import java.util.ArrayList;
import java.util.List;

public class AutorUtil {

    private List<String> autores;

    public AutorUtil() {
        autores = new ArrayList<>();
    }

    public List<String> getAutores() {
        autores.add("GRIMALDI");
        autores.add("CHRISTOPHER DATE");
        autores.add("MARIA ELENA WALSH");
        autores.add("ANTONIO LEPZ");
        autores.add("MURILLO");
        autores.add("MARK TWAIN");
        autores.add("MARTINA WILDNER");
        autores.add("HOSSEINI");
        autores.add("JOHN GREEN");
        autores.add("NACION");
        autores.add("PUERTO DE PALOS");
        autores.add("OPENIX");
        autores.add("RIVADAVIA");
        return autores;
    }

    public void setAutores(List<String> autores) {
        this.autores = autores;
    }

}
