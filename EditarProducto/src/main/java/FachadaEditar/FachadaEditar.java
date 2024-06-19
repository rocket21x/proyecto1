package FachadaEditar;

import ControlEditar.ControlEditar;
import DTOs.ProductoDTO;

public class FachadaEditar {
    
    private ControlEditar control;

    public FachadaEditar() {
    }
    
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

