package estadisticaproductos.modelo;

import java.util.Comparator;
import estadisticaproductos.modelo.Producto;

/**
 *
 * @author PixelZer0
 */
public class ExistenciasComparator implements Comparator<Producto> {
    
    /**
     * Compara las existencias de dos productos
     * Si son iguales, devuelve 0
     */
    
    @Override
    
    public int compare(Producto producto1, Producto producto2) {
        if (producto1.getExistencias() > producto2.getExistencias()) {
            return 1;
        }
        
        if (producto1.getExistencias() < producto2.getExistencias()) {
            return -1;
        }
        
        return 0;
    }   
}