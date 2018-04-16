package punto10.dominio;

public class Venta {

    public int cuota;
    public Producto producto;

    public Venta() {
    }

    public Venta(int cantidad, Producto producto) {
        this.cuota = cantidad;
        this.producto = producto;
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

}
