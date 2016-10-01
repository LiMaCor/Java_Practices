/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;
import java.util.Scanner;
/**
 *
 * @author a021704062c
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        int i = 1;
        
        System.out.print("Introduce un número: ");
        n = sc.nextInt();
        
        while (n >= i) {
            System.out.println(i);
            i++;
        }
        
    }
    
}
