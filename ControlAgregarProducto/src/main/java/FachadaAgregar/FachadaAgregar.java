
package FachadaAgregar;

import ControlAgregar.AgregarProducto;
import ControlAgregar.AgregarProductoException;
import ControlAgregar.IControlAgregar;
import DTOs.ProductoDTO;
import java.util.List;

/**
 * Fachada para el control de productos.
 */
public class FachadaAgregar  {

    private IControlAgregar control;

    public FachadaAgregar(IControlAgregar control) {
        this.control = control;
    }

    public void AgregarProducto(ProductoDTO producto) throws AgregarProductoException {
        control.ValidarProducto(producto);
        control.AgregarProducto(producto);
        
    }

   
}
