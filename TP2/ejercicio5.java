package tp2;
import java.util.Scanner;
/** Ejercicio 5: Suma de números Pares.
 * @author Mariano Rossi */
public class ejercicio5 {
/**
* Leodesde teclado hasta obtener un entero válido.
* No permito otros caracteres; consumo el ingreso inválido y vuelvo a pedir.
* @param input      Scanner ya creado
* @param prompt  Mensaje a mostrar
* @return        Número entero leído*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sumPar = 0;   // acumulador de pares
        int numero; 
        do {
            numero = leerEntero(input, "Ingrese un número (0 para terminar): "); // asignar
            if (numero % 2 == 0) {
                sumPar = sumPar + numero;
            }
        } while (numero != 0);
        System.out.println("La suma de los números pares es: " + sumPar);
    }    
    public static int leerEntero(Scanner input, String mensaje) {
    int valor = 0;
    boolean bandera = false;
    char caracter;
    boolean soloDigitos;
    while (!bandera) {
        System.out.print(mensaje);
        String ingreso = input.next();
        soloDigitos = ingreso.length() > 0;
        // recorre mientras queden caracteres y siga siendo válido
        for (int i = 0; i < ingreso.length() && soloDigitos; i++) {
            caracter = ingreso.charAt(i);
            if (caracter < '0' || caracter > '9') {
                soloDigitos = false;            
            }
        }
        if (soloDigitos) {
            valor = Integer.parseInt(ingreso); //dato validado
            bandera = true; //bandera para salir del bucle sin break
        } else {
            System.out.println("Entrada inválida. Ingrese solo números enteros.");
        }
    }
    return valor;
}
}

   
