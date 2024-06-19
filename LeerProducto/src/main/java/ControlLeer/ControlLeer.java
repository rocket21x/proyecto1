package ControlLeer;

import productoBO.ProductoBO;

public interface ControlLeer {
    
    
    ProductoBO leerProducto(int id) throws LeerProductoException;
}
