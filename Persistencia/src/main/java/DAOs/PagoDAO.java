/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

/**
 *
 * @author osval
 */
import entity.Pago;
import java.util.ArrayList;
import java.util.List;

public interface PagoDAO {
    void crearPago(Pago pago);
    List<Pago> listarPagos();
    Pago consultarPago(int id);
}