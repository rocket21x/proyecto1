package com.mycompany.loginproyecto1;

import Login.IAutenticar;
import Login.Login;
import Usuarios.ListaUsuarios;
import Usuarios.Usuario;

/**
 *
 * @author jesus
 */
public class LoginProyecto1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Crear una instancia de la lista de usuarios y agregar algunos usuarios de ejemplo
        ListaUsuarios listaUsuarios = new ListaUsuarios();
        listaUsuarios.agregarUsuario(new Usuario(1234, "contraseña1"));
        listaUsuarios.agregarUsuario(new Usuario(5678, "contraseña2"));

        // Crear una instancia del autenticador usando la implementación de Login
        IAutenticar autenticador = new Login(listaUsuarios);

        // Simular la entrada del usuario (PIN y contraseña)
        int pinUsuario = 1234; // PIN ingresado por el usuario
        String contraseñaUsuario = "contraseña1"; // Contraseña ingresada por el usuario

        // Realizar la autenticación
        if (autenticador.autenticar(pinUsuario, contraseñaUsuario)) {
            System.out.println("¡Autenticación exitosa!");
        } else {
            System.out.println("¡Autenticación fallida!");
        }
    }
}
