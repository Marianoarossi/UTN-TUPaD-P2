package tp2;
/**
 *Ejercicio 12: Modificación de un array de precios.
 * @author Mariano Rossi
 */
public class ejercicio12 {

    public static void main(String[] args) {
        double[] precios;           
        precios = new double[]{199.99, 299.5, 149.75, 399.0, 89.99}; 
        System.out.println("Precios originales:");
        for (double precio : precios) {                     
            System.out.println("Precio: $" + precio);
        }
        precios[2] = 129.99;
        System.out.println("Precios modificados:");
        for (double precio : precios) {                     
            System.out.println("Precio: $" + precio);
        }
    }
}
