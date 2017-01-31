package estadisticaproductos.modelo;

import javax.validation.constraints.Min;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Producto.java - Representa un producto
 * 
 * @author PixelZer0
 */
public class Producto {
    
    // Variables
    
    @NotEmpty(message = " -  El producto no puede quedar vacío.")
    private String nombre;
    
    @Min(value = 1, message = " -  El número de existencias debe ser mayor que 0.")
    private long existencias;
    
    @Min(value = 1, message = " -  El precio de un producto debe tener un valor superior a 0.")
    private double precio;
    
    private String categoria;
    
    
    /**
     * Constructor
     * 
     * @param nombre
     * @param categoria
     * @param existencias
     * @param precio 
     */
    
    public Producto(String nombre, String categoria, long existencias, double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.existencias = existencias;
        this.precio = precio;
    }
    
    /**
     * Constructor por defecto
     */
    
    public Producto() {
    }

    
    /**
     * Obtiene el nombre del producto
     * 
     * @return 
     */
    
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del producto
     * 
     * @param nombre 
     */
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene las existencias de un producto
     * 
     * @return 
     */
    
    public long getExistencias() {
        return existencias;
    }

    /**
     * Establece las existencias de un producto
     * 
     * @param existencias 
     */
    
    public void setExistencias(long existencias) {
        this.existencias = existencias;
    }

    /**
     * Obtiene el precio de un producto
     * 
     * @return 
     */
    
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio de un producto
     * 
     * @param precio 
     */
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene la categoría de un producto
     * 
     * @return 
     */
    
    public String getCategoria() {
        return categoria;
    }

    /**
     * Establece la categoría de un producto
     * 
     * @param categoria 
     */
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}