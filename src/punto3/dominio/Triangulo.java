/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3.dominio;

/**
 *
 * @author abel
 */
public class Triangulo {
    private int lado1;
    private int lado2;
    private int lado3;

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    //Metodos
    public void verificarTriangulo(){
        
        if(lado1+lado2>lado3 && lado1 + lado3>lado2&& lado2 + lado3>lado1){
            System.out.println("El perimetro del triangulo es: "+ (lado1+lado2+lado3));
    
        }else{
            System.out.println("No se ha formado la figura del Triangulo");
        }
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    
    

    
}
