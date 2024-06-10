package ControlAgregar;

import DTOs.ProductoDTO;
import java.util.ArrayList;
import java.util.List;

public class AgregarProducto implements IControlAgregar {

    private List<ProductoDTO> productos = new ArrayList<>();

    @Override
    public void AgregarProducto(ProductoDTO producto) throws AgregarProductoException {
        productos.add(producto);
    }

    public List<ProductoDTO> obtenerProductos() {
        return productos;
    }
}
