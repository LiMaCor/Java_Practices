package practicacirculo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double radio, area, diametro, perimetro, angulo;
        
        // Obtenemos el radio del circulo por teclado
        System.out.print("Dame el radio del círculo: ");
        radio = teclado.nextDouble();
        
        // Creamos un circulo con ese radio
        Circulo c1 = new Circulo(radio);
        
        // Obtenemos el area del circulo y la mostramos
        System.out.println("\nEl área del circulo es: " + c1.area());
        
        // Obtenemos un nuevo radio del circulo por teclado
        System.out.print("\nDame un nuevo radio: ");
        radio = teclado.nextDouble();
        
        // Modificamos el radio del circulo con el valor anterior y lo mostramos
        c1.setRadio(radio);
        System.out.println("\nEl nuevo radio es: " + c1.getRadio());
        
        // Obtener la nueva area del circulo y la mostramos
        System.out.println("\nLa nueva área del circulo es: " + c1.area());
        
        // Obtenemos el diametro del circulo con el ultimo radio leido
        System.out.println("\nEl diametro del circulo es: " + c1.diametro());
        
        // Obtenemos el perimetro del circulo con el ultimo radio leido
        System.out.println("\nEl perimetro del circulo es: " + c1.perimetro());
      
        // Obtenemos por teclado un angulo
        System.out.print("\nDame un ángulo: ");
        angulo = teclado.nextDouble();
        
        // Establecemos el angulo para un sector circular con el valor anterior
        c1.setAngulo(angulo);
        System.out.println("\nEl ángulo del circulo es: " + c1.getAngulo());
        
        // Obtenemos el area del sector circular del circulo
        System.out.println("\nEl área de un sector"
                + " del circulo es: " + c1.areaSector());
    }
}