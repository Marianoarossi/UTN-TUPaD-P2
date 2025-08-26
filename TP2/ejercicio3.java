package tp2;
import java.util.Scanner;
/**
 * @author Mariano Rossi
 * Ejercicio 3: Clasificación de Edad.
 */
public class ejercicio3 {
    /**
* Clasifica una edad en segmentos.
* @param edad Edad a clasificar.
* @return etiqueta de clasificación de segmento.
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edad;
        System.out.print("Ingrese su edad: ");
        edad = input.nextInt();
        System.out.println("Eres un " + clasificaEdad(edad) + ".");
    }
    public static String clasificaEdad(int edad) {
        if (edad < 12) return "Niño";
        if (edad <= 17) return "Adolescente";
        if (edad <= 59) return "Adulto";
        return "Adulto mayor";
}
}
