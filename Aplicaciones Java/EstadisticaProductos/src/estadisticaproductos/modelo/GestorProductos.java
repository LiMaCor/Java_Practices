package estadisticaproductos.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author PixelZer0
 */
public class GestorProductos {
    
    // Lista de productos
    
    private List<Producto> productos;
    
    /**
     * Constructor
     */
    
    public GestorProductos() {
        productos = new ArrayList<>();
    }
    
    /**
     * Obtiene la lista de productos
     * @return 
     */
    
    public List<Producto> getProductos() {
        return productos;
    }
    
    /**
     * Establece la lista de productos
     * @param productos 
     */
    
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    /**
     * Obtiene la suma total de todas las existencias
     * @return long
     */
    
    public long sumaExistencias() {
        long suma = 0;
        for (Producto producto : productos) {
            suma += producto.getExistencias();
        }
        return suma;
    }
    
    /**
     * Obtiene la suma total de todos los precios
     * @return int
     */
    
    public double sumaPrecios() {
        double suma = 0;
        for (Producto producto : productos) {
            suma += producto.getPrecio();
        }
        return suma;
    }
    
    /**
     * Obtiene la media de precios de los productos
     * @return double
     */
    
    public double mediaPrecios() {
        return sumaPrecios() / numProductos();
    }
    
    /**
     * Obtiene la media de la existencias de los productos
     * @return double
     */
    
    public double mediaExistencias() {
        return sumaExistencias() / numProductos();
    }
    
    /**
     * Obtiene el número de productos de la lista
     * @return 
     */
    
    public int numProductos() {
        return productos.size();
    }
    
    /**
     * Ordena los productos alfabeticamente por categoría y nombre de producto
     */
    
    public void ordenarCategoriaProducto() {
        Collections.sort(productos, new NombreCategoriaProductoComparator());
    }
    
    /**
     * Ordena los productos de menor a mayor precio
     */
    
    public void ordenarPreciosAsc() {
        Collections.sort(productos, new PreciosComparatorAsc());
    }
    
    /**
     * Ordena los productos de mayor a menor precio
     */
    
    public void ordenarPreciosDesc() {
        Collections.sort(productos, new PreciosComparatorDesc());
    }
    
    /**
     * Ordena los productos de menor a mayor existencias
     */
    
    public void ordenarExistenciasAsc() {
        Collections.sort(productos, new ExistenciasComparatorAsc());
    }
    
    /**
     * Ordena los productos de mayor a menor existencias
     */
    
    public void ordenarExistenciasDesc() {
        Collections.sort(productos, new ExistenciasComparatorDesc());
    }
    
    /**
     * Ordena los productos alfabeticamente por nombre
     */
    
    public void ordenarNombreProductoAlfa() {
        Collections.sort(productos, new NombreProductoComparator());
    }
    
    /**
     * Busca el producto con el nombre indicado
     * @param nombre
     * @return List
     */
    
    public Producto buscarProducto(String nombre) {
        ordenarNombreProductoAlfa();
        int indice = Collections.binarySearch(productos, 
                new Producto(nombre, null, 0, 0), new NombreProductoComparator());
        if (indice >= 0) {
            return productos.get(indice);
        }
        return null;
    }
    
    /**
     * Borra el producto con el nombre indicado
     * @param nombre
     * @return List
     */
    
    public boolean borrarProducto(String nombre) {
        Producto producto = buscarProducto(nombre);
        return productos.remove(producto);
    }
    
    /**
     * Obtiene el producto con mayor nº de existencias
     * @return Producto
     */
    
    public Producto productoMayorExistencias() {
        return Collections.max(productos, new ExistenciasComparator());
    }
    
    /**
     * Convierte un objeto Producto en un List
     * @param producto
     * @return List
     */
    
    public List asListProducto(Producto producto) {
        List lista = new ArrayList();
        lista.add(producto.getNombre());
        lista.add(producto.getCategoria());
        lista.add(producto.getExistencias());
        lista.add(producto.getPrecio());
        return lista;
    }
    
    
    public List asListProductoMasExistencias(Producto producto) {
        List lista = new ArrayList();
        lista.add(producto.getNombre());
        lista.add(producto.getExistencias());
        return lista;
    }
    
    
    public List<List> asListaProductosMasExistencias(List<Producto> productos) {
        List lista = new ArrayList();
        for (Producto producto : productos) {
            if (producto.getExistencias() == productoMayorExistencias().getExistencias()) {
                lista.add(asListProductoMasExistencias(producto));
            }
        }
        return lista;
    }
    
    
    public List<List> asListaTotales() {
        ordenarCategoriaProducto();
        String categoria, categoriaAux = "";
        double precioMedio_1, existenciaMedia_1, precioMedio_2,
                existenciaMedia_2, sumaPrecios;
        long numProductos, sumaExistencias;
        List<List> listado = new ArrayList();
        List lista = new ArrayList();
        
        for (Producto producto : productos) {
            categoria = producto.getCategoria();
            sumaExistencias = producto.getExistencias();
            sumaPrecios = producto.getPrecio();
            existenciaMedia_2 = mediaExistencias();
            precioMedio_2 = mediaPrecios();
            
            if (categoria.equals(categoriaAux)) {
                numProductos = (long) lista.get(1) + 1;
                sumaExistencias = (long) lista.get(2) + sumaExistencias;
                sumaPrecios = (double) lista.get(3) + sumaPrecios;
                existenciaMedia_1 = (double) (sumaExistencias / numProductos);
                precioMedio_1 = (double) (sumaPrecios / numProductos);
                lista.set(1, numProductos);
                lista.set(2, sumaExistencias);
                lista.set(3, sumaPrecios);
                lista.set(4, existenciaMedia_1);
                lista.set(5, precioMedio_1);
            } else {
                lista = new ArrayList();
                lista.add(categoria);
                lista.add(1L);
                lista.add(sumaExistencias);
                lista.add(sumaPrecios);
                lista.add(sumaExistencias);
                lista.add(sumaPrecios);
                listado.add(lista);
                categoriaAux = categoria;
            }
        }
        
        return listado;
    }
    
    /**
     * Convierte una lista de objetos Producto en un list de list con los datos
     * de cada producto
     * @param productos
     * @return List
     */
    public List<List> asListaProductos(List<Producto> productos) {
        List<List> lista = new ArrayList();
        for (Producto producto : productos) {
            lista.add(asListProducto(producto));
        }
        return lista;
    }
    
}