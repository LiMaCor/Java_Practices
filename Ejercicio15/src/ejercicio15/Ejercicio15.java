/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author a021704062c
 */
public class Ejercicio15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String texto;
        int palabras = 1;
        int A = 0, E = 0, I = 0, O = 0, U = 0;

        System.out.print("Introduce un texto: ");

        texto = sc.nextLine();

        if (!texto.isEmpty()) {
            for (int i = 0; i <= (texto.length() - 1); i++) {
                if (texto.charAt(i) == ' ') {
                    palabras++;
                }
            }
            System.out.println("En el texto hay " + palabras + " palabras.");

            texto = texto.toUpperCase();
            texto = texto.trim();

            for (int n = 0; n <= (texto.length() - 1); n++) {
                switch (texto.charAt(n)) {
                    case 'A':
                        A++;
                        break;
                    case 'E':
                        E++;
                        break;
                    case 'I':
                        I++;
                        break;
                    case 'O':
                        O++;
                        break;
                    case 'U':
                        U++;
                        break;
                }
            }
            System.out.println("En el texto hay " + A + " a's, " + E + " e's, " + I
                    + " i's, " + O + " o's y " + U + " u's.");
        } else {
            System.out.println("No has introducido ningún texto.");
        }
    }
}
