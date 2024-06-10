package Usuarios;

public class Usuario {
    private int pin;
    private String contraseña;

    public Usuario(int pin, String contraseña) {
        this.pin = pin;
        this.contraseña = contraseña;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}

