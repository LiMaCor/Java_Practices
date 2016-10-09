/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ausiasmarch.habitacion.modelo;

import javax.swing.JLabel;
import javazoom.jl.player.Player;
import javax.swing.ImageIcon;

/**
 * Controla los aparatos de reproducci�n de Video como DVDs o Videos VHS
 *
 * @author <a href="mailto:logongas@users.sourceforge.net">Lorenzo Gonz�lez</a>
 */
public class Televisor implements Aparato {

    int num;
    Player player;
    Thread thread;
    Habitacion habitacion;
    JLabel jLabel;
    JLabel jLabelImagen;
    boolean estado;
    boolean encendido = false;

    /**
     * Constructor
     *
     * @param num N� del Televisor en la casa. Debe empezar desde 0 hasta el n�
     * de Televisores -1
     */
    public Televisor(int num) {
        this.num = num;
    }

    /**
     * Enciende el televisor
     */
    public void encender() {
        jLabel.setVisible(true);
        encendido = true;
    }

    /**
     * Apaga el televisor
     */
    public void apagar() {
        jLabel.setVisible(false);
        jLabelImagen.setVisible(false);
        encendido = false;
    }

    /**
     * Encender/Apagar el televisor
     */
    public void encenderApagar(boolean tag) {
        jLabel.setVisible(tag);
        jLabelImagen.setVisible(tag);
        encendido = tag;
    }
      
    public void setImagenVideo(String fichero) {
        if (fichero != null) {
            ImageIcon imagen = new ImageIcon(getClass().getResource("../recursos/" + fichero));
            jLabelImagen.setIcon(imagen);
            jLabelImagen.setVisible(true);
        } else {
            jLabelImagen.setIcon(null);
            jLabelImagen.setVisible(false);
        }

    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    /**
     * Establece a que habitaci�n pertence el aparato
     *
     * @param habitacion Habitaci�n a la que pertence el aparato
     */
    @Override
    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
        jLabel = (JLabel) habitacion.getContentComponent(num);
        jLabelImagen = (JLabel) habitacion.getContentComponent(num - 1);
    }
}
