// Programa que comrueba si un número es par o impar.

package ejercicio05;
import java.util.Scanner;
/**
 * 
 *
 * @author PixelZer0
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        
        // Declaramos "sc" para obtener datos por teclado.
        Scanner sc = new Scanner(System.in);
        
        // Pedimos un número.
        System.out.print("Introduce un número: ");
        
        // Declaramos y asignamos por teclado un valor a n.
        int n = sc.nextInt();
        
        // Si el resto de n / 2 es igual a 0, n es un número par.
        // De lo contrario, es impar.
        if (n % 2 == 0) {
            System.out.println("El número " + n + " es par.");
        } else {
            System.out.println("El número " + n + " es impar");
        }
    }
}