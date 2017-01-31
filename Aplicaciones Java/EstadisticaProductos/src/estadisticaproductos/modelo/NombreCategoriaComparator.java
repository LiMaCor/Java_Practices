package estadisticaproductos.modelo;

import java.util.Comparator;

/**
 *
 * @author PixelZer0
 */
public class NombreCategoriaComparator implements Comparator<Producto> {
    
    /**
     * Compara dos categorías
     * @return int
     */
    
    @Override
    public int compare(Producto producto1, Producto producto2) {
        return producto1.getCategoria().compareToIgnoreCase(producto2.getCategoria());
    }
}