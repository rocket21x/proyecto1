package com.mycompany.leerproducto;

import DTOs.ProductoDTO;
import FachadaLeer.FachadaLeer;
import ControlLeer.ControlLeer;
import ControlLeer.LeerProducto;

public class LeerProducto1 {
    public static void main(String[] args) {
        // ID del producto que queremos leer
        int idProducto = 1;

        // Crear una instancia de LeerProducto y FachadaLeer
        ControlLeer control = new LeerProducto();
        FachadaLeer fachada = new FachadaLeer(control);

        // Llamar al método para leer el producto
        ProductoDTO producto = fachada.leerProducto(idProducto);

        // Imprimir el producto leído
        if (producto != null) {
            System.out.println("Producto leido:");
            System.out.println("ID: " + producto.getId());
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Stock: " + producto.getStock());
            System.out.println("Descripcion: " + producto.getDescripcion());
        } else {
            System.out.println("No se pudo leer el producto con ID " + idProducto);
        }
    }
}
