/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ControlAgregar;

import DTOs.ProductoDTO;

/**
 *
 * @author jesus
 */
public interface IControlAgregar {
    

        public void AgregarProducto(ProductoDTO producto)throws AgregarProductoException;
        public void ValidarProducto(ProductoDTO producto)throws AgregarProductoException;
        
        
    
    
}
