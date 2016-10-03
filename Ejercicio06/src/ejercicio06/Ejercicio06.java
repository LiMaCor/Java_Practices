// Programa que realiza una división de dos valores introducidos por teclado.

package ejercicio06;
import java.util.Scanner;
/**
 *
 * @author PixelZer0
 */
public class Ejercicio06 {

    public static void main(String[] args) {
        
        // Declaramos "sc" para obtener datos por teclado.
        // Declaramos también "a", "b" y "resultado".
        Scanner sc = new Scanner(System.in);
        double a, b;
        double resultado;
        
        // Pedimos un número.
        System.out.print("Introduce un número: ");
        
        // Asignamos un valor por teclado a "a".
        a = sc.nextInt();
        
        // Pedimos otro número.
        System.out.print("Introduce otro número: ");
        
        // Le asignamos a "b" un valor por teclado.
        // Asignamos también un valor a "resultado".
        b = sc.nextInt();
        resultado = a / b;
        
        // Si "a" y "b" son 0, la división da un resultado indefinido.
        // Si "b", la división no se podrá realizar dado que el divisor es "b".
        // De lo contrario, se muestra el resultado por pantalla.
        if (a == 0 && b == 0) {
            System.out.println("Indefinido");
        } else if (b == 0) {
            System.out.println("División por cero");
        } else {
            System.out.println("Resultado: " + resultado);
        }
    }
}