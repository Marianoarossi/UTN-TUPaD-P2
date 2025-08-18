package calculadora;
import java.util.Scanner;
public class Calculadora {
   public static void main(String[] args) {       
       int num1, num2, suma, resta, multi;
       double divi;
       Scanner input = new Scanner(System.in);       
       System.out.println("Ingrese el primer número: ");
       num1 = Integer.parseInt(input.nextLine());
       System.out.print("Ingrese el segundo número: ");
       num2 = Integer.parseInt(input.nextLine()); 
       suma = num1 + num2;
       resta= num1 - num2;
       multi= num1 * num2;
       divi= num1 /num2;
       System.out.println("La suma de los números es: " + suma);
       System.out.println("La resta de los números es: " + resta);
       System.out.println("La multiplicación de los números es: " + multi);
       System.out.println("La división de los números es: " + divi);

   }

}
