package com.mycompany.editarproducto;

import DTOs.ProductoDTO;
import FachadaEditar.FachadaEditar;
import ControlEditar.ControlEditar;
import ControlEditar.EditarProducto;

public class EditarProducto1 {
    public static void main(String[] args) {
        // Crear un objeto ProductoDTO para editar
        ProductoDTO producto = new ProductoDTO(1, "Producto Ejemplo", 50.0, 20, "Descripción del producto");

        // Crear una instancia de EditarProducto y FachadaEditar
        ControlEditar control = new EditarProducto();  // Usar EditarProducto que implementa ControlEditar
        FachadaEditar fachada = new FachadaEditar(control);

        // Llamar al método para editar el producto
        fachada.editarProducto(producto);

        // Imprimir el producto editado
        System.out.println("Producto editado:");
        System.out.println("ID: " + producto.getId());
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio: " + producto.getPrecio());
        System.out.println("Stock: " + producto.getStock());
        System.out.println("Descripción: " + producto.getDescripcion());
    }
}


