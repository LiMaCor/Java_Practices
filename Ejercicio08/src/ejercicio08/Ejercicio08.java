/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio08;
import java.util.Scanner;
/**
 *
 * @author a021704062c
 */
public class Ejercicio08 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String nombre1, nombre2, apellido1, apellido2;
        
        System.out.print("Introduce el nombre de la persona 1: ");
        
        nombre1 = sc.nextLine();
        
        System.out.print("Introduce el apellido de la persona 1: ");
        
        apellido1 = sc.nextLine();
        
        System.out.print("Introduce el nombre de la persona 2: ");
        
        nombre2 = sc.nextLine();
        
        System.out.print("Introduce el apellido de la persona 2: ");
        
        apellido2 = sc.nextLine();
        
        if (nombre1.compareToIgnoreCase(nombre2) == 0 &&
            apellido1.compareToIgnoreCase(apellido2) == 0) {
                System.out.println("Los nombres y apellidos son iguales.");
        } else {
            if (nombre1.compareToIgnoreCase(nombre2) < 0) {
                System.out.println(nombre2 + " " + apellido2);
                System.out.println(nombre1 + " " + apellido1);
            } else {
                System.out.println(nombre1 + " " + apellido1);
                System.out.println(nombre2 + " " + apellido2);
            }
        }
    }
}