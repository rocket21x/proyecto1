/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jesus
 */
public class ListaUsuarios {
    private List<Usuario> usuarios;

    public ListaUsuarios() {
        usuarios = new ArrayList<>();
        // Añadir usuarios predefinidos (solo como ejemplo)
        usuarios.add(new Usuario(1234, "contraseña1"));
        usuarios.add(new Usuario(5678, "contraseña2"));
    }

    public boolean agregarUsuario(Usuario usuario) {
        // Podrías implementar la lógica para verificar si ya existe el usuario antes de agregarlo
        return usuarios.add(usuario);
    }

    public Usuario buscarUsuario(int pin) {
        for (Usuario usuario : usuarios) {
            if (usuario.getPin() == pin) {
                return usuario;
            }
        }
        return null; // Si no se encuentra el usuario
    }
    
}
