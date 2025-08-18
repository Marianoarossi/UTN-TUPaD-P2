package dividenumero;
import java.util.Scanner;
public class DivideNumero {    
    public static void main(String[] args) {
        int num1 , num2, resultado;
        //double num1, num2, resultado;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        //num1 = Double.parseDouble(input.nextLine());
        num1 = Integer.parseInt(input.nextLine());        
        System.out.println("Ingrese el segundo número: ");
        //num2 = Double.parseDouble(input.nextLine());
        num2 = Integer.parseInt(input.nextLine());        
        resultado = num1 / num2 ;        
        System.out.println("El resultado es: " + resultado);
        
    }

}
