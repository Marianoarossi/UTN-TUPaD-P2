package tp2;
import java.util.Scanner;
/**
 * Ejercicio 10: Actualización de stock.
 * @author Mariano Rossi Calcula el nuevo stock de un producto.
 * @param stockActual unidades disponibles
 * @param cantidadVendida unidades vendidas
 * @param cantidadRecibida unidades recibidas
 * @return stock actualizado
 */
public class ejercicio10 {
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        int nuevoStock;
        nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        if (nuevoStock < 0) nuevoStock = 0;
        return nuevoStock;
    }
    public static void main(String[] args) {
        int stock, cantVendido, cantRecivido, resultado;
        Scanner inpput = new Scanner(System.in);
        System.out.print("Ingrese el stock actual del producto: ");
        stock = inpput.nextInt();
        System.out.print("Ingrese la cantidad vendida: ");
        cantVendido = inpput.nextInt();
        System.out.print("Ingrese la cantidad recibida: ");
        cantRecivido = inpput.nextInt();
        resultado = actualizarStock(stock, cantVendido, cantRecivido);
        System.out.println("El nuevo stock del producto es: " + resultado);
    }
}
