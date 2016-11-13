package net.ausiasmarch.habitacion.modelo;

/**
 * Controlador
 *
 * @author Luis
 */
public class Controlador implements Runnable {

    private Thread hiloPrueba = null;
    private boolean probar = false;
    private ProbadorAparatos pa;

    public Controlador(ProbadorAparatos pa) {
        this.pa = pa;
    }

    public void iniciar() {
        if (hiloPrueba == null) {
            probar = true;
            hiloPrueba = new Thread(this);
            hiloPrueba.start();
        }
    }

    public void parar() {
        probar = false;
        hiloPrueba = null;
    }

    @Override
    public void run() {
        if (probar) {
            pa.pruebaAparatos();
        }
    }

    public boolean getProbar() {
        return probar;
    }
}
