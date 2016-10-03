// Programa que genera un rectángulo con carácteres "*", pasandole dos valores
// comprendidos entre 3 y 10.

package ejercicio16;
import java.util.Scanner;
/**
 *
 * @author PixelZer0
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        
        // Definimos "sc" para obtener datos por teclado.
        // También definimos "base", "altura", "n1" y "n2".
        Scanner sc = new Scanner(System.in);
        int base, altura, n1, n2;
        
        // Pedimos un número entre un rango especificado.
        System.out.print("Introduce un número entre 3 y 10: ");
        
        // Se le asigna un valor por teclado a "n1" y se comprueba si está fuera
        // del rango. Si lo está, el programa seguirá pidiendo un número que
        // esté en ese rango de números.
        do {
            n1 = sc.nextInt();
        } while (n1 < 3 || n1 > 10);
        
        // Pedimos otro número que esté en el mismo rango especificado antes.
        System.out.print("\nIntroduce otro número entre 3 y 10: ");
        
        // Se le asigna un valor por teclado a "n2" y se comprueba si está fuera
        // del rango o es igual a "n1". El programa seguirá pidiendo un número
        // si se cumple alguna de las condiciones de salida.
        // La condición de igualdad se especifica porque se pueden dar dos
        // valores en el rango de 3 a 10. Como queremos generar un rectángulo,
        // los lados no pueden ser iguales.
        do {
            n2 = sc.nextInt();
        } while (n2 < 3 || n2 > 10 || n2 == n1);
        
        // Se comprueba cual es el valor más alto y se asigna a "base" y el
        // menor se asigna a "altura". 
        if (n1 < n2) {
            base = n2;
            altura = n1;
        } else {
            base = n1;
            altura = n2;
        }
        
        // Creamos un bucle anidado donde definimos el contador "i"
        // con el valor 0. Mientras i sea menor que "altura", se entra en otro
        // bucle con "j" declarado como contador y valor 0. Mientras "j" sea
        // menor que "base", se imprime el carácter "*". Cada vez que se repite
        // el bucle, se suma 1 a "j". Al terminar, se sale del bucle y se hace
        // un salto de linea. Se suma 1 al contador "i" y se vuelve a entrar en
        // el segundo bucle. De esta manera generamos filas y columnas al
        // imprimir por pantalla el carácter "*".
        for (int i = 0; i < altura; i++) {
            for(int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}