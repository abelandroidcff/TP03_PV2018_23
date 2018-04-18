package punto05.dominio;

public class Circulo {

    private String nombre;
    private double radio;
    private double superficie;

    public Circulo() {
    }

    public Circulo(String nombre, double radio, double perimetro) {
        this.nombre = nombre;
        this.radio = radio;
        this.superficie = perimetro;
    }

    public Circulo(String nombre, double radio) {
        this.nombre = nombre;
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getSuperficie() {
        superficie = 3.14 * (Math.pow(radio, 2));
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
