package punto12.util;

import java.util.ArrayList;
import punto12.dominio.Libro;

public class LibroUtil {

    private ArrayList<Libro> arrayLibros;

    public LibroUtil() {
        arrayLibros = new ArrayList<>();
    }

    public ArrayList<Libro> getArrayLibros() {
        arrayLibros.add(new Libro("Matematicas Discretas", "matematicas", "Grimaldi"));
        arrayLibros.add(new Libro("Introduccion a Bases de Datos", "informatica", "Christopher Date"));
        arrayLibros.add(new Libro("El Reino del Reves", "cuentos", "Maria Elena Walsh"));
        arrayLibros.add(new Libro("Lengua I", "lengua", "Antonio Lepsz"));
        arrayLibros.add(new Libro("Matematicas para la computacion", "matematicas", "Murillo"));
        arrayLibros.add(new Libro("Tom Sawyer", "novelas", "Mark Twain"));
        arrayLibros.add(new Libro("Lluvia de estrellas", "novelas", "Martina Wildner"));
        arrayLibros.add(new Libro("Cometas en el Cielo", "drama", "Hosseini"));
        arrayLibros.add(new Libro("Bajo la Misma Estrella", "drama", "John Green"));
        arrayLibros.add(new Libro("La 2da guerra mundial", "historia", "Nacion"));
        arrayLibros.add(new Libro("Revolucion Industrial", "historia", "Puerto de Palos"));
        arrayLibros.add(new Libro("Diseño Web", "informatica", "Openix"));
        arrayLibros.add(new Libro("Gramatica I", "lengua", "Rivadavia"));
        return arrayLibros;
    }

    public void setArrayLibros(ArrayList<Libro> arrayLibros) {
        this.arrayLibros = arrayLibros;
    }
}
