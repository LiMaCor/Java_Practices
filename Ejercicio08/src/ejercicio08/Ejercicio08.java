// Programa que comprueba dos nombres y apellidos y los muestra ordenados
// alfabéticamente por el nombre.

package ejercicio08;
import java.util.Scanner;
/**
 *
 * @author PixelZer0
 */
public class Ejercicio08 {

    public static void main(String[] args) {
        
        // Definimos "sc" para obtener datos por teclado.
        // Definimos también "nombre1", "nombre2", "apellido1" y "apellido2".
        Scanner sc = new Scanner(System.in);
        String nombre1, nombre2, apellido1, apellido2;
        
        // Pedimos un nombre.
        System.out.print("Introduce el nombre de la persona 1: ");
        
        // Se lo asignamos a "nombre1".
        nombre1 = sc.nextLine();
        
        // Pedimos un apellido.
        System.out.print("Introduce el apellido de la persona 1: ");
        
        // Se lo asignamos a "apellido1".
        apellido1 = sc.nextLine();
        
        // Igual que con "nombre1".
        System.out.print("Introduce el nombre de la persona 2: ");
        
        // Se lo asignamos a "nombre2".
        nombre2 = sc.nextLine();
        
        // Igual que con "apellido1".
        System.out.print("Introduce el apellido de la persona 2: ");
        
        // Se lo asignamos a "apellido2".
        apellido2 = sc.nextLine();
        
        // Comprobamos, ignorando mayśuculas y minúsculas, si
        // ambos nombres y apellidos si son iguales.
        // Si no, entonces comprobamos que si al comparar "nombre1"
        // con "nombre2", el resultado es menor que 0, entonces se muestra
        // primero "nombre2" y "apellido2". Si no, viceversa.
        if (nombre1.compareToIgnoreCase(nombre2) == 0 &&
            apellido1.compareToIgnoreCase(apellido2) == 0) {
                System.out.println("Los nombres y apellidos son iguales.");
        } else {
            if (nombre1.compareToIgnoreCase(nombre2) < 0) {
                System.out.println(nombre2 + " " + apellido2);
                System.out.println(nombre1 + " " + apellido1);
            } else {
                System.out.println(nombre1 + " " + apellido1);
                System.out.println(nombre2 + " " + apellido2);
            }
        }
    }
}