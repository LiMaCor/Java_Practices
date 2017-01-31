package estadisticaproductos.modelo;

import java.util.Comparator;
import estadisticaproductos.modelo.Producto;

/**
 * ProductosComparator
 * @author PixelZer0
 */

public class ExistenciasComparatorAsc implements Comparator<Producto> {
    
    @Override
    
    /**
     * Compara las existencias de dos objetos Producto.
     * Si son iguales, devuelve 0
     */
    
    public int compare(Producto producto1, Producto producto2) {
        if (producto1.getCategoria().compareTo(producto2.getCategoria()) != 0) {
            return producto1.getCategoria().compareToIgnoreCase(producto2.getCategoria());
        }
        
        if (producto1.getExistencias() > producto2.getExistencias()) {
            return 1;
        }
        
        if (producto1.getExistencias() < producto2.getExistencias()) {
            return -1;
        }
        
        return 0;
    }
}