package ControlLeer;

import DTOs.ProductoDTO;

public class LeerProducto implements ControlLeer {
    @Override
    public ProductoDTO leerProducto(int id) throws LeerProductoException {
        // Aquí normalmente tendrías lógica para buscar el producto en la base de datos
        // En este ejemplo, simplemente creamos un ProductoDTO ficticio para devolverlo
        if (id <= 0) {
            throw new LeerProductoException("El ID del producto debe ser un número positivo");
        }
        return new ProductoDTO(id, "Producto Ejemplo", 50.0, 20, "Descripcion del producto");
    }
}
