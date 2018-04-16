package punto11.dominio;

public class Zapatilla {

    private String marca;
    private boolean calidad;

    public Zapatilla() {
    }

    public Zapatilla(String marca, boolean calidad) {
        this.marca = marca;
        this.calidad = calidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isCalidad() {
        return calidad;
    }

    public void setCalidad(boolean calidad) {
        this.calidad = calidad;
    }
}
