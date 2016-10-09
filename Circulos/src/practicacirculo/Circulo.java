/*
 * Circulo.java
 */

package practicacirculo;

public class Circulo {
    private double radio;
    private double angulo;
    
    public Circulo(double rad) {  // Constructor
      radio = rad;    
    }

    // Obtiene el radio
    public double getRadio(){
      return radio;
    }
    
    // Establece el radio
    public void setRadio(double valor){
        radio = valor;
    }

    // Obtiene el ángulo
    public double getAngulo() {
        return angulo;
    }
   
    // Establece el ángulo
    public void setAngulo(double valor){
        angulo = valor;
    }
    
    // Obtiene el área
    public double area(){
      return Math.PI * radio * radio;
    }
    
    // Obtiene el diámetro
    public double diametro(){
      return 2 * radio;
    }
    
    // Obtiene el perímetro
    public double perimetro(){
      return 2 * Math.PI * radio;
    }
    
    // Obtiene un sector del área en base a un ángulo y radio
    public double areaSector(){
      return (angulo / 360) * radio * Math.pow(Math.PI,2);
    }
}