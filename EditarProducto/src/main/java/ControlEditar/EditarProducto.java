package ControlEditar;
import productoBO.ProductoBO;
import DTOs.ProductoDTO;

public class EditarProducto implements ControlEditar {
    private ProductoBO productoBO;
    private ProductoDTO productoDTO;

    public EditarProducto(ProductoBO productoBO) {
        this.productoBO = productoBO;
    }
    
    @Override
    public void editarProducto(ProductoDTO producto) {
        // Implementación para editar un producto
         productoBO.setId(producto.getId());
        productoBO.setNombre(producto.getNombre());
        productoBO.setPrecio(producto.getPrecio());
        productoBO.setStock(producto.getStock());
        productoBO.setDescripcion(producto.getDescripcion());
    }
}

