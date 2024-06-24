package com.mycompany.verificapago;

import com.mycompany.banco.Banco;


public class VerificaPago implements IVerificaPago {
    private Banco sistemaBanco; // Suponiendo que Banco es una clase externa

    // Constructor que recibe el sistema del banco
    public VerificaPago(Banco sistemaBanco) {
        this.sistemaBanco = sistemaBanco;
    }

    // Implementación del método de la interfaz
    @Override
    public boolean verificarPago(String numeroTarjeta, double monto) {
        // Lógica para verificar el pago utilizando el sistema del banco
        boolean pagoExitoso = sistemaBanco.verificarPago(numeroTarjeta, monto);
        return pagoExitoso;
    }
}
