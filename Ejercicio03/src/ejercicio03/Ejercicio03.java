// Programa que convierte los segundos en días, horas, minutos y
// segundos restantes.

package ejercicio03;
import java.util.Scanner;
/**
 *
 * @author PixelZer0
 */
public class Ejercicio03 {

    public static void main(String[] args) {

        // Definimos "sc" para obtener los datos por teclado.
        Scanner sc = new Scanner(System.in);
        
        // Pedimos los segundos.
        System.out.print("Introduce una cantidad de segundos: ");
        
        // Definimos las variables sec, min, hour y day.
        // Para obtener cifras con información relevante,
        // calculamos el resto. Si no, el programa dará datos erróneos.
        int sec = sc.nextInt();
        int min = sec / 60;
        int min_resto = sec % 60;
        int hour = min / 60;
        int hour_resto = min % 60;
        int day = hour / 24;
        int day_resto = hour % 24;
        
        // Mostramos el resultado por pantalla.
        System.out.println(sec + " segundo/s son: ");
        System.out.println(min + " minutos y " + min_resto + " segundos.");
        System.out.println(hour + " horas y " + hour_resto + " minutos.");
        System.out.println(day + " dias y " + day_resto + " horas.");
    }
}
