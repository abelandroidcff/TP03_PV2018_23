/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.punto1;

/**
 *
 * @author abel
 */
public class Punto {
    private int x;
    private int y;
    
    //creo constructor

 public Punto(int x, int y) {
    this.x = x;
    this.y = y;
}

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
 public double calcularDistanciaEntrePuntos(Punto otroPunto){
    double distancia=Math.round( Math.sqrt(Math.pow(otroPunto.getX(),otroPunto.getX())+ Math.pow(otroPunto.getY(), otroPunto.getY())));
    return distancia;
 }   

}

