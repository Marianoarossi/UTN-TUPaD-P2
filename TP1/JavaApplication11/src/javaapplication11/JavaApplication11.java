package javaapplication11;
import java.util.Scanner;
public class JavaApplication11 {
   
    public static void main(String[] args) {
        String nombre;
        int edad;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        nombre = input.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.println("Su nombre es: "+ nombre);
        System.out.println("Su edad es: "+ edad);      
        
    }

}
