/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.verificapago;

/**
 *
 * @author osval
 */
public class VerificaPagoControl {
    private IVerificaPago verificador;

    // Constructor que recibe una instancia de IVerificaPago
    public VerificaPagoControl(IVerificaPago verificador) {
        this.verificador = verificador;
    }

    // Método para iniciar la verificación de un pago
    public boolean iniciarVerificacion(String numeroTarjeta, double monto) {
        boolean resultado = verificador.verificarPago(numeroTarjeta, monto);
        // Aquí podrían añadirse más lógica según sea necesario
        return resultado;
    }
}
