package tp2;
import java.util.Scanner;
/**Ejercicio 4: Calculadora de Descuento.
 * @author Mariano Rossi */
public class ejercicio4 {
 /**
* Devuelve el porcentaje de descuento según categoría.
* @param categoria 'A', 'B' o 'C'
* @return descuento como fracción (0.10 = 10%), (0.20 = 20%), (0.30 = 30%)*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precio,desc,montoDesc,precioFinal;
        char categoria;
        System.out.print("Ingrese el precio del producto, recuerde usar la , para los decimales: ");
        precio = input.nextDouble();  
        boolean aux = false;
        do {
            System.out.print("Ingrese la categoría del producto (A, B o C): ");
            categoria = Character.toUpperCase(input.next().charAt(0)); // lee el 1° char y lo pasa a mayúsculas
            aux = (categoria == 'A' || categoria == 'B' || categoria == 'C');
            if (!aux) {
                System.out.println("Categoría inválida. Ingrese nuevamente A, B o C.");
            }
        } while (!aux);
        desc = hacerDescuento(categoria);
        montoDesc = precio * desc;
        precioFinal = precio - montoDesc;
        System.out.println("Descuento aplicado: " + (desc * 100) + "%");
        System.out.println("Precio final: $" + precioFinal);
    }
    public static double hacerDescuento(char categoria) {
        switch (Character.toUpperCase(categoria)) {
            case 'A': return 0.10;
            case 'B': return 0.15;
            case 'C': return 0.20;
            default:  return 0.0;
        }
    }
}
