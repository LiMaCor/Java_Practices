// Programa que muestra de mayor a menor dos números y/o dice si son iguales.

package ejercicio07;
import java.util.Scanner;
/**
 *
 * @author PixelZer0
 */
public class Ejercicio07 {

    public static void main(String[] args) {
        
        // Definimos "sc" para obtener datos por teclado.
        // Definimos también las variables "a" y "b".
        Scanner sc = new Scanner(System.in);
        int a, b;
        
        // Pedimos un número.
        System.out.print("Introduce un número: ");
        
        // Asignamos un valor por teclado a "a".
        a = sc.nextInt();
        
        // Pedimos otro número.
        System.out.print("Introduce otro número: ");
        
        // Asignamos un valor por teclado a "b".
        b = sc.nextInt();
        
        // Primero se comprueba si "a" y "b" son diferentes.
        // Si lo son, si "a" es mayor que "b", se muestra primero "a".
        // De lo contrario, viceversa.
        // Si no son distintos, son iguales.
        if (a != b) {
            if (a > b) {
                System.out.println(a + " > " + b);
            } else {
                System.out.println(b + " > " + a);
            }
        } else {
            System.out.println(a + " y " + b + " son iguales.");
        }
    }
}