package Login;


import Usuarios.ListaUsuarios;
import Usuarios.Usuario;

public class Login implements IAutenticar {
    private ListaUsuarios listaUsuarios;

    public Login(ListaUsuarios listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    @Override
    public boolean autenticar(int pin, String password) {
        Usuario usuario = listaUsuarios.obtenerUsuario(pin);
        return usuario != null && usuario.getContraseña().equals(password);
    }
}

