// Programa que establece una calificación en función de la nota indicada.

package ejercicio09;
import java.util.Scanner;
/**
 *
 * @author PixelZer0
 */
public class Ejercicio09 {

    public static void main(String[] args) {
        
        // Declaramos "sc" para obtener datos por teclado.
        // Declaramos también "nota".
        Scanner sc = new Scanner(System.in);
        int nota;
        
        // Pedimos una nota.
        System.out.print("Introduce tu nota: ");
        
        // Le asignamos un valor por teclado a "nota".
        nota = sc.nextInt();
        
        // Si la nota es menor a cero y mayor a 10, queda descartada.
        // De lo contrario, se compara con los casos en el bloque "switch" y
        // se le asigna una calificación.
        if (nota < 0 || nota > 10) {
            System.out.println("Nota no válida. Introduce una nota correcta.");
        } else {
            switch (nota) {
                case 0: case 1: case 2: case 3: case 4:
                    System.out.println("Insuficiente");
                    break;
                case 5:
                    System.out.println("Suficiente");
                    break;
                case 6:
                    System.out.println("Bien");
                    break;
                case 7: case 8:
                    System.out.println("Notable");
                    break;
                case 9: case 10:
                    System.out.println("Sobresaliente");
                    break;
                default:
                    System.out.println("Introduce una nota válida");
            }
        }
    }
}