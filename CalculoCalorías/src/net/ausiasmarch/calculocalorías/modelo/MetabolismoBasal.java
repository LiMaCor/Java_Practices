/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ausiasmarch.calculocalorías.modelo;

/**
 *
 * @author Julián_Martinez
 */
public class MetabolismoBasal {
    
    // Variables
    private String genero, actividad, mensaje;
    private StringBuilder sb;
    private int altura, edad;
    private double peso;
    
    // Métodos (get) y (set)

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    /* Metodos funcionales (reglas de validación y cálculos)
     *
     * Reglas de validación:
     * 1 - El peso debe ser mayor que 0.
     * 2 - La altura debe ser mayor que 0.
     * 3 - La edad debe ser mayor que 0.
    */
    
    public boolean validate() {
        sb = new StringBuilder();
        
        // 1 - El peso debe ser mayor que 0
        if (peso <= 0) {
            sb.append("- El peso debe ser mayor que 0.\n");
        }
        
        // 2 - La altura debe ser mayor que 0
        if (altura <= 0) {
            sb.append("- La altura debe ser mayor que 0.\n");
        }
        
        // 3 - La edad debe ser mayor que 0
        if (edad <= 0) {
            sb.append("- La edad debe ser mayor que 0.\n");
        }
        
        // Añadimos al contenedor, los mensajes de error.
        mensaje = sb.toString();
        
        // Valor que devolverá en caso de que contenga, o no, algún dato en
        // la variable "mensaje"
        return mensaje.isEmpty();
    }
    
    // Cálculos
    
    // Obtiene el cálculo del metabolismo basal
    public double getMetabolismoBasal() {
        double tmb = 0;
        
        switch (genero.toUpperCase()) {
            case "HOMBRE":
                tmb = (10 * peso) + (6.25 * altura) - (5 * edad) + 5;
            case "MUJER":
                tmb = (10 * peso) + (6.25 * altura) - (5 * edad) - 161;
        }
        
        return tmb;
    }
    
    // Obtiene el cálculo de las calorías necesarias para mantener el peso actual
    public double getCaloriasMantenerPeso() {
        double calorias = 0;
                
        switch(actividad.toUpperCase()) {
            case "SEDENTARIA":
                calorias = getMetabolismoBasal() * 1.2;
            case "LIGERA":
                calorias = getMetabolismoBasal() * 1.375;
            case "MODERADA":
                calorias = getMetabolismoBasal() * 1.55;
            case "INTENSA":
                calorias = getMetabolismoBasal() * 1.725;
            case "MUY INTENSA":
                calorias = getMetabolismoBasal() * 1.9;
        }
        
        return calorias;
    }
}
