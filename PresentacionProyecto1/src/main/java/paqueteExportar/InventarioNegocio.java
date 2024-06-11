
package paqueteExportar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import DTOs.ProductoDTO;

/**
 * @author Luis Eduardo Garces Rodriguez
 */
public class InventarioNegocio {
    
private List<ProductoDTO> listaProductos;

    public InventarioNegocio() {
        listaProductos = new ArrayList<>();
    }

    public void agregarProducto(ProductoDTO producto, int stock) {
        listaProductos.add(producto);
    }

    public void eliminarProducto(int idProducto) {
        
        Iterator<ProductoDTO> iterator = listaProductos.iterator();
        while (iterator.hasNext()) {
            ProductoDTO producto = iterator.next();
            if (producto.getId() == idProducto) {
                iterator.remove();
                break;
            }
        }
    }

    public void actualizaProducto(int idProducto, ProductoDTO productoActualizado, int nuevoStock) {
        
        for (ProductoDTO producto : listaProductos) {
            if (producto.getId() == idProducto) {
                
                producto.setNombre(productoActualizado.getNombre());
                producto.setPrecio(productoActualizado.getPrecio());
                producto.setStock(nuevoStock);
                break;
            }
        }
    }

    public boolean existeProducto(int id) {
        for (ProductoDTO producto : listaProductos) {
            if (producto.getId() == id) {
                return true;}
        } return false;
    }
    
    public List<ProductoDTO> getProductos() {
        return listaProductos;
    }
}
