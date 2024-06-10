package ControlEditar;



public class EditarProducto implements ControlEditar {
    @Override
    public void editarProducto(ProductoDTO producto) {
        // Implementación para editar un producto
        // Ejemplo de modificación de algunos campos:
        producto.setNombre("Nuevo Nombre");
        producto.setPrecio(99.99);
        producto.setStock(10);
        producto.setDescripcion("Nueva descripción del producto");
    }
}
