/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

/**
 *
 * @author jesus
 */
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

    public String getContraseña() {
        return contraseña;
    }
    
}
