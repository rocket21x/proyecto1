package ControlLeer;

import DTOs.ProductoDTO;

public interface ControlLeer {
    ProductoDTO leerProducto(int id) throws LeerProductoException;
}
