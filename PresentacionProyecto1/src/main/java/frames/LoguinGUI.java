package frames;

import Login.IAutenticar;
import Login.Login;
import Usuarios.ListaUsuarios;
import Usuarios.Usuario;
import javax.swing.JOptionPane;

public class LoguinGUI extends javax.swing.JFrame {

    private IAutenticar autenticador;

    public LoguinGUI() {
        initComponents();
        usuarioTxt.setBackground(new java.awt.Color(0, 0, 0, 1));
        contraTxt.setBackground(new java.awt.Color(0, 0, 0, 1));

        // Inicializar el autenticador con usuarios de ejemplo
        ListaUsuarios listaUsuarios = new ListaUsuarios();
        listaUsuarios.agregarUsuario(new Usuario(1234, "contraseña1"));
        listaUsuarios.agregarUsuario(new Usuario(5678, "contraseña2"));
        autenticador = new Login(listaUsuarios);
    }


    private void BtnEntrarMouseClicked(java.awt.event.MouseEvent evt) {
        try {
            int pinUsuario = Integer.parseInt(usuarioTxt.getText());
            String contraseñaUsuario = new String(contraTxt.getPassword());

            if (autenticador.autenticar(pinUsuario, contraseñaUsuario)) {
                JOptionPane.showMessageDialog(null, "¡Autenticación exitosa!");
                Inventario n = new Inventario();
                n.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "¡Autenticación fallida!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un PIN válido.");
        }
    }

    private void usuarioTxtActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoguinGUI().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel BtnEntrar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPasswordField contraTxt;
    private javax.swing.JTextField usuarioTxt;



    private void initComponents() {//GEN-BEGIN:initComponents
        setLayout(new java.awt.BorderLayout());

    }//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
