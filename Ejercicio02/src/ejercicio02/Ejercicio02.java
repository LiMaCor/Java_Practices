// Programa para calcular el área y volumen de un cilindro.

package ejercicio02;
import java.util.Scanner;
/**
 *
 * @author PixelZer0
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        
        // Se define el objeto "sc" para recibir datos por teclado.
        // También definimos el valor de "PI" con el método "Math.PI".
        Scanner sc = new Scanner(System.in);
        final double PI = Math.PI;
        
        // Pedimos el diámetro.
        System.out.print("Introduce el diámetro del cilindro: ");
        
        // Definimos la variable "diámetro".
        double diametro = sc.nextDouble();
        
        // Pedimos la altura.
        System.out.print("Introduce la altura del cilindro: ");
        
        // Definimos la "altura" y calculamos el radio.
        double altura = sc.nextDouble();
        double radio = diametro / 2;
        
        // Al definir las variables "area" y "volumen", aplicamos
        // las fórmulas correspondientes.
        double area = 2 * PI * radio * (altura + radio);
        double volumen = PI * Math.pow(radio, 2) * altura;
        
        // Mostramos el resultado por pantalla.
        System.out.println("El área del cilindro es: " + area);
        System.out.println("El volúmen del cilindro es: " + volumen);   
    }
}
