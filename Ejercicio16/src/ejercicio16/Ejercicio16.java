/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;
import java.util.Scanner;
/**
 *
 * @author a021704062c
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int base, altura, n1, n2;
        
        System.out.print("Introduce un número entre 3 y 10: ");
        
        do {
            n1 = sc.nextInt();
        } while (n1 < 3 || n1 > 10);
        
        System.out.print("\nIntroduce otro número entre 3 y 10: ");
        
        do {
            n2 = sc.nextInt();
        } while (n2 < 3 || n2 > 10 || n2 == n1);
        
        if (n1 < n2) {
            base = n2;
            altura = n1;
        } else {
            base = n1;
            altura = n2;
        }
        
        for (int i = 0; i < altura; i++) {
            for(int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}