
package frames;

import ControlAgregar.AgregarProductoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author osval
 */
public class MenuGUI extends javax.swing.JFrame {

    public MenuGUI() {
        initComponents();
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnSalir = new javax.swing.JLabel();
        BtnRegistrarPromo = new javax.swing.JLabel();
        BtnRegistrarTrabajador = new javax.swing.JLabel();
        BtnCorteCaja = new javax.swing.JLabel();
        BtnCuentas = new javax.swing.JLabel();
        BtnInventario = new javax.swing.JLabel();
        BtnHistorialVentas = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSalirMouseClicked(evt);
            }
        });
        getContentPane().add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 610, 160, 70));

        BtnRegistrarPromo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRegistrarPromo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnRegistrarPromoMouseClicked(evt);
            }
        });
        getContentPane().add(BtnRegistrarPromo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 230, 140));

        BtnRegistrarTrabajador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRegistrarTrabajador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnRegistrarTrabajadorMouseClicked(evt);
            }
        });
        getContentPane().add(BtnRegistrarTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 230, 140));

        BtnCorteCaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCorteCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCorteCajaMouseClicked(evt);
            }
        });
        getContentPane().add(BtnCorteCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 230, 140));

        BtnCuentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCuentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCuentasMouseClicked(evt);
            }
        });
        getContentPane().add(BtnCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 230, 140));

        BtnInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnInventarioMouseClicked(evt);
            }
        });
        getContentPane().add(BtnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 230, 140));

        BtnHistorialVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnHistorialVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnHistorialVentasMouseClicked(evt);
            }
        });
        getContentPane().add(BtnHistorialVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 230, 140));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnHistorialVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnHistorialVentasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnHistorialVentasMouseClicked

    private void BtnInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnInventarioMouseClicked
        Inventario inventario = null;
        inventario = new Inventario();
        inventario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnInventarioMouseClicked

    private void BtnCuentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCuentasMouseClicked
        
    }//GEN-LAST:event_BtnCuentasMouseClicked

    private void BtnCorteCajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCorteCajaMouseClicked
        
    }//GEN-LAST:event_BtnCorteCajaMouseClicked

    private void BtnRegistrarTrabajadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRegistrarTrabajadorMouseClicked
        
    }//GEN-LAST:event_BtnRegistrarTrabajadorMouseClicked

    private void BtnRegistrarPromoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRegistrarPromoMouseClicked
        
    }//GEN-LAST:event_BtnRegistrarPromoMouseClicked

    private void BtnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseClicked
        
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Seguro que desea cerrar sesión?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION);
        
        if (respuesta == JOptionPane.YES_OPTION) {
            LoginGUI menu = new LoginGUI();
            menu.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_BtnSalirMouseClicked


//    public static void main(String args[]) {
//    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//    java.awt.EventQueue.invokeLater(new Runnable() {
//    public void run() {new MenuGUI().setVisible(true);}});}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnCorteCaja;
    private javax.swing.JLabel BtnCuentas;
    private javax.swing.JLabel BtnHistorialVentas;
    private javax.swing.JLabel BtnInventario;
    private javax.swing.JLabel BtnRegistrarPromo;
    private javax.swing.JLabel BtnRegistrarTrabajador;
    private javax.swing.JLabel BtnSalir;
    private javax.swing.JLabel Fondo;
    // End of variables declaration//GEN-END:variables
}
