/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;
import java.util.Scanner;
/**
 *
 * @author a021704062c
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = 0, numInvertido = 0, resto = 0, numRestante = 0;
        
        System.out.print("Introduce un número: ");
        
        num = sc.nextInt();
        numRestante = num;
        
        while (numRestante != 0) {
            resto = numRestante % 10;
            numInvertido = (numInvertido * 10) + resto;
            numRestante = numRestante / 10;
        }
        if (num == numInvertido) {
            System.out.println("El número " + num + " es capicúa");
        } else {
            System.out.println("El número " + num + " no es capicúa");
        }
    }
}
