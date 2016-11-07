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

    /**
     * Obtiene el género
     * @return String
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Establece el género
     * @param genero 
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Obtiene la actividad
     * @return String
     */
    public String getActividad() {
        return actividad;
    }

    /**
     * Establece la actividad
     * @param actividad 
     */
    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    /**
     * Obtiene la altura
     * @return int
     */
    public int getAltura() {
        return altura;
    }

    /**
     * Establece la altura
     * @param altura 
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * Obtiene la edad
     * @return int
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad
     * @param edad 
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene el peso
     * @return double
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Establece el peso
     * @param peso 
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Obtiene los mensajes de error
     * @return String
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Establece los mensajes de error
     * @param mensaje 
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    /** Metodos funcionales (reglas de validación y cálculos)
     *
     * Reglas de validación:
     * 1 - El peso debe ser mayor que 0.
     * 2 - La altura debe ser mayor que 0.
     * 3 - La edad debe ser mayor que 0.
     */ 
    
    /**
     * Comprueba que los datos para realizar los cálculos, son correctos.
     * @return boolean
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
    
    /**
     * Obtiene el cálculo del metabolismo basal
     * @return double
     */
    public double getMetabolismoBasal() {
        double tmb = (10 * peso) + (6.25 * altura) - (5 * edad);
        
        switch (genero.toUpperCase()) {
            case "HOMBRE":
                tmb = tmb + 5;
            case "MUJER":
                tmb = tmb - 161;
        }
        
        return tmb;
    }
    
    /**
     * Obtiene el cálculo de las calorías necesarias para mantener el peso actual
     * @return double
     */
    public double getCaloriasMantenerPeso() {
        double calorias = 0;
        
        if (actividad.equals(TipoActividad.SEDENTARIA.toString())) {
            calorias = getMetabolismoBasal() * TipoActividad.SEDENTARIA.valor;
        }
        
        if (actividad.equals(TipoActividad.LIGERA.toString())) {
            calorias = getMetabolismoBasal() * TipoActividad.LIGERA.valor;
        }
        
        if (actividad.equals(TipoActividad.MODERADA.toString())) {
            calorias = getMetabolismoBasal() * TipoActividad.MODERADA.valor;
        }
        
        if (actividad.equals(TipoActividad.INTENSA.toString())) {
            calorias = getMetabolismoBasal() * TipoActividad.INTENSA.valor;
        }
        
        if (actividad.equals(TipoActividad.MUY_INTENSA.toString())) {
            calorias = getMetabolismoBasal() * TipoActividad.MUY_INTENSA.valor;
        }
        
        return calorias;
    }
}