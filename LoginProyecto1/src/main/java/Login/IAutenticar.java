/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Login;



/**
 *
 * @author jesus
 */
public interface IAutenticar {
    
    boolean autenticar(int pin, String contraseña);
    void cerrarSesion();
    
}
