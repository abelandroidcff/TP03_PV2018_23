
package punto08.test;
import java.util.Scanner;
import punto08.dominio.Libro;
import punto08.util.LibroUtil;


//clase principal
public class Main {

    
    public static void main(String[] args) {
        
        LibroUtil libros = new LibroUtil();
        String resp;
        //Se usa para ingresar un libro
        do{
            Libro unLibro= new Libro();
            Scanner sc= new Scanner(System.in);
            System.out.println("------------");
            System.out.println("Ingrese numero de ISBN: ");
            unLibro.setISBN(sc.nextInt());
            System.out.println("Ingrese el título del libro: ");
            unLibro.setTitulo(sc.next());
            System.out.println("Ingrese el nombre del Autor: ");
            unLibro.setAutor(sc.next());
            System.out.println("Ingrese el Precio del libro: ");
            unLibro.setPrecio(sc.nextDouble());
            // Se envia los datos del libro a la lista
            libros.agregarLibro(unLibro);
            
            
            System.out.println("Desea ingresar otro libro? (S/N): ");
            resp=sc.next();   
              
        }while("S".equals(resp.toUpperCase()));
        //Muestra los libros cargados
        for(Libro l: libros.getLibros()){
                
                System.out.println("----------------------------");
                System.out.println("ISBN: "+ l.getISBN());
                System.out.println("----------------------------");
                System.out.println("Titulo: "+l.getTitulo());
                System.out.println("----------------------------");
                System.out.println("Autor: "+l.getAutor());
                System.out.println("-----------------------------");
                System.out.println("Precio: "+l.getPrecio());
                System.out.println("-----------------------------");
                       
                                
                
        }
}
    

}
