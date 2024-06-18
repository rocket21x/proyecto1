package ControlAgregar;

import DTOs.ProductoDTO;
import java.util.ArrayList;
import java.util.List;
import productoBO.ProductoBO;

public class AgregarProducto implements IControlAgregar {

    
    private ProductoBO productoBO;
    private ProductoDTO productoDTO;

    public AgregarProducto(ProductoBO productoBO) {
        this.productoBO = productoBO;
    }

    @Override
    public void AgregarProducto(ProductoDTO nuevoProducto) throws AgregarProductoException {
        
        ProductoBO producto = new ProductoBO(
            nuevoProducto.getId(),
            nuevoProducto.getNombre(),
            nuevoProducto.getPrecio(),
            nuevoProducto.getStock(),
            nuevoProducto.getDescripcion()
        );

        // Lógica para registrar el producto, por ejemplo, validaciones
        productoBO.setId(producto.getId());
        productoBO.setNombre(producto.getNombre());
        productoBO.setPrecio(producto.getPrecio());
        productoBO.setStock(producto.getStock());
        productoBO.setDescripcion(producto.getDescripcion());

       
    } 

    

    @Override
    public void ValidarProducto(ProductoDTO producto) throws AgregarProductoException {
        // Validación de campos obligatorios
        if (producto.getNombre() == null || producto.getNombre().trim().isEmpty()) {
            throw new AgregarProductoException("El nombre del producto es obligatorio.");
        }
        if (producto.getDescripcion() == null || producto.getDescripcion().trim().isEmpty()) {
            throw new AgregarProductoException("La descripción del producto es obligatoria.");
        }
        if (producto.getPrecio() < 0) {
            throw new AgregarProductoException("El precio del producto no puede ser negativo.");
        }
        if (producto.getStock() < 0) {
            throw new AgregarProductoException("El stock del producto no puede ser negativo.");
        }
        

        
        
    }
}
