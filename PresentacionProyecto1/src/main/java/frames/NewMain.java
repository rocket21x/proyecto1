/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frames;

import ControlLeer.LeerProducto;
import ControlLeer.LeerProductoException;
import java.util.ArrayList;
import java.util.List;
import productoBO.ProductoBO;

/**
 *
 * @author jesus
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        
        List<ProductoBO> listaProductos = new ArrayList<>();
        listaProductos.add(new ProductoBO(1, "Producto A", 100.0, 10));
        listaProductos.add(new ProductoBO(2, "Producto B", 200.0, 20));
        listaProductos.add(new ProductoBO(3, "Producto C", 300.0, 30));

        // Creación de instancia de LeerProducto con la lista de productos
        LeerProducto leerProducto = new LeerProducto(listaProductos);

        // Ejemplo de uso
        try {
            ProductoBO productoEncontrado = leerProducto.leerProducto(3);
            System.out.println("Producto encontrado: " + productoEncontrado);
        } catch (LeerProductoException e) {
            System.err.println(e.getMessage());
        }
        
        
        
        // TODO code application logic here
        
        // Crear y mostrar la instancia de LoginGUI
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
    }
    
}
