/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio07;
import java.util.Scanner;
/**
 *
 * @author a021704062c
 */
public class Ejercicio07 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a, b;
        
        System.out.print("Introduce un número: ");
        
        a = sc.nextInt();
        
        System.out.print("Introduce otro número: ");
        
        b = sc.nextInt();
        
        if (a != b) {
            if (a > b) {
                System.out.println(a + " > " + b);
            } else {
                System.out.println(b + " > " + a);
            }
        } else {
            System.out.println(a + " y " + b + " son iguales.");
        }
    }
    
}
