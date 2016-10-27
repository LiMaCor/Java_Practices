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
public class Profesor {
    
    // Variables de la clase
    private int id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private IES insti;
    
    // Método constructor
    public Profesor() {
    };
    
    public Profesor(int i, String n, String d) {
        this.id = i;
        this.nombre = n;
        this.direccion = d;
    }
    
    // Métodos de la clase
    public void setIES(IES centro) {
        this.insti = centro;
    }

    public IES getIES() {
        return insti;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Profesor{" + "id=" + id + ", nombre=" + nombre + ", direccion=" 
                + direccion + '}';
    }
    
    
    
}
