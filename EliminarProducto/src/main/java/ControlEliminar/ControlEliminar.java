package ControlEliminar;

import DTOs.ProductoDTO;

public interface ControlEliminar {
    public void eliminarProducto(int id) throws EliminarProductoException;
}
