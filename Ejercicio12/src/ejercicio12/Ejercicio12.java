// Programa que genera un número aleatorio entre 1 y 100 y juega con el usuario
// para que este trate de adivinarlo. También cuenta los intentos.

package ejercicio12;
import java.util.Scanner;
/**
 *
 * @author PixelZer0
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        
        // Definimos "sc" para obtener datos por teclado.
        // También definimos "n".
        Scanner sc = new Scanner(System.in);
        int n;
        
        // Iniciamos el juego. Pedimos un número.
        System.out.print("Vamos a jugar. Introduce un número: ");
        
        // Le asignamos un valor por teclado a "n" y definimos "i" con valor 0.
        // Definimos un valor aleatorio a "rand", usando la clase "Math.random".
        // Como el número resultanto está entre casi 0 y casi 1,
        // lo multiplicamos por 100 y le sumamos 1 al resultado.
        n = sc.nextInt();
        int i = 1, rand = (int) (Math.random() * 100) + 1;
        
        // Mientras "n" sea diferente a "rand", si "n" es mayor que "rand",
        // el programa le indica que "n" es mayor que "rand".
        // De lo contrario, el programa indica que "n" es menor que "rand".
        // También se aumenta en 1 el valor de "i", se pide que lo intente
        // de nuevo y vuelve a solicitar "n".
        while (n != rand) {
            if (n > rand) {
                System.out.println("Tu número es mayor que el mio.");
            } else {
                System.out.println("Tu número es menor que el mio.");
            }
            i++;
            
            System.out.print("Inténtalo de nuevo: ");
            n = sc.nextInt();
        }
        
        // Se muestra por pantalla que "n" es igual que "rand".
        // También se muestra el valor de "i", que son los intentos realizados.
        System.out.println("Enhorabuena. El número es: " + rand);
        System.out.println("Has necesitado " + i + " intentos.");
    }
}