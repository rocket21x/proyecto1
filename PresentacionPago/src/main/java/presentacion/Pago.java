package presentacion;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author osval
 */
public class Pago extends javax.swing.JFrame {

    /**
     * Creates new form Pago
     */
    public Pago() {
        initComponents();
        transparenciaBtn();
        setLocationRelativeTo(null);
        customizeTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnEfectivo = new javax.swing.JButton();
        BtnTarjeta = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPago = new javax.swing.JTable();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnEfectivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Apagado/AEfectivoBtn.png"))); // NOI18N
        BtnEfectivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEfectivo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Apagado/AEfectivoBtn.png"))); // NOI18N
        BtnEfectivo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/M/efectivoBtn.png"))); // NOI18N
        BtnEfectivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEfectivoMouseClicked(evt);
            }
        });
        getContentPane().add(BtnEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 140, 70));

        BtnTarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Apagado/ATarjetaBtn.png"))); // NOI18N
        BtnTarjeta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnTarjeta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Apagado/ATarjetaBtn.png"))); // NOI18N
        BtnTarjeta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/M/tarjetaBtn.png"))); // NOI18N
        BtnTarjeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnTarjetaMouseClicked(evt);
            }
        });
        getContentPane().add(BtnTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 140, 70));

        BtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Apagado/AAtrasBtn2.png"))); // NOI18N
        BtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Apagado/AAtrasBtn2.png"))); // NOI18N
        BtnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/M/atrasBtn2.png"))); // NOI18N
        BtnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSalirMouseClicked(evt);
            }
        });
        getContentPane().add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 140, 70));

        TablaPago.setBackground(new java.awt.Color(51, 51, 51));
        TablaPago.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        TablaPago.setForeground(new java.awt.Color(255, 255, 255));
        TablaPago.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"# 1", "2", "1 Pastel de chocolate", "250"},
                {"# 2", "4", "1 Helado", "30"},
                {"# 3", "1", "5 Tacos", "160"}
            },
            new String [] {
                "No.Orden", "Mesa", "Platillos", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaPago.setGridColor(new java.awt.Color(102, 102, 102));
        TablaPago.setSelectionBackground(new java.awt.Color(117, 209, 255));
        jScrollPane1.setViewportView(TablaPago);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 370, 310));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/M/pago_Individual.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseClicked
        dispose();
    }//GEN-LAST:event_BtnSalirMouseClicked

    private void BtnEfectivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEfectivoMouseClicked
        int filaSeleccionada = TablaPago.getSelectedRow();
        if (filaSeleccionada != -1) {
            String noOrden = TablaPago.getValueAt(filaSeleccionada, 0).toString();
            String mesa = TablaPago.getValueAt(filaSeleccionada, 1).toString();
            String platillos = TablaPago.getValueAt(filaSeleccionada, 2).toString();
            String total = TablaPago.getValueAt(filaSeleccionada, 3).toString();

            // Crear instancia de Efectivo pasando la referencia de Pago actual
            new Efectivo(this, noOrden, mesa, platillos, total).setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una fila primero");
        }
    }//GEN-LAST:event_BtnEfectivoMouseClicked

    private void BtnTarjetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnTarjetaMouseClicked
        int filaSeleccionada = TablaPago.getSelectedRow();
        if (filaSeleccionada != -1) {
            String noOrden = TablaPago.getValueAt(filaSeleccionada, 0).toString();
            String mesa = TablaPago.getValueAt(filaSeleccionada, 1).toString();
            String platillos = TablaPago.getValueAt(filaSeleccionada, 2).toString();
            String total = TablaPago.getValueAt(filaSeleccionada, 3).toString();
            new Tarjeta(this, noOrden, mesa, platillos, total).setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una fila primero");
        }
    }//GEN-LAST:event_BtnTarjetaMouseClicked

    public void transparenciaBtn() {
        BtnEfectivo.setOpaque(false);
        BtnEfectivo.setContentAreaFilled(false);
        BtnEfectivo.setBorderPainted(false);
        BtnSalir.setOpaque(false);
        BtnSalir.setContentAreaFilled(false);
        BtnSalir.setBorderPainted(false);
        BtnTarjeta.setOpaque(false);
        BtnTarjeta.setContentAreaFilled(false);
        BtnTarjeta.setBorderPainted(false);
        TablaPago.setOpaque(false);
        jScrollPane1.setOpaque(false);
    }

    public JTable getTablaPago() {
        return TablaPago;
    }

    private void customizeTable() {
        // Personalizar alineaciones y estilos de la tabla
        TablaPago.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        TablaPago.getTableHeader().setOpaque(false);
        TablaPago.getTableHeader().setBackground(new Color(121, 129, 2));
        TablaPago.getTableHeader().setForeground(new Color(255, 255, 255));
        TablaPago.setRowHeight(30);
        TablaPago.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        TablaPago.setForeground(new Color(255, 255, 255));
        TablaPago.setBackground(new Color(51, 51, 51));
        TablaPago.setGridColor(new Color(102, 102, 102));

        // Personalizar alineaciones de columnas
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        TablaPago.getColumnModel().getColumn(0).setCellRenderer(centerRenderer); // No.Orden
        TablaPago.getColumnModel().getColumn(1).setCellRenderer(centerRenderer); // Mesa
        TablaPago.getColumnModel().getColumn(3).setCellRenderer(centerRenderer); // Total
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEfectivo;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnTarjeta;
    private javax.swing.JLabel Fondo;
    private javax.swing.JTable TablaPago;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
