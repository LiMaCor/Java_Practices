package estadisticaproductos.modelo;

import java.util.Comparator;
import estadisticaproductos.modelo.Producto;

/**
 *
 * @author PixelZer0
 */

public class PreciosComparatorAsc implements Comparator<Producto> {
    
    @Override
    
    /**
     * Compara los precios de dos objetos Producto
     * Si son iguales, devuelve 0
     */
    
    public int compare(Producto producto1, Producto producto2) {
        if (producto1.getCategoria().compareTo(producto2.getCategoria()) != 0) {
            return producto1.getCategoria().compareToIgnoreCase(producto2.getCategoria());
        }
        
        if (producto1.getPrecio() > producto2.getPrecio()) {
            return 1;
        }
        
        if (producto1.getPrecio() < producto2.getPrecio()) {
            return -1;
        }
        
        return 0;
    }
}