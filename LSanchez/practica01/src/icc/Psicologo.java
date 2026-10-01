import java.util.Scanner;
/**
*Programa para simular una sesión de un Psicologo
*Objetivo Familiarizarse con la creacion y uso de objetos de la clase String utilizando algunos metodos de dicha clase en la elaboracion de un programa.
*@author Luis Daniel Sanchez Diaz
*@version 1a edicion
*/
public class Psicologo {

  public static void main (String[] args){
    String nombre, problema, motivo;

    Scanner sc= new Scanner(System.in);
    System.out.println("Bienvenido, cual es su nombre?");
    nombre=sc.nextLine();
    
    System.out.println("Buenas tardes "+nombre+".");
    System.out.println("Digame, cual es su problema en la vida?");
    problema=sc.nextLine();
    
    System.out.println("MMMM... ya veo");
    System.out.println("Y digame...");
    System.out.println("Porque dice ''"+problema+"''?");
    motivo=sc.nextLine();
    
    System.out.println("Muy interesante!! Hablaremos de ello con mas detalle en la siguiente sesión");
  }
}
