
package divisionenjava;
import java.util.Scanner;
public class DivisionEnJava {

   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int total, aprobados;
       double porcAprobados;       
       System.out.println("Cantidad total de alumnos: ");
       total = Integer.parseInt(input.nextLine());
       System.out.println("Cantidad de aprobados; ");
       aprobados = Integer.parseInt(input.nextLine());
       porcAprobados = ((double) aprobados / total)* 100;
       System.out.println("Aprobo el " + porcAprobados + "% de alumnos");
       //CASTING se pone () al tipo de dato 
    }
    }
