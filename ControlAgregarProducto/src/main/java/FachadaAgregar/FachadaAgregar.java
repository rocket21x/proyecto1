
package FachadaAgregar;

import ControlAgregar.AgregarProducto;
import ControlAgregar.AgregarProductoException;
import DTOs.ProductoDTO;
import java.util.List;

/**
 * Fachada para el control de productos.
 */
public class FachadaAgregar {

    private AgregarProducto agregarProductoControl;

    public FachadaAgregar() {
        agregarProductoControl = new AgregarProducto();
    }

    /**
     * Agrega un producto a la lista de productos.
     *
     * @param producto El producto a agregar.
     * @throws AgregarProductoException Si ocurre un error al agregar el producto.
     */
    public void agregarProducto(ProductoDTO producto) throws AgregarProductoException {
        agregarProductoControl.AgregarProducto(producto);
    }

    /**
     * Obtiene la lista de productos agregados.
     *
     * @return La lista de productos.
     */
    public List<ProductoDTO> obtenerProductos() {
        return agregarProductoControl.obtenerProductos();
    }

   
}
