package ControlLeer;

import DTOs.ProductoDTO;
import productoBO.ProductoBO;

public class LeerProducto implements ControlLeer {
    
    private ProductoBO productoBO;
    private ProductoDTO productoDTO;

    public LeerProducto(ProductoBO productoBO) {
        this.productoBO = productoBO;
    }

    @Override
    public ProductoDTO leerProducto(int id) throws LeerProductoException {
        if (productoBO.getId() == id) {
            return new ProductoDTO(
                productoBO.getId(),
                productoBO.getNombre(),
                productoBO.getPrecio(),
                productoBO.getStock(),
                productoBO.getDescripcion());
        
    }
        return null; 

    }
}
    

