package net.ausiasmarch.habitacion.modelo;

import javax.swing.JLabel;

/**
 * Manejo de una l�mpara
 * @author <a href="mailto:logongas@users.sourceforge.net">Lorenzo Gonz�lez</a>
 */
public class Lampara implements Aparato {

    int num;
    Habitacion habitacion;
    JLabel jLabel;
    boolean encendida;

    /**
     * @param num N� de l�mpara en la casa. Debe empezar desde 0 hasta el n� de l�mparas -1
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
     * Enciende la l�mpara
     */
    public void encender() {
        jLabel.setVisible(true);
        encendida = true;    
    }
       
    /**
     * Apaga la l�mpara
     */
    public void apagar() {
         jLabel.setVisible(false);
         encendida = false;
    }

     /**
     * Enciende o apaga la l�mpara
     */
    public void encenderApagar(boolean tag) {
         jLabel.setVisible(tag);
         encendida = tag;
    }
    
    
    /**
     * Establece a que habitaci�n pertence el aparato
     * @param habitacion Habitaci�n a la que pertence el aparato
     */
    @Override
    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
        jLabel= (JLabel)habitacion.getContentComponent(num);
    }
   
}
