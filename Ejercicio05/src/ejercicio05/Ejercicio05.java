/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05;
import java.util.Scanner;
/**
 * 
 *
 * @author a021704062c
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        
        int n = sc.nextInt();
        
        if (n % 2 == 0) {
            System.out.println("El número " + n + " es par.");
        } else {
            System.out.println("El número " + n + " es impar");
        }
    }
    
}
