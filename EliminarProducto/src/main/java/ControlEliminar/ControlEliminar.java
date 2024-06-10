package ControlEliminar;

import DTOs.ProductoDTO;

public interface ControlEliminar {
    void eliminarProducto(ProductoDTO producto) throws EliminarProductoException;
}
