
package punto05.dominio;


public class Circulo {
    
private double x, y; 
    private double radio;  

    public Circulo(double x, double y, double radio) {
        this.x = x;
        this.y = y;
        this.radio = radio;
    }
    
    public Circulo(){
    }  
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
   
    public  double obtenerSuperficie(){ 
        return 3.14159 * radio * radio;} 
    
    public void mostrarCirculo(){
        System.out.println("------------------------------------------------------------");
        System.out.println("Las coordenadas del circulo son (x,y): ("+getX()+ ","+getY()+")" );
        System.out.println("El Radio de circulo es:" + getRadio());
        System.out.println("La Superficie de circulo es:"+obtenerSuperficie());
        System.out.println("------------------------------------------------------------");
            }
      }

