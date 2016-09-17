/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;
import java.util.Scanner;
/**
 *
 * @author a021704062c
 */
public class Ejercicio03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cantidad de segundos: ");
        
        int sec = sc.nextInt();
        int min = sec / 60;
        int min_resto = sec % 60;
        int hour = min / 60;
        int hour_resto = min % 60;
        int day = hour / 24;
        int day_resto = hour % 24;
        
        System.out.println(sec + " segundo/s son: ");
        System.out.println(min + " minutos y " + min_resto + " segundos.");
        System.out.println(hour + " horas y " + hour_resto + " minutos.");
        System.out.println(day + " dias y " + day_resto + " horas.");
        
    }
    
}
