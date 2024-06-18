
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

    private AgregarProducto agregarProductoControl;

    public FachadaAgregar() {
        agregarProductoControl = new AgregarProducto();
    }

    

    /**
     * Obtiene la lista de productos agregados.
     *
     * @return La lista de productos.
     */

    public void AgregarProducto(ProductoDTO producto) throws AgregarProductoException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
