// Programa que le dice al usuario si un número es capicúa o no.

package ejercicio13;
import java.util.Scanner;
/**
 *
 * @author PixelZer0
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        
        // Definimos "sc" para obtener datos por teclado.
        // También definimos "num", "numInvertido", "resto" y "numRestante", con
        // un valor de cero.
        Scanner sc = new Scanner(System.in);
        int num = 0, numInvertido = 0, resto = 0, numRestante = 0;
        
        // Pedimos un número.
        System.out.print("Introduce un número: ");
        
        // Le asignamos un valor por teclado a "num".
        // Asginamos a "numRestante" el valor de "num" para trabajar con él.
        num = sc.nextInt();
        numRestante = num;
        
        // MIentras "numRestante sea distinto a cero, se obtiene el resto de
        // "numRestante / 10. Se asigna a "numInertido" su valor por 10 más el
        // resto y asignamos a "numRestante" su cociente al dividirlo entre 10.
        while (numRestante != 0) {
            resto = numRestante % 10;
            numInvertido = (numInvertido * 10) + resto;
            numRestante = numRestante / 10;
        }
        
        // Si el valor de "num" coincide con el generado finalmente en
        // "numInvertido", imprimimos por pantalla que "num" es capicúa.
        // De lo contrario, "num" no es capicúa"
        if (num == numInvertido) {
            System.out.println("El número " + num + " es capicúa");
        } else {
            System.out.println("El número " + num + " no es capicúa");
        }
    }
}