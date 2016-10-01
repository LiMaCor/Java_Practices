/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;
import java.util.Scanner;
/**
 *
 * @author a021704062c
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        boolean primo = true;
        
        System.out.print("Introduce un número: ");
        
        n = sc.nextInt();
        
        if (n % 2 == 0 && n != 2) {
            primo = false;
        } else {
            if (n % 2 != 0) {
                for (int i = 2; i <= (n - 1) && primo; i++) {
                    if (n % i == 0) {
                        primo = false;
                    }
                }
            }
        }
        
        if (primo) {
            System.out.println(n + " es primo.");
        } else {
            System.out.println(n + " no es primo");
        }
    }
}