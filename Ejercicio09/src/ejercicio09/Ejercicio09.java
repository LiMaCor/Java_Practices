/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio09;
import java.util.Scanner;
/**
 *
 * @author a021704062c
 */
public class Ejercicio09 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int nota;
        
        System.out.print("Introduce tu nota: ");
        
        nota = sc.nextInt();
        
        if (nota < 0 || nota > 10) {
            System.out.println("Nota no válida. Introduce una nota correcta.");
        } else {
            switch (nota) {
                case 0: case 1: case 2: case 3: case 4:
                    System.out.println("Insuficiente");
                    break;
                case 5:
                    System.out.println("Suficiente");
                    break;
                case 6:
                    System.out.println("Bien");
                    break;
                case 7: case 8:
                    System.out.println("Notable");
                    break;
                case 9: case 10:
                    System.out.println("Sobresaliente");
                    break;
                default:
                    System.out.println("Introduce una nota válida");
            }
        }
    }
}
