
package frames;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * @author osval
 */
public class LoginGUI extends javax.swing.JFrame {

    private static final String ARCHIVO_GERENTE = "Gerente.txt";

    public LoginGUI() {

        initComponents();
        usuarioTxt.setBackground(new java.awt.Color(0,0,0,1));
        contraTxt.setBackground(new java.awt.Color(0,0,0,1));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuarioTxt = new javax.swing.JTextField();
        contraTxt = new javax.swing.JPasswordField();
        BtnEntrar = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuarioTxt.setBackground(new java.awt.Color(50, 53, 52));
        usuarioTxt.setFont(new java.awt.Font("Bangers", 0, 36)); // NOI18N
        usuarioTxt.setForeground(new java.awt.Color(255, 255, 255));
        usuarioTxt.setToolTipText("");
        usuarioTxt.setBorder(null);
        usuarioTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioTxtActionPerformed(evt);
            }
        });
        getContentPane().add(usuarioTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 270, 40));

        contraTxt.setBackground(new java.awt.Color(50, 53, 52));
        contraTxt.setFont(new java.awt.Font("Bangers", 0, 24)); // NOI18N
        contraTxt.setForeground(new java.awt.Color(255, 255, 255));
        contraTxt.setBorder(null);
        getContentPane().add(contraTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 270, 40));

        BtnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEntrarMouseClicked(evt);
            }
        });
        getContentPane().add(BtnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, 230, 50));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Login.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEntrarMouseClicked
        boolean valido = false;
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO_GERENTE))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                String usuario = partes[0];
                String contraseñaAlmacenada = partes[1];
                if (usuario.equals(usuarioTxt.getText()) && contraseñaAlmacenada.equals(new String(contraTxt.getPassword()))) {
                    valido = true;
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de gerentes: " + e.getMessage());
        }
        if (valido) {

            MenuGUI menu = new MenuGUI();
            menu.setVisible(valido);
            this.dispose();
        }
        else {
            JOptionPane.showMessageDialog(null,"No es valido este usuario");
        }
    }//GEN-LAST:event_BtnEntrarMouseClicked

    private void usuarioTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioTxtActionPerformed
        
    }//GEN-LAST:event_usuarioTxtActionPerformed

    
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
//            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//    java.awt.EventQueue.invokeLater(new Runnable() {
//    public void run() {new LoginGUI().setVisible(true);}});}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnEntrar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPasswordField contraTxt;
    private javax.swing.JTextField usuarioTxt;
    // End of variables declaration//GEN-END:variables
}
