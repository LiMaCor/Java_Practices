/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;
import java.util.Scanner;
/**
 *
 * @author a021704062c
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n, media, suma = 0, producto = 1;
        System.out.print("Introduce un número: ");
        
        n = sc.nextInt();
        
        System.out.println("La secuencia de numeros pares es: ");
        
        for (int i = 2; i <= n * 2; i += 2) {
            System.out.println(i);
            suma += i;
            producto *= i;
        }
        
        media = suma / n;
        
        System.out.println("Suma: " + suma);
        System.out.println("Producto: " + producto);
        System.out.println("Media: " + media);
    }
}