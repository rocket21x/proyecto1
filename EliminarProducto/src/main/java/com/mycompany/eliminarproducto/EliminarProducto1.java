package com.mycompany.eliminarproducto;

import DTOs.ProductoDTO;
import FachadaEliminar.FachadaEliminar;
import ControlEliminar.ControlEliminar;
import ControlEliminar.EliminarProducto;

public class EliminarProducto1 {
    public static void main(String[] args) {
        // Crear un objeto ProductoDTO para eliminar
        ProductoDTO producto = new ProductoDTO(1, "Producto Ejemplo", 50.0, 20, "Descripcion del producto");

        // Crear una instancia de EliminarProducto y FachadaEliminar
        ControlEliminar control = new EliminarProducto();
        FachadaEliminar fachada = new FachadaEliminar(control);

        // Llamar al método para eliminar el producto
        fachada.eliminarProducto(producto);
    }
}
