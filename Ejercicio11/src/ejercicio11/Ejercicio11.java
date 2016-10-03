// Programa que muestra la suma, producto de los números pares hasta "n".
// También se muestra la media de la suma y "n".

package ejercicio11;
import java.util.Scanner;
/**
 *
 * @author PixelZer0
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        
        // Definimos "sc" para obtener datos por teclado.
        // También se define "n", "media", y "suma" y "producto" se asignan a
        // un valor de 0 y 1 respectivamente.
        Scanner sc = new Scanner(System.in);
        int n, media, suma = 0, producto = 1;
        
        // Se pide un número.
        System.out.print("Introduce un número: ");
        
        // Asignamos un valor por teclado a la variable "n".
        n = sc.nextInt();
        
        System.out.println("La secuencia de numeros pares es: ");
        
        // Creamos un bucle en el que mientras "i" sea menor o igual a n por 2,
        // se imprima "i", se sume el valor de "i" a "suma y se multiplique
        // el valor de "i" a "producto". Cada vez que se repita,
        // se suma 2 a "i".
        for (int i = 2; i <= n * 2; i += 2) {
            System.out.println(i);
            suma += i;
            producto *= i;
        }
        
        // Se asigna la media final.
        media = suma / n;
        
        // Se muestra por pantalla el resultado final de cada variable.
        System.out.println("Suma: " + suma);
        System.out.println("Producto: " + producto);
        System.out.println("Media: " + media);
    }
}