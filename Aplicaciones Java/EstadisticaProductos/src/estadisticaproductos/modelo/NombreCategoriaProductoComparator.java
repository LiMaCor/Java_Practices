package estadisticaproductos.modelo;

import java.util.Comparator;
import estadisticaproductos.modelo.Producto;

/**
 *
 * @author PixelZer0
 */
public class NombreCategoriaProductoComparator implements Comparator<Producto> {
    
    @Override
    
    /**
     * Compara los nombres de producto y las categorías
     * @param producto1
     * @param producto2
     */
    
    public int compare(Producto producto1, Producto producto2) {
        if (producto1.getCategoria().equals(producto2.getCategoria())) {
            return producto1.getNombre().compareToIgnoreCase(producto2.getNombre());
        }
        return producto1.getCategoria().compareToIgnoreCase(producto2.getCategoria());
    }
    
}