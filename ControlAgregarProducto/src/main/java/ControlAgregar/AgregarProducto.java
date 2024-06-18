package ControlAgregar;

import DTOs.ProductoDTO;
import java.util.ArrayList;
import java.util.List;

public class AgregarProducto implements IControlAgregar {

    private List<ProductoDTO> productos = new ArrayList<>();

    @Override
    public void AgregarProducto(ProductoDTO producto) throws AgregarProductoException {
        ValidarProducto(producto);
        productos.add(producto);
    } 

    public List<ProductoDTO> obtenerProductos() {
        return productos;
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

        // Validación de valores únicos
        for (ProductoDTO p : productos) {
            if (p.getId() == producto.getId()) {
                throw new AgregarProductoException("El ID del producto debe ser único.");
            }
        }
    }
}
