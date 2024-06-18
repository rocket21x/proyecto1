package ControlEliminar;


import productoBO.ProductoBO;
import DTOs.ProductoDTO;

public class EliminarProducto implements ControlEliminar {
    private ProductoBO productoBO;
    private ProductoDTO productoDTO;

    @Override
    public void eliminarProducto(int id) throws EliminarProductoException {
        if (productoBO.getId() == id) {
            productoBO = null;
            
        }
    }
    
    
    
    
  
}
