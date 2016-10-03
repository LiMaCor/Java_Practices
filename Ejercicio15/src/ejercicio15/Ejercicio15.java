// Programa que cuenta las palabras y cuantas vocales de cada tipo hay en
// un texto.

package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author PixelZer0
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        
        // Definimos "sc" para obtener datos por teclado.
        // También definimos "texto", "palabras" con el valor 1, y las vocales
        // asignándoles el valor 0.
        Scanner sc = new Scanner(System.in);
        String texto;
        int palabras = 1;
        int A = 0, E = 0, I = 0, O = 0, U = 0;

        // Pedimos un texto.
        System.out.print("Introduce un texto: ");

        // Le asignamos un valor por teclado a "texto".
        texto = sc.nextLine();

        // Si el valor de "texto" no es NULL, entonces se entra en un bucle
        // donde se declara el contador "i" con el valor 0. Mientras "i" sea
        // menor que la longitud de la cadena de texto pasada a "texto" menos 1,
        // entonces si el carácter que representa el contador "i" en la
        // cadena de texto es un espacio, se suma 1 al contador "palabras".
        // Este código añade 1 al contador "palabras" ya que antes de un
        // espacio, siempre hay una palabra. El contador "palabras" empieza
        // con el valor 1 para contar la palabra al final de la cadena, ya que
        // al final de un texto no hay espacios.
        if (!texto.isEmpty()) {
            for (int i = 0; i <= (texto.length() - 1); i++) {
                if (texto.charAt(i) == ' ') {
                    palabras++;
                }
            }
            
            // Imprimimos cuantas palabras hay en el texto.
            System.out.println("En el texto hay " + palabras + " palabras.");

            // Con el método .toUpperCase() hacemos que toda la cadena esté en
            // mayúsculas; y con .trim(), eliminamos todos los espacios.
            texto = texto.toUpperCase();
            texto = texto.trim();

            // Creamos un bucle para contar cuantas vocales hay y las comparamos
            // con los casos del bloque de código "switch", añadiendo 1 sus
            // respectivos contadores.
            for (int n = 0; n <= (texto.length() - 1); n++) {
                switch (texto.charAt(n)) {
                    case 'A':
                        A++;
                        break;
                    case 'E':
                        E++;
                        break;
                    case 'I':
                        I++;
                        break;
                    case 'O':
                        O++;
                        break;
                    case 'U':
                        U++;
                        break;
                }
            }
            
            // Mostramos por pantalla cuantas vocales de cada tipo hay.
            // Si no se introduce nada, muestra un mensaje de advertencia.
            System.out.println("En el texto hay " + A + " a's, " + E + " e's, " + I
                    + " i's, " + O + " o's y " + U + " u's.");
        } else {
            System.out.println("No has introducido ningún texto.");
        }
    }
}