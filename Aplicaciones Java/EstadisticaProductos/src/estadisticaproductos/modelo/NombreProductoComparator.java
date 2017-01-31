package estadisticaproductos.modelo;

import java.util.Comparator;
import estadisticaproductos.modelo.Producto;

/**
 *
 * @author PixelZer0
 */

public class NombreProductoComparator implements Comparator<Producto> {
    
    @Override
    
    /**
     * Compara dos nombres de producto
     * @param producto1
     * @param producto2
     */
    
    public int compare(Producto producto1, Producto producto2) {
        return producto1.getNombre().compareToIgnoreCase(producto2.getNombre());
    }
    
}