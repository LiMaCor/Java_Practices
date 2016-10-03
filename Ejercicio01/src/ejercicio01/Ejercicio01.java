// Programa para calcular el PVP de un producto.

package ejercicio01;
import java.util.Scanner;

/**
 *
 * @author PixelZer0
 */
public class Ejercicio01 {


    public static void main(String[] args) {
        
        // Definimos el objeto "sc" para recibir los datos por teclado.
        // Establecemos la constante "IVA".
        Scanner sc = new Scanner(System.in);
        final int IVA = 21;
        
        // Pedimos el precio.
        System.out.print("Introduce el precio: ");
        
        // Introducimos el valor para la variable "precio".
        double precio = sc.nextDouble();
        
        // Aplicamos la fórmula correspondiente en la variable "pvp" y
        // mosramos el resultado por pantalla.
        double pvp = precio + precio * IVA / 100;
        
        System.out.println("El PVP es: " + pvp);
        
    }
    
}
