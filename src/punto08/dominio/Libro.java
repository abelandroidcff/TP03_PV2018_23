
package punto08.dominio;
//clase libro con sus atributos
public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private double precio;
    //creo constructor
    public Libro(){
        
    }
    // Creo constructor
    public Libro(int ISBN, String titulo, String autor, double precio) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }
    
    
    
    // se crea los getter & setter 
    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
