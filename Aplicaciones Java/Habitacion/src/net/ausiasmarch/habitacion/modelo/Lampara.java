package net.ausiasmarch.habitacion.modelo;

import javax.swing.JLabel;

/**
 * Manejo de una lámpara
 * @author <a href="mailto:logongas@users.sourceforge.net">Lorenzo González</a>
 */
public class Lampara implements Aparato {

    int num;
    Habitacion habitacion;
    JLabel jLabel;
    boolean encendida;

    /**
     * @param num Nº de lámpara en la casa. Debe empezar desde 0 hasta el nº de lámparas -1
     */
    public Lampara(int num) {
        this.num = num;
        encendida = false;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }


    /**
     * Enciende la lámpara
     */
    public void encender() {
        jLabel.setVisible(true);
        encendida = true;    
    }
       
    /**
     * Apaga la lámpara
     */
    public void apagar() {
         jLabel.setVisible(false);
         encendida = false;
    }

     /**
     * Enciende o apaga la lámpara
     */
    public void encenderApagar(boolean tag) {
         jLabel.setVisible(tag);
         encendida = tag;
    }
    
    
    /**
     * Establece a que habitación pertence el aparato
     * @param habitacion Habitación a la que pertence el aparato
     */
    @Override
    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
        jLabel= (JLabel)habitacion.getContentComponent(num);
    }
   
}
