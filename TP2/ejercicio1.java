package tp2;
import java.util.Scanner;
/**
 *
 * @author Rossi Mariano
 * Ejercicio 1 Verificación de año bisiesto.
 */
public class ejercicio1 {
/**
* Determina si un año es bisiesto.
* Regla: divisible por 4 y no por 100, salvo que sea divisible por 400.
* @param anio Año a evaluar.
* @return true si es bisiesto; false en caso de no serlo.
*/   
    public static void main(String[] args) {
        int anio;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        anio = Integer.parseInt(input.nextLine()); //Leo el año que ingresó
       /**llamando al metodo esBisiesto(anio), pasandole como parametro el año
        * podemos validar si es o no bisiesto.
        */
        if (esBisiesto(anio)){
            System.out.println("El año " + anio + " es bisiesto.");
        }else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }  
    }
    //metodo de validación
     public static boolean esBisiesto (int anio){
            return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        }
}
