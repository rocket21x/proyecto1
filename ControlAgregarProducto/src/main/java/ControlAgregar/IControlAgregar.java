
package ControlAgregar;

import java.util.List;
import productoBO.ProductoBO;

/**
 * Interfaz para el control de agregar un producto.
 */
public interface IControlAgregar {
    
        
        public void AgregarProducto(ProductoBO producto)throws AgregarProductoException;
        public void ValidarProducto(ProductoBO producto)throws AgregarProductoException;
        
    
    
}
