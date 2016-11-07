package net.ausiasmarch.seguromedico.modelo;

/**
 *
 * @author Pixel_Zer0
 */
public class SeguroMedico {

    // Propiedades
    private String genero, trabajo;
    private int edad, numHijos;
    private double precioBase;
    private boolean embarazada;
    private boolean enfermedadCorazon, enfermedadOjos, enfermedadPiel;
    private boolean coberturaCorazon, coberturaOftalmologica, coberturaInVitro;
    private boolean coberturaPediatria, coberturaDermatologia;
    private String mensaje;
    private StringBuilder sb;

    // Metodos get y set

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public boolean isEmbarazada() {
        return embarazada;
    }

    public void setEmbarazada(boolean embarazada) {
        this.embarazada = embarazada;
    }

    public boolean isEnfermedadCorazon() {
        return enfermedadCorazon;
    }

    public void setEnfermedadCorazon(boolean enfermedadCorazon) {
        this.enfermedadCorazon = enfermedadCorazon;
    }

    public boolean isEnfermedadOjos() {
        return enfermedadOjos;
    }

    public void setEnfermedadOjos(boolean enfermedadOjos) {
        this.enfermedadOjos = enfermedadOjos;
    }

    public boolean isEnfermedadPiel() {
        return enfermedadPiel;
    }

    public void setEnfermedadPiel(boolean enfermedadPiel) {
        this.enfermedadPiel = enfermedadPiel;
    }

    public boolean isCoberturaCorazon() {
        return coberturaCorazon;
    }

    public void setCoberturaCorazon(boolean coberturaCorazon) {
        this.coberturaCorazon = coberturaCorazon;
    }

    public boolean isCoberturaOftalmologica() {
        return coberturaOftalmologica;
    }

    public void setCoberturaOftalmologica(boolean coberturaOftalmologica) {
        this.coberturaOftalmologica = coberturaOftalmologica;
    }

    public boolean isCoberturaInVitro() {
        return coberturaInVitro;
    }

    public void setCoberturaInVitro(boolean coberturaInVitro) {
        this.coberturaInVitro = coberturaInVitro;
    }

    public boolean isCoberturaPediatria() {
        return coberturaPediatria;
    }

    public void setCoberturaPediatria(boolean coberturaPediatria) {
        this.coberturaPediatria = coberturaPediatria;
    }

    public boolean isCoberturaDermatologia() {
        return coberturaDermatologia;
    }

    public void setCoberturaDermatologia(boolean coberturaDermatologia) {
        this.coberturaDermatologia = coberturaDermatologia;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public boolean validate(){
        
        sb = new StringBuilder();
        
        // La edad debe ser mayor o igual a 18 años
        if (edad <= 18) {
            sb.append("  - La edad no debe ser inferior a 18 años.\n");
        }
        
        // El número de hijos debe ser mayor o igual que cero
        if (numHijos < 0) {
            sb.append("  - El núm. de hijos debe ser mayor o igual que cero.\n");
        }
        
        // Si marca "Embarazada" o cobertura de fecundación "in vitro", el sexo
        // debe ser mujer
        if (getGenero() != "Mujer" && (isEmbarazada() || isCoberturaInVitro())) {
                sb.append("  - El sexo debe ser 'Mujer'.\n");
        }
        
        // Si marca la cobertura "Pediatría", el núm. de hijos debe ser mayor
        // que cero
        if (isCoberturaPediatria()) {
            if (numHijos < 0) {
                sb.append("  - El núm. de hijos debe ser mayor que cero.\n");
            }
        }
        
        // Si marca la cobertura "Dermatológica", debe marcar la enfermedad
        // "Piel"
        if (isCoberturaDermatologia()) {
            if (!isEnfermedadPiel()) {
                sb.append("  - Debe marcar como enfermedad la opción 'Piel'.\n");
            }
        }
        
        // Si marca la cobertura "Corazón", debe marcar la enfermedad
        // "Corazón"
        if (isCoberturaCorazon()) {
            if (!isEnfermedadCorazon()) {
                sb.append("  - Debe marcar como enfermedad la opción"
                        + " 'Corazón'.\n");
            }
        }
        
        // Si marca la cobertura "Oftalmología", debe marcar la enfermedad
        // "Ojos"
        if (isCoberturaOftalmologica()) {
            if (!isEnfermedadOjos()) {
                sb.append("  - Debe marcar como enfermedad la opción 'Ojos'.\n");
            }
        }
        
        // Añadimos al contenedor los mensajes de error
        mensaje = sb.toString();
        
        // Valor que devolverá en caso de que contenga, o no, algún dato en
        // la variable "mensaje"
        return mensaje.isEmpty();
    }
    
        /**
     * Obtiene el importe mensual del seguro
     * @return double
     */
    public double importeMensual(){
        
        double precioBase = getPrecioBase();
        
        if (isEnfermedadCorazon()) {
            precioBase += 15;
        }
        
        if (isEnfermedadOjos()) {
            precioBase += 15;
        }
        
        if (isEnfermedadPiel()) {
            precioBase += 15;
        }
        
        if (isCoberturaOftalmologica()) {
            precioBase += 30;
        }
        
        if (isCoberturaPediatria()) {
            precioBase += 30;
        }
        
        if (isCoberturaInVitro()) {
            precioBase += 100;
        }
        
        if (isCoberturaCorazon()) {
            precioBase += 80;
        }
        
        if (isCoberturaDermatologia()) {
            precioBase += 40;
        }
        
        return precioBase;             
    }
    
    /**
     * Obtiene el descuento del seguro
     * @return double
     */
    private double descuento(){
        
        double descuentoAplicado;
        double descuentoFinal;
        
        if (getTrabajo().equals("Funcionario")) {
            descuentoAplicado = 15;
        } else {
            descuentoAplicado = 5;
        }
        
        descuentoFinal = (importeMensual() * 12) * (descuentoAplicado / 100);
        
        return descuentoFinal;
    }
    
    /**
     * Obtiene el importe anual
     * @return double
     */
    public double importeAnual(){
        
        double importeAnual;
        
        importeAnual = (importeMensual() * 12) - descuento();
        
        return importeAnual;
    }
}
