
package com.mycompany.banco;

/**
 *
 * @author osval
 */
public class Banco {
    // Método que simula la verificación de un pago
    public boolean verificarPago(String numeroTarjeta, double monto) {
        // Validación básica: la tarjeta no debe estar vacía y el monto debe ser mayor que cero
        if (numeroTarjeta.isEmpty()) {
            System.out.println("Número de tarjeta vacío. El pago no puede ser verificado.");
            return false;
        }

        if (monto <= 0) {
            System.out.println("Monto inválido. El pago no puede ser verificado.");
            return false;
        }

        // Si pasan las validaciones básicas, el pago es exitoso
        System.out.println("Pago verificado correctamente.");
        return true;
    }
}
