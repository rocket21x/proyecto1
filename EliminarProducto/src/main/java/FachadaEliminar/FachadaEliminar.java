package FachadaEliminar;

import ControlEliminar.ControlEliminar;
import DTOs.ProductoDTO;
import ControlEliminar.EliminarProductoException;

public class FachadaEliminar {
    private ControlEliminar control;

    public FachadaEliminar(ControlEliminar control) {
        this.control = control;
    }

    public void eliminarProducto(ProductoDTO producto) {
        try {
            control.eliminarProducto(producto);
        } catch (EliminarProductoException e) {
            e.printStackTrace();
        }
    }
}
