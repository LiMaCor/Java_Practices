package net.ausiasmarch.tanque.modelo;

/**
 *
 * @author Pixel_Zer0
 */
public class ControlRiego {
    
    // Variables
    private int sequia, humedad;
    String mensaje;
    EstadoTanque estado;
    
    // Metodos constructores
    public ControlRiego(EstadoTanque estado) {
        this.estado = estado;
    }
    
    public ControlRiego() {
    }
    
    // M�todos set y get

    public int getSequia() {
        return sequia;
    }

    public void setSequia(int sequia) {
        this.sequia = sequia;
    }

    public int getHumedad() {
        return humedad;
    }

    public void setHumedad(int humedad) {
        this.humedad = humedad;
    }

    public EstadoTanque getEstado() {
        return estado;
    }

    public void setEstado(EstadoTanque estado) {
        this.estado = estado;
    }
    
    // Reglas de validaci�n
    public int permitidoLlenar() {
        
        if (sequia > 10 || sequia < 0) {
            mensaje = "El valor de la sequ�a no puede ser mayor que "
                    + "10 o menor que 0";
            return 1;
        }
        
        if (estado == EstadoTanque.LLENO) {
            mensaje = "No se puede llenar el tanque si est� lleno";
            return 2;
        }
        
        if (sequia == 10) {
            mensaje = "No se puede llenar si la sequ�a es 10";
            return 3;
        }
        
        if ((sequia >= 7) && estado == EstadoTanque.MEDIO) {
            mensaje = "No se puede llenar m�s de la mitad si "
                    + "la sequ�a es mayor o igual a 7";
            return 4;
        }
        
        return 0;
    }
    
    public int permitidoVaciar() {
        
        if (humedad > 10 || humedad < 0) {
            mensaje = "El valor de la humedad no puede ser mayor que "
                    + "10 o menor que 0";
            return 1;
        }
        
        if (estado == EstadoTanque.VACIO) {
            mensaje = "No se puede vaciar NADA para regar si "
                    + "el tanque ya est� vac�o";
            return 2;
        }
        
        if (humedad >= 7) {
            mensaje = "No se puede vaciar nada para regar si "
                    + "la humedad del suelo es mayor o igual a 7";
            return 3;
        }
        
        if ((humedad >= 3 && humedad < 7) && estado == EstadoTanque.MEDIO) {
            mensaje = "No se puede vaciar m�s all� de la mitad para regar si la"
                      + " humedad del suelo es mayor o igual a 3 y menor que 7";
            return 4;
        }
        
        return 0;
    }
    
    // M�todo para obtener los mensajes de error
    public String getMensaje() {
        return mensaje;
    }   
}