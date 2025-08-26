package tp2;
import java.util.Scanner;
/**
 * @author Mariano Rossi
 *Calcula el precio final.
 * @param precioBase Precio base del producto.
 * @param impuestoPct Porcentaje de impuesto (ej: 10 = 10%).
 * @param descuentoPct Porcentaje de descuento (ej: 5 = 5%).
 * @return precio final.
 */
public class ejercicio8 {
    public static void main(String[] args) {
        double precioBase, impuestoBase, descuentobase,total;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio base del producto: ");
         precioBase = input.nextDouble();
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
         impuestoBase = input.nextDouble();
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        descuentobase = input.nextDouble();
        total = calcularPrecioFinal(precioBase, impuestoBase, descuentobase);
        System.out.println("El precio final del producto es: " + total);
    }
    public static double calcularPrecioFinal(double precioBase, double impuestoBase, double descuentobase){
        double impuesto = precioBase * (impuestoBase / 100.0);
        double descuentos = precioBase * (descuentobase / 100.0);
        return precioBase + impuesto - descuentos;
    } 
}
