package punto0809.util;

import java.util.ArrayList;
import punto0809.modelo.Libro;

/**
 * Programación Visual - APU
 * @author Ariel Mamaní - LU3051 - Grupo 23
 */
public class ListaLibros {
    private ArrayList<Libro> libros = new ArrayList();

    /**
     * @return the libros
     */
    public ArrayList<Libro> getLibros() {
        return libros;
    }

    /**
     * @param libros the libros to set
     */
    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    public void agregarLibro(Libro unLibro){
        
        this.libros.add(unLibro);
    }
    
}
