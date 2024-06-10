package ControlEliminar;

import DTOs.ProductoDTO;

public class EliminarProducto implements ControlEliminar {
    @Override
    public void eliminarProducto(ProductoDTO producto) throws EliminarProductoException {
        if (producto == null) {
            throw new EliminarProductoException("El producto no puede ser nulo");
        }
        // Implementación para eliminar un producto
        System.out.println("Producto con ID " + producto.getId() + " ha sido eliminado.");
    }
}
