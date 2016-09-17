/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;
import java.util.Scanner;

/**
 *
 * @author a021704062c
 */
public class Ejercicio01 {


    public static void main(String[] args) {
        
        // Definimos el objeto "sc" para recibir los datos por teclado.
        // Establecemos la constante "IVA".
        Scanner sc = new Scanner(System.in);
        final int IVA = 21;
        
        System.out.print("Introduce el precio: ");
        
        // Introducimos el valor para la variable "precio".
        double precio = sc.nextDouble();
        
        // Aplicamos la fórmula correspondiente en la variable "pvp".
        double pvp = precio + precio * IVA / 100;
        
        System.out.println("El PVP es: " + pvp);
        
    }
    
}
