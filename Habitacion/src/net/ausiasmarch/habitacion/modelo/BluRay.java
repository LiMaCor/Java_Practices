package net.ausiasmarch.habitacion.modelo;

import java.io.*;
import java.sql.Time;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Controla los aparatos de reproducción de Video como DVDs o Videos VHS
 *
 * @author Luis Mateo
 */
public class BluRay extends TimerTask implements Aparato {

    private int num;
    private Player player;
    private Thread thread;
    private Thread hiloMusica = null;
    private JLabel jLabel, jLabelTiempo;
    private Timer timer = null;
    private int time;
    private int period = 1000;
    private Televisor televisor;
    private boolean isPlay = false;
    private boolean stop = false;

    /**
     * Constructor
     *
     * @param num Nº del DVD en la casa. Debe empezar desde 0 hasta el nº de
     * DVDs -1
     */
    public BluRay(int num) {
        this.num = num;
        timer = null;
        isPlay = false;
    }

    /**
     * Reproduce el DVD en el televisor
     */
    public void play(String audio, String imagen, Televisor tv) {
        try {
            InputStream is;
            String path1 = "net/ausiasmarch/habitacion/recursos/" + audio;
            ClassLoader cl = this.getClass().getClassLoader();

            if (cl == null) {
                is = ClassLoader.getSystemResourceAsStream(path1);
            } else {
                is = cl.getResourceAsStream(path1);
            }

            player = new Player(new BufferedInputStream(is));

            hiloMusica = new Thread() {
                @Override
                public void run() {
                    thread = Thread.currentThread();
                    thread.setPriority(Thread.MIN_PRIORITY);

                    //    while (stop == false) {
                    try {
                        player.play();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    //     }
                }
            };

            hiloMusica.start();
            stop = false;

            if (tv != null) {
                televisor = tv;
                televisor.encender();
                televisor.setImagenVideo(imagen);
            }

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
     * Detiene la reproducción de la película
     */
    public void stop() {
        jLabel.setVisible(false);
        jLabelTiempo.setVisible(false);
        time = 0;
        if (televisor != null) {
            televisor.setImagenVideo(null);
        }
        isPlay = false;
        stop = true;
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

    public void setTelevisor(Televisor televisor) {
        this.televisor = televisor;
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
