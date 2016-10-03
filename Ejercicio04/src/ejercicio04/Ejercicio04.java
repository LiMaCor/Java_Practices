// Programa que calcula el perímetro y área de un cilindro.

package ejercicio04;
import java.util.Scanner;
/**
 *
 * @author PixelZer0
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        
        // Declaramos "sc" para obtener datos por teclado.
        Scanner sc = new Scanner(System.in);
        
        // Pedimos el valor de un lado.
        System.out.print("Introduce el valor de un lado (en cm): ");
        
        // Declaramos las variables
        int a = sc.nextInt();
        
        // Aplicamos las formulas correspondientes.
        double area = (Math.sqrt(3) / 4) * Math.pow(a, 2);
        int perimetro = a * 3;
        
        // Imprimimos el resultado por pantalla.
        System.out.println("El perímetro del cilindro es: " + perimetro + " cm/'s");
        System.out.println("El área del cilindro es: " + area + " cm²/s");
    }
}