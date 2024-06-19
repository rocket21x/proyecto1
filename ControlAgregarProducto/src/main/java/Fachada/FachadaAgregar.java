
package Fachada;

import ControlAgregar.AgregarProducto;
import ControlAgregar.AgregarProductoException;
import ControlAgregar.IControlAgregar;
import java.util.List;
import productoBO.ProductoBO;

/**
 * Fachada para el control de productos.
 */
public class FachadaAgregar  {

private IControlAgregar control;


    public FachadaAgregar(IControlAgregar control) {
        this.control = control;
    }

    public void agregarProducto(ProductoBO producto) throws AgregarProductoException {
        control.ValidarProducto(producto);
        control.AgregarProducto(producto);
    }
   
}
