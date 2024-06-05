/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

import Usuarios.ListaUsuarios;
import Usuarios.Usuario;

/**
 *
 * @author jesus
 */
public class Login implements IAutenticar{
       private ListaUsuarios listaUsuarios;

       public Login(ListaUsuarios listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    @Override
    public boolean autenticar(int pin, String contraseña) {
        Usuario usuario = listaUsuarios.buscarUsuario(pin);
        if (usuario != null && usuario.getContraseña().equals(contraseña)) {
            return true; // Autenticación exitosa
        }
        return false; // Autenticación fallida
    }

    @Override
    public void cerrarSesion() {
        // Lógica para cerrar sesión si es necesario
    }
    
}
