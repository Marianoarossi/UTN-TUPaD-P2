package tp2;
import java.util.Scanner;
/**
 * @author Rossi Mariano
 * Ejercicio 2 Buscar el mayor de tres números ingresados
 */
public class ejercicio2 {
/**
* Devuelve el mayor valor entre tres enteros.
* @param a primer entero
* @param b segundo entero
* @param c tercer entero
* @return el máximo número de los 3 ingresados.
*/   
    public static void main(String[] args) {
        int a,b,c;
        //instancio la clase y solicito los números a comparar.
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
         a = input.nextInt();
        System.out.print("Ingrese el segundo número: ");
         b = input.nextInt();
        System.out.print("Ingrese el tercer número: ");
         c = input.nextInt();
        /*Imprimo el nro mayor llamando al metodo esMayor y pasando como
        *parametros las variables 1, b y c. 
        */
        System.out.println("El mayor es: " + esMayor(a, b, c));
    }
    //metodo de comparación de nros para saber el mayor de los 3.
     public static int esMayor (int a, int b, int c){
            int mayor =a;
            if (b>mayor) mayor =b;
            if (c> mayor) mayor = c;
            return mayor;            
        }
}
