package FachadaEditar;

import ControlEditar.ControlEditar;
import com.mycompany.productodto.ProductoDTO;

public class FachadaEditar {
    private ControlEditar control;

    public FachadaEditar(ControlEditar control) {
        this.control = control;
    }

    public void editarProducto(ProductoDTO producto) {
        try {
            control.editarProducto(producto);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

