package ControlLeer;

import java.util.List;
import productoBO.ProductoBO;

public class LeerProducto implements ControlLeer {
    
    private List<ProductoBO> listaProductos;

    public LeerProducto() {
    }

    
    
    public LeerProducto(List<ProductoBO> listaProductos) {
        
        System.out.println("Entro LeerProducto");
        this.listaProductos = listaProductos;
    }

    @Override
    public ProductoBO leerProducto(int id) throws LeerProductoException {
        for (ProductoBO producto : listaProductos) {
            if (producto.getId() == id) {
                return new ProductoBO(
                    producto.getId(),
                    producto.getNombre(),
                    producto.getPrecio(),
                    producto.getStock()
                );
            }
        }
        throw new LeerProductoException("Producto no encontrado con ID: " + id);
    }
}
