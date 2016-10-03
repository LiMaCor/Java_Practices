// Programa que muestra por pantalla los números que hay desde 1 hasta "n".

package ejercicio10;
import java.util.Scanner;
/**
 *
 * @author PixelZer0
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        
        // // Definimos "sc" para obtener datos por teclado.
        // También declaramos "n" y el contador "i" asignándole el valor 1.
        Scanner sc = new Scanner(System.in);
        int n;
        int i = 1;
        
        // Pedimos un número.
        System.out.print("Introduce un número: ");
        
        // Asignamos un valor por teclado a "n".
        n = sc.nextInt();
        
        // Mientras el valor de "n" sea mayor o igual que el valor de "i",
        // se mostrará por pantalla el valor de "i".
        // Cada vez que se repita el bucle, se le suma 1 a "i".
        while (n >= i) {
            System.out.println(i);
            i++;
        }
    }
}