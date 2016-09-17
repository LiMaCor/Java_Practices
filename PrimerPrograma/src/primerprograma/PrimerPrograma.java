/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprograma;

import java.util.Scanner;
/**
 *
 * @author a021704062c
 */
public class PrimerPrograma {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce tu nombre: ");
        
        String nombre = sc.nextLine();
        
        System.out.print("Introduce tu edad: ");
        
        int edad = sc.nextInt();
        
        System.out.println("Tus datos son: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    
}
