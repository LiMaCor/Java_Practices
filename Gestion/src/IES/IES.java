/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IES;

/**
 *
 * @author PixelZer0
 */
public class IES {
    
    // Variables de la clase
    private int id;
    private int numero;
    private String calle;
    private String poblacion;
    private String provincia;
    
    // Método constructor
    public IES() {
    };
    
    public IES(int i, int n, String c, String p) {
        this.id = i;
        this.numero = n;
        this.calle = c;
        this.provincia = p;
    }
    // Metodos de la clase

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "IES{" + "id=" + id + ", numero=" + numero + ", calle=" + calle +
                ", provincia=" + provincia + '}';
    }
    
}
