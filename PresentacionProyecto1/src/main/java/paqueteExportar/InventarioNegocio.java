
package paqueteExportar;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Luis Eduardo Garces Rodriguez
 */
public class InventarioNegocio {
    
    private Map<Producto, Integer> productos;

    public InventarioNegocio() {
        this.productos = new HashMap<>();
    }

    public void agregarProducto(Producto producto, int cantidad) {
        productos.put(producto, productos.getOrDefault(producto, 0) + cantidad);
    }

    public void actualizarStock(Producto producto, int cantidad) {
        productos.put(producto, cantidad);
    }

    public Map<Producto, Integer> getProductos() {
        return productos;
    }
}
