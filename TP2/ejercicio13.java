package tp2;

/**
 * @author Mariano Rossi Imprime los valores del array de forma recursiva.
 * @param precios array de precios
 * @param i índice actual
 */
public class ejercicio13 {
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales:");
        imprimir(precios, 0);
        precios[2] = 129.99;
        System.out.println("\nPrecios modificados:");
        imprimir(precios, 0);
    }
    public static void imprimir(double[] precios, int i) {
        if (i >= precios.length) {
            return; 
        }
        System.out.println("Precio: $" + precios[i]);
        imprimir(precios, i + 1);
    }
}
