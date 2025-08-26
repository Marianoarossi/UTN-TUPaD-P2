package tp2;

import java.util.Scanner;

/**
 *Ejercicio 6: Contador de Positivos, Negativos y Ceros.
 * @author Mariano Rossi
 */
public class ejercicio6 {
    public static void main(String[] args) {
        int  positivo = 0, negativo = 0, cero = 0,numero;        
        Scanner input = new Scanner(System.in);        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            numero = input.nextInt();
            if (numero > 0) positivo++;
            else if (numero < 0) negativo++;
            else cero++;
        }
        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivo);
        System.out.println("Negativos: " + negativo);
        System.out.println("Ceros: " + cero);
        }
}
