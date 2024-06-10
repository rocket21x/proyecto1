package Usuarios;

import java.util.HashMap;
import java.util.Map;

public class ListaUsuarios {
    private Map<Integer, Usuario> usuarios;

    public ListaUsuarios() {
        usuarios = new HashMap<>();
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.put(usuario.getPin(), usuario);
    }

    public Usuario obtenerUsuario(int pin) {
        return usuarios.get(pin);
    }
}

