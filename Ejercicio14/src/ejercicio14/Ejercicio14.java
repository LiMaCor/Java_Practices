// Programa que calcula si un número es primo, comprobando que no hay
// otros divisores para un número "n" más que 1 y él mismo.

package ejercicio14;
import java.util.Scanner;
/**
 *
 * @author PixelZer0
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        
        // Definimos "sc" para obtener datos por teclado.
        // También definimos "n" y le asignamos a "primo" el valor true.
        Scanner sc = new Scanner(System.in);
        int n;
        boolean primo = true;
        
        // Pedimos un número.
        System.out.print("Introduce un número: ");
        
        // Le asignamos un valor por teclado a "n".
        n = sc.nextInt();
        
        // Si el resto de "n" entre 2 es 0 o "n" es diferente a 2, se le asigna
        // a "primo" el valor false. De lo contrario, si el resto de "n" entre 2
        // es distinto de 0, se crea un bucle en el que se declara el contador
        // "i" y se le asigna el valor 2. Mientras "i" sea menor o igual que
        // "n" - 1 Y "primo" sea true, entonces si el resto de "n" entre "i" es
        // igual a 0, se le asigna el valor fase a "primo" y termina el bucle.
        // Cada vez que se repita el bucle, el valor de "i" aumenta en 1.
        // Este código se utiliza para comprobar que "n" no tiene  otros
        // divisores que no sean 1 o él mismo. Si lo hay, "n" se descarta
        // asignándole a primo el valor false, de modo que rompe el bucle.
        if (n % 2 == 0 && n != 2) {
            primo = false;
        } else {
            if (n % 2 != 0) {
                for (int i = 2; i <= (n - 1) && primo; i++) {
                    if (n % i == 0) {
                        primo = false;
                    }
                }
            }
        }
        
        // Si al pasar el bucle, el valor de "primo" sigue siendo true, entonces
        // "n" es un número primo. De lo contrario, "n" no es primo.
        if (primo) {
            System.out.println(n + " es primo.");
        } else {
            System.out.println(n + " no es primo");
        }
    }
}