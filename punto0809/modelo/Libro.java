package punto0809.modelo;

/**
 * Programación Visual - APU
 * @author Ariel Mamaní - LU3051 - Grupo 23
 */
public class Libro {
    
    private int isbn;
    private String titulo;
    private String autor;
    private double precio;    

    public Libro() {
    }
    
    public Libro(int isbn, String titulo, String autor, double radio) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = radio;        
    }
    
    
    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}
