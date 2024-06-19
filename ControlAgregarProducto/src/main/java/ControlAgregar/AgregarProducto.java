package ControlAgregar;

import java.util.ArrayList;
import java.util.List;
import productoBO.ProductoBO;

public class AgregarProducto implements IControlAgregar {

    
    private List<ProductoBO> listaProductos = new ArrayList<>();
    ProductoBO instanciaProductoBO = new ProductoBO();

    @Override
    public void AgregarProducto(ProductoBO nuevoProducto) throws AgregarProductoException {    
        listaProductos.add(nuevoProducto);
        instanciaProductoBO.setProductos(listaProductos);
        System.out.println("5");
    } 
    
    @Override
    public void ValidarProducto(ProductoBO producto) throws AgregarProductoException {
        // Validaciones de los campos del producto
        if (producto.getNombre() == null || producto.getNombre().trim().isEmpty()) {
            throw new AgregarProductoException("El nombre del producto es obligatorio.");
        }
        if (producto.getPrecio() < 0) {
            throw new AgregarProductoException("El precio del producto no puede ser negativo.");
        }
        if (producto.getStock() < 0) {
            throw new AgregarProductoException("El stock del producto no puede ser negativo.");
        }
        System.out.println("4");
    }
    
}
