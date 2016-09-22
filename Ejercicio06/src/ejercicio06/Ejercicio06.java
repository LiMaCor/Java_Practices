/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06;
import java.util.Scanner;
/**
 *
 * @author a021704062c
 */
public class Ejercicio06 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double a, b;
        double resultado;
        
        System.out.print("Introduce un número: ");
        
        a = sc.nextInt();
        
        System.out.print("Introduce otro número: ");
        
        b = sc.nextInt();
        resultado = a / b;
        
        if (a == 0 && b == 0) {
            System.out.println("Indefinido");
        } else if (b == 0) {
            System.out.println("División por cero");
        } else {
            System.out.println("Resultado: " + resultado);
        }
    }
    
}
