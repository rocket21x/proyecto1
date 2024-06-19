
package productoBO;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase ProductoBO
 */
public class ProductoBO {
    
        //ATRIBUTOS
        private int id;
        private String nombre;
        private double precio;
        private int stock;
        List <ProductoBO> productos = new ArrayList<>();

    public ProductoBO() {
    }
        
        
        
    //CONSTRUCTOR GETTER Y SETTERS PARA PRODUCTOBO
    public ProductoBO(ProductoBO producto) {
        
        this.productos.add(producto);
    }    
        
    
    
    public ProductoBO(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public List<ProductoBO> getProductos() {
        return productos;
    }

    public void setProductos(List<ProductoBO> productos) {
        System.out.println(productos);
        System.out.println("asdass setproductos");
        this.productos = productos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
}
