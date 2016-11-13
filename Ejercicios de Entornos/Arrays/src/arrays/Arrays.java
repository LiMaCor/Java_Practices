// Para crear un array, primero debemos importar la clase "ArrayList.

package arrays;
import java.util.ArrayList;

/**
 *
 * @author PixelZer0
 */
public class Arrays {

    public static void main(String[] args) {
        
        // Declaramos el objeto 'ArrayList'
        ArrayList nombre = new ArrayList();
        
        // Añadimos datos al array
        nombre.add("Aldia");
        nombre.add("Nadia");
        nombre.add("Engel");
        
        // Mostramos la información del array
        System.out.print(nombre.get(0) + "\n");
        System.out.print(nombre.get(1) + "\n");
        System.out.print(nombre.get(2) + "\n");
        
        // Mostramos la cantidad de elementos que contiene el array
        System.out.println("Número de elementos: " + nombre.size());
        
        // Mostramos una copia de los datos que contiene el array
        System.out.println("Copia del array 'nombres': " + nombre.clone());
        
        // Con un bucle "for", iteramos en los elementos del array
        for (int i = 0; i <=2; i++) {
            System.out.print(nombre.get(i) + "\n");
        }
    }
}