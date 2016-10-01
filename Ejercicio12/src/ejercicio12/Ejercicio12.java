/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;
import java.util.Scanner;
/**
 *
 * @author a021704062c
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("Vamos a jugar. Introduce un número: ");
        
        n = sc.nextInt();
        int i = 1, rand = (int) (Math.random() * 100) + 1;
        
        while (n != rand) {
            if (n > rand) {
                System.out.println("Tu número es mayor que el mio.");
            } else {
                System.out.println("Tu número es menor que el mio.");
            }
            i++;
            
            System.out.print("Inténtalo de nuevo: ");
            n = sc.nextInt();
        }
        
        System.out.println("Enhorabuena. El número es: " + rand);
        System.out.println("Has necesitado " + i + " intentos.");
    }
}