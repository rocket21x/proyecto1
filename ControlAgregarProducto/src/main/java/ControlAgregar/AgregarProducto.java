/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlAgregar;

/**
 *
 * @author jesus
 */
import DTOs.ProductoDTO;
import java.util.ArrayList;
import java.util.List;

public class AgregarProducto implements IControlAgregar {

    private List<ProductoDTO> productos = new ArrayList<>();

    /**
     *
     * @param producto
     * @throws AgregarProductoException
     */
    @Override
    public void AgregarProducto(ProductoDTO producto) throws AgregarProductoException {
        productos.add(producto);

    }

}
