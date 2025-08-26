package tp2;
import java.util.Scanner;
/**
 * Ejercicio 11: Cálculo de descuento especial usando variable global.
 *
 * @author Mariano Rossi Aplica el descuento especial del 10%.
 * @param precio precio original
 * @return precio final con descuento
 */
public class ejercicio11 {    
    public static final double DESC_ESP = 0.10;    
    public static void main(String[] args) {
        double precio,pre_Final;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        precio = input.nextDouble();
        calcularDescuentoEspecial(precio);
    }
    public static double calcularDescuentoEspecial(double precio) {        

        double descuentoAplicado, precioFinal;
        descuentoAplicado = precio * DESC_ESP;
        precioFinal = precio - descuentoAplicado;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
        return precioFinal;
    }

}
