package net.ausiasmarch.habitacion.modelo;

import javax.swing.JLabel;

/**
 * Aparate de Aire Acondicionado
 */
public class AireAcondicionado implements Aparato {

    private int num;
    private Habitacion habitacion;
    private JLabel jLabel;
    private boolean encendido;

    /**
     * @param num N� de aire acondicionado en la casa. Debe empezar desde 0 hasta el n� de aires acondicionados -1
     */
    public AireAcondicionado(int num) {
        this.num = num;
        encendido = false;
    }

    /**
     * Enciende el aire acondicionado para que enfrie
     */
    public void enfriar() {
        jLabel.setVisible(true);
        encendido = true;
    }
    /**
     * Apaga el radiador
     */
    public void apagar() {
        jLabel.setVisible(false);      
        encendido = false;
    }

    /**
     * Enfriar/Apagar el aire acondicionado
     */
    public void enfriarApagar(boolean tag) {
        jLabel.setVisible(tag);
        encendido = tag;
    }
    
    /**
     * Establece a que habitaci�n pertence el aparato
     * @param habitacion Habitaci�n a la que pertence el aparato
     */
    @Override
    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
        jLabel = (JLabel) habitacion.getContentComponent(num);
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }


    
    
    
}
