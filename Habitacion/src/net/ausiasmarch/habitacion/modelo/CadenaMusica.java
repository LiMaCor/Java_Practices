package net.ausiasmarch.habitacion.modelo;

import java.io.*;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JLabel;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import java.util.concurrent.TimeUnit;

/**
 * Permite manejar una cadena musical
 *
 * @author Luis Mateo
 */
public class CadenaMusica extends TimerTask implements Aparato {

    private int num;
    private JLabel jLabel, jLabelTiempo;
    private Player player;
    private Thread thread;
    private Thread hiloMusica = null;
    private Timer timer;
    private int time;
    private int period = 1000;
    private boolean isPlay = false;
    private boolean stop = false;

    /**
     * Constructor
     */
    public CadenaMusica(int num) {
        this.num = num;
        timer = null;
    }

    /**
     * Hace que suene la música en la cadena
     * @param fichero
     */
    public void play(String fichero) {
        try {
            InputStream is;
            String path = "net/ausiasmarch/habitacion/recursos/" + 
                           fichero;
            ClassLoader cl = this.getClass().getClassLoader();

            if (cl == null) {
                is = ClassLoader.getSystemResourceAsStream(path);
            } else {
                is = cl.getResourceAsStream(path);
            }

            player = new Player(new BufferedInputStream(is));

            hiloMusica = new Thread() {
                @Override
                public void run() {
                    thread = Thread.currentThread();
                    thread.setPriority(Thread.MIN_PRIORITY);

                    //     while (stop == false) {
                    try {
                        player.play();
                        
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    //    }
                }
            };

            hiloMusica.start();
            stop = false;

            jLabel.setVisible(true);
            jLabelTiempo.setVisible(true);
            isPlay = true;

            if (timer == null) {
                time = 0;
                timer = new Timer();
                timer.scheduleAtFixedRate(this, 0, 1000);
            }

        } catch (JavaLayerException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Para la reproducción de la música
     */
    public void stop() {
        jLabel.setVisible(false);
        time = 0;      
        isPlay = false;
        player.close();
        jLabelTiempo.setVisible(false);
    }

    /**
     * Establece a que habitación pertence el aparato
     *
     * @param habitacion Habitación a la que pertence el aparato
     */
    @Override
    public void setHabitacion(Habitacion habitacion) {
        jLabel = (JLabel) habitacion.getContentComponent(num);
        jLabelTiempo = (JLabel) habitacion.getContentComponent(num - 1);
    }

    @Override
    public void run() {

        String tiempo = String.format("%d:%d",
                TimeUnit.MILLISECONDS.toMinutes(time),
                TimeUnit.MILLISECONDS.toSeconds(time)
                - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(time)));

        Time formatoTime;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("mm:ss");
            formatoTime = new Time(sdf.parse(tiempo).getTime());
            tiempo = sdf.format(formatoTime);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        
        jLabelTiempo.setText(tiempo);
        time = time + period;
    }

    /**
     * @return the isPlay
     */
    public boolean isPlay() {
        return isPlay;
    }

    /**
     * @param isPlay the isPlay to set
     */
    public void setPlay(boolean isPlay) {
        this.isPlay = isPlay;
    }
}
