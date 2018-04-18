
package punto06.util;

import java.util.ArrayList;
import punto06.dominio.Rectangulo;


public class ArregloDeRectangulos {
    
  private ArrayList<Rectangulo> listaRectangulos = new ArrayList();
  
 
     public ArrayList<Rectangulo> getListaRectangulos() {
       return listaRectangulos;
    }


    public void setListaRectangulos(ArrayList<Rectangulo> listaRectangulos) {
        this.listaRectangulos = listaRectangulos;
    }

    
 /* Metodo que agrega un elemento Rectangulo al ArrayList*/     
    public void agregarRectangulo(Rectangulo rectangulo){
         this.listaRectangulos.add(rectangulo);
    }
 
     /* Metodo que borra un elemento Rectangulo al ArrayList*/ 
    public void borrarRectangulo (int posicion){
        this.listaRectangulos.remove(posicion);
    }
     /* Metodo que muestra los elementos del ArrayList precargados*/ 
    public void mostrarRectangulos(){
        System.out.println("                    RECTANGULOS DEL ARRAY");
        System.out.println(" -----------------------------------------------------------");
        System.out.println("Vertice     Base      Altura       Superficie      Perimetro");
        System.out.println(" -----------------------------------------------------------");
        for (int i=0; i< listaRectangulos.size() ;i++){
             System.out.print("("+listaRectangulos.get(i).getX());
             System.out.print(","+listaRectangulos.get(i).getY()+")");
             System.out.print("    "+listaRectangulos.get(i).getBase());
             System.out.print("        "+listaRectangulos.get(i).getAltura());
             System.out.print("            "+listaRectangulos.get(i).calcularSuperficie());
             System.out.print("            "+listaRectangulos.get(i).calculaPerimetro());
             System.out.println( );
        }
    }   
    /* Metodo que muestra el elemento a borrar del ArrayList*/ 
     public void mostrarRectanguloBorrado(int posicion){
        System.out.println("Vertice     Base      Altura       Superficie      Perimetro");
             System.out.print("("+listaRectangulos.get(posicion).getX());
             System.out.print(","+listaRectangulos.get(posicion).getY()+")");
             System.out.print("    "+listaRectangulos.get(posicion).getBase());
             System.out.print("        "+listaRectangulos.get(posicion).getAltura());
             System.out.print("            "+listaRectangulos.get(posicion).calcularSuperficie());
             System.out.print("            "+listaRectangulos.get(posicion).calculaPerimetro());
             System.out.println( );
        }   
  
    }
