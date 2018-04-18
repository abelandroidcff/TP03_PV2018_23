package punto06.dominio;


public class Rectangulo {
   private  double x;
   private  double y;
   private double altura;
   private double base;

    public Rectangulo(double x, double y, double altura, double base) {
        this.x = x;
        this.y = y;
        this.altura = altura;
        this.base = base;
    }
   
   public Rectangulo(){
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
   /* Metodo que calcula el Perimetro del Rectangulo*/
   public double calculaPerimetro() {
       return 2 *( base + altura );
}

   /* Metodo que calcula la Superficie del Rectangulo*/
   public double calcularSuperficie(){
       return base * altura;
}
   /* Metodos que calculan los tres vertices restantes del Rectangulo*/
public double verticeDosX(){
       return x + base;

}

public double verticeDosY(){
       return y;

}


public double verticeTresX(){
       return x + base;

}

public double verticeTresY(){
       return y + altura;

}


public double verticeCuatroX(){
       return x;

}

public double verticeCuatroY(){
       return y + altura;
}
}