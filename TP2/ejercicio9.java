package tp2;
import java.util.Scanner;
/**
 *Ejercicio 9: Costo de envío y total de compra.
 * @author Mariano Rossi
 */
public class ejercicio9 {    
    public static void main(String[] args) {
        double precioProd, peso, total, costoEnv;
        String zona;
        boolean bandera;//Bandera para validar salida del while.
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        precioProd = input.nextDouble();
        System.out.print("Ingrese el peso del paquete en kg: ");
        peso = input.nextDouble();
        bandera = false;
        zona = "";
        while (!bandera) {
            System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
            zona = input.next(); 
            if (zona.equalsIgnoreCase("Nacional") || zona.equalsIgnoreCase("Internacional")) {
                bandera = true;
            } else {
                System.out.println("Zona inválida. Ingrese 'Nacional' o 'Internacional'.");
            }
        }
        costoEnv = calcularCostoEnvio(peso, zona);
        total = calcularTotalCompra(precioProd, costoEnv);
        System.out.println("El costo de envío es: " + costoEnv);
        System.out.println("El total a pagar es: " + total);
    }    
      public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5.0;
        } else { // "Internacional"
            return peso * 10.0;
        }
    }
     //Función para sumar el costo de envio + precio del producto.
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
}
