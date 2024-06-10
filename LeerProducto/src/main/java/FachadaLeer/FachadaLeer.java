package FachadaLeer;

import ControlLeer.ControlLeer;
import ControlLeer.LeerProductoException;
import DTOs.ProductoDTO;

public class FachadaLeer {
    private ControlLeer control;

    public FachadaLeer(ControlLeer control) {
        this.control = control;
    }

    public ProductoDTO leerProducto(int id) {
        try {
            return control.leerProducto(id);
        } catch (LeerProductoException e) {
            e.printStackTrace();
            return null;
        }
    }
}
