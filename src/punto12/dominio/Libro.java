package punto12.dominio;

public class Libro {

    private String nombre;
    private String categoria;
    private String autor;

    public Libro() {
    }

    public Libro(String nombre, String categoria, String autor) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
