/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

/**
 *
 * @author osval
 */
import entity.Pedido;
import java.util.ArrayList;
import java.util.List;

public interface PedidoDAO {
    void crearPedido(Pedido pedido);
    List<Pedido> listarPedidos();
    Pedido consultarPedido(int id);
}


