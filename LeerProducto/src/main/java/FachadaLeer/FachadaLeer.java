package FachadaLeer;

import ControlLeer.ControlLeer;
import ControlLeer.LeerProductoException;
import productoBO.ProductoBO;

public class FachadaLeer {
    
    
    private ControlLeer control = new ControlLeer() {
        @Override
        public ProductoBO leerProducto(int id) throws LeerProductoException {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }; // No es necesario inicializarlo a null aquí

    
    public FachadaLeer(ControlLeer control) {
        this.control = control;
    }

    public ProductoBO leerProducto(int id) throws LeerProductoException {
        if (control == null) {
            throw new IllegalStateException("El controlador no ha sido inicializado correctamente.");
        }

        return control.leerProducto(id);
    }
}
