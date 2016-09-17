/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;
import java.util.Scanner;
/**
 *
 * @author a021704062c
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        
        // Se define el objeto "sc" para recibir datos por teclado.
        // También definimos el valor de "PI" con el método "Math.PI".
        Scanner sc = new Scanner(System.in);
        final double PI = Math.PI;
        
        System.out.print("Introduce el diámetro del cilindro: ");
        
        // Definimos la variable "diámetro".
        double diametro = sc.nextDouble();
        
        System.out.print("Introduce la altura del cilindro: ");
        
        // Definimos la "altura" y calculamos el radio.
        double altura = sc.nextDouble();
        double radio = diametro / 2;
        
        // Al definir las variables "area" y "volumen", aplicamos
        // las fórmulas correspondientes.
        double area = 2 * PI * radio * (altura + radio);
        double volumen = PI * Math.pow(radio, 2) * altura;
        
        System.out.println("El área del cilindro es: " + area);
        System.out.println("El volúmen del cilindro es: " + volumen);
        
    }
    
}
