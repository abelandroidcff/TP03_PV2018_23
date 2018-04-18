
package punto08.util;

import java.util.ArrayList;
import java.util.Scanner;
import punto08.dominio.Libro;



public class LibroUtil {
   private ArrayList<Libro> libros = new ArrayList(); 
   
   // permite agregar libros
   
   public void agregarLibro(Libro unLibro){
        
        this.libros.add(unLibro);
    }
   
         
// Se crean los getter and setter
    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
   
   
}
