import java.util.Scanner;
/**
*programa para generar una clave al estilo del RFC de las personas.
*Objetivo Utilizar cadenas de caracteres y algunos de los metodos mas importantes de dicha clase en la elaboracion de un programa 
*@author Luis Daniel Sanchez Diaz
*@version 1a edicion
*/
public class RFC {

  public static void main (String[] args){
    String nombrec,fnac, innom, dosapa, inama, dia,mes,año;
    
    Scanner sc= new Scanner(System.in);
    System.out.println("Escriba su nombre completo en una sola linea.");
    nombrec=sc.nextLine();
    System.out.println("Escriba su fecha de nacimiento con el formato DD/MM/AA, separando cada dato con una diagonal");
    fnac=sc.nextLine();
    
    String nombrecom=nombrec;
    int posicion;
    innom=nombrec.substring(0,1);
    
    posicion=nombrec.indexOf(" ");
    inama=nombrec.substring(posicion+1,posicion+2);
    
    posicion=nombrec.indexOf(" ");
    nombrec=nombrec.substring(posicion+1,nombrec.length());
    
    dosapa=nombrec.substring(0,2);
    
    posicion=nombrec.indexOf(" ");
    nombrec=nombrec.substring(posicion+1,nombrec.length());
    
    inama=nombrec.substring(0,1);
    
    dia=fnac.substring(0,2);
    mes=fnac.substring(3,5);
    año=fnac.substring(6,8);
    String rfc=dosapa+inama+innom+año+mes+dia;
    rfc=rfc.toUpperCase();
    System.out.println("El RFC de "+nombrecom+" es: "+rfc);
  }
}
