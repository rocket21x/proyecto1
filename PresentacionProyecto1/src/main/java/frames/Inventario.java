
package frames;

import ControlAgregar.AgregarProducto;
import Fachada.FachadaAgregar;
import FachadaLeer.FachadaLeer;
import FachadaEditar.FachadaEditar;
import ControlAgregar.AgregarProductoException;
import ControlEditar.ControlEditar;
import ControlEditar.EditarProducto;
import ControlLeer.ControlLeer;
import ControlLeer.LeerProducto;
import ControlLeer.LeerProductoException;
import DTOs.ProductoDTO;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import java.util.logging.Level;
import java.util.logging.Logger;
import productoBO.ProductoBO;

public class Inventario extends javax.swing.JFrame {
    
    
    //Aqui se hacen las instancias de las clases de los otros proyectos
    private FachadaAgregar fachadaAgregar;
    private FachadaLeer fachadaLeer;
    private FachadaEditar fachadaEditar;
    
    
//    public Inventario(ControlLeer controlLeer) {
//        this.fachadaLeer = new FachadaLeer(controlLeer);
//    }

    
    public Inventario() {
        initComponents();
        inicializarFachadasYProductos();
        configurarCampos();
        actualizarTabla();
        
        setResizable(false);
        setLocationRelativeTo(null);
        setLocationByPlatform(false);
    }
    
    private void inicializarFachadasYProductos() {
        
        try {
            
            
            
            AgregarProducto controlAgregar = new AgregarProducto();
            this.fachadaAgregar = new FachadaAgregar(controlAgregar);
            
            
            LeerProducto leerProducto = new LeerProducto();
            this.fachadaLeer = new FachadaLeer(leerProducto);
            
            
            
            

            
            
            //EJEMPLOS, OBJETOS MOCK
            ProductoBO producto1 = new ProductoBO(1, "Pizza Peperoni", 120, 20);
            ProductoBO producto2 = new ProductoBO(2, "Pizza Jamon", 110, 25);
            ProductoBO producto3 = new ProductoBO(3, "Fetuccini Alfredo", 100, 30);
            ProductoBO producto4 = new ProductoBO(4, "Queso Fundido", 80, 20);
            ProductoBO producto5 = new ProductoBO(5, "Spagueti Bolognesa", 100, 20);

            //MANDANDO A CLASE FACHADAAGREGAR
            fachadaAgregar.agregarProducto(producto1);
            fachadaAgregar.agregarProducto(producto2);
            fachadaAgregar.agregarProducto(producto3);
            fachadaAgregar.agregarProducto(producto4);
            fachadaAgregar.agregarProducto(producto5);

        } catch (AgregarProductoException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void configurarCampos() {
        
        // CAMPOS TEXTO
        txtId.setBackground(new Color(0, 0, 0, 0));
        txtId.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        txtNombre.setBackground(new Color(0, 0, 0, 0));
        txtNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        txtPrecio.setBackground(new Color(0, 0, 0, 0));
        txtPrecio.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        txtStock.setBackground(new Color(0, 0, 0, 0));
        txtStock.setBorder(javax.swing.BorderFactory.createEmptyBorder());

        //VALIDACIONES REGULARES LOCALES
        
        txtId.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {validarCampos();}
            public void removeUpdate(DocumentEvent e) {validarCampos();}
            public void insertUpdate(DocumentEvent e) {validarCampos();}});

        txtPrecio.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {validarCampos();}
            public void removeUpdate(DocumentEvent e) {validarCampos();}
            public void insertUpdate(DocumentEvent e) {validarCampos();}});

        txtStock.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {validarCampos();}
            public void removeUpdate(DocumentEvent e) {validarCampos();}
            public void insertUpdate(DocumentEvent e) {validarCampos();}});
        
        txtId.setDocument(new javax.swing.text.PlainDocument());
        ((javax.swing.text.PlainDocument) txtId.getDocument()).setDocumentFilter(new NumberDocumentFilter());
        
        txtPrecio.setDocument(new javax.swing.text.PlainDocument());
        ((javax.swing.text.PlainDocument) txtPrecio.getDocument()).setDocumentFilter(new NumberDocumentFilter());
        
        txtStock.setDocument(new javax.swing.text.PlainDocument());
        ((javax.swing.text.PlainDocument) txtStock.getDocument()).setDocumentFilter(new NumberDocumentFilter());
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInventario = new javax.swing.JTable();
        btnRegresar = new javax.swing.JLabel();
        btnEditar = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JLabel();
        btnGenerarReporte = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventario");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Precio", "Stock"
            }
        ));
        jScrollPane1.setViewportView(tablaInventario);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 440, 270));

        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 170, 30));

        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 150, 30));

        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 140, 30));

        btnGenerarReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerarReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerarReporteMouseClicked(evt);
            }
        });
        jPanel1.add(btnGenerarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 170, 30));

        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 150, 30));
        jPanel1.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 232, 140, 20));
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 192, 140, 30));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 140, 20));

        txtId.setOpaque(true);
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 140, 20));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoInventario.jpg"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        MenuGUI menu = new MenuGUI();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked

//        int filaSeleccionada = tablaInventario.getSelectedRow();
//        if (filaSeleccionada == -1) {
//            Toolkit.getDefaultToolkit().beep();
//            JOptionPane.showMessageDialog(this, "Seleccione un producto para editar", "Alerta", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//
//        DefaultTableModel model = (DefaultTableModel) tablaInventario.getModel();
//
//        // OBTENER ATRIUBUTOS PRODUCTO SELECCIONADO
//        int id = (int) model.getValueAt(filaSeleccionada, 0);
//        String nombre = (String) model.getValueAt(filaSeleccionada, 1);
//        double precio = (double) model.getValueAt(filaSeleccionada, 2);
//        int stock = (int) model.getValueAt(filaSeleccionada, 3);
//        
//        
//
//        // CREACION JOPTIONPANE PARA EDITAR
//        JPanel panel = new JPanel(new GridLayout(4, 2));
//        JTextField txtId = new JTextField(String.valueOf(id));
//        txtId.setEditable(false);
//        txtId.setBackground(new Color(240, 240, 240));
//        JTextField txtNombre = new JTextField(nombre);
//        JTextField txtPrecio = new JTextField(String.valueOf(precio));
//        JTextField txtStock = new JTextField(String.valueOf(stock));
//
//        // IMPRIMIR DATOS PRODUCTO
//        panel.add(new JLabel("ID:"));
//        panel.add(txtId);
//        panel.add(new JLabel("Nombre:"));
//        panel.add(txtNombre);
//        panel.add(new JLabel("Precio:"));
//        panel.add(txtPrecio);
//        panel.add(new JLabel("Stock:"));
//        panel.add(txtStock);
//
//        int resultado = JOptionPane.showConfirmDialog(this, panel, "Editar Producto",
//                                                      JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
//
//        if (resultado == JOptionPane.OK_OPTION) {
//            
//            int nuevoId = Integer.parseInt(txtId.getText());
//            String nuevoNombre = txtNombre.getText();
//            double nuevoPrecio = Double.parseDouble(txtPrecio.getText());
//            int nuevoStock = Integer.parseInt(txtStock.getText());
//
//            //ACTUALIZA INVENTARIO
//            ProductoDTO productoActualizado = new ProductoDTO(nuevoId, nuevoNombre, nuevoPrecio, nuevoStock);
//            inventarioNegocio.actualizaProducto(id, productoActualizado, nuevoStock);
//            
//
//            // ACTUALIZA TABLA
//            model.setValueAt(nuevoId, filaSeleccionada, 0);
//            model.setValueAt(nuevoNombre, filaSeleccionada, 1);
//            model.setValueAt(nuevoPrecio, filaSeleccionada, 2);
//            model.setValueAt(nuevoStock, filaSeleccionada, 3);
//        }
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        
        
        //VALIDACION CAMPOS VACIOS
        
        if (!validarCampos()) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "Todos los campos deben ser llenados", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        
        
        //VALIDACION ID REPETIDO
        
        int id = Integer.parseInt(txtId.getText());
        
   
        
        ProductoBO productoBO = new ProductoBO();
        List<ProductoBO> listaProductos = new ArrayList<>();
        listaProductos = productoBO.getProductos();
        
        try {
            if (fachadaLeer.leerProducto(id) != null) {
                
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, "Ya existe un producto con la misma ID", "Error", JOptionPane.ERROR_MESSAGE);
                return; 
            }
        } catch (LeerProductoException ex) {
            System.out.println("asasd");
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
            
           
        
        
        
        //AGREGAR NUEVO PRODUCTO
        
        int precio = Integer.parseInt(txtPrecio.getText());
        int stock = Integer.parseInt(txtStock.getText());
        ProductoBO producto = new ProductoBO(id, txtNombre.getText(), precio, stock);
        
        try {      fachadaAgregar.agregarProducto(producto);
        } 
        catch (AgregarProductoException ex) {Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);}
        

        
        
        actualizarTabla();
        
        txtId.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
        txtStock.setText("");
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnGenerarReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarReporteMouseClicked
                                                                                              
//        List<ProductoDTO> productos = inventarioNegocio.getProductos();
//
//        StringBuilder reporte = new StringBuilder();
//        reporte.append("<html><body><h2>Productos en Almacén</h2>");
//        reporte.append("<table border=\"1\"><tr><th>ID</th><th>Nombre</th><th>Stock</th></tr>");
//        for (ProductoDTO producto : productos) {
//            reporte.append("<tr><td>").append(producto.getId()).append("</td>")
//                   .append("<td>").append(producto.getNombre()).append("</td>")
//                   .append("<td>").append(producto.getStock()).append("</td></tr>");
//        }
//        reporte.append("</table></body></html>");
//
//        Object[] options = { "Cancelar", "Generar Reporte" };
//        int result = JOptionPane.showOptionDialog(this, reporte.toString(), "Productos en Almacén", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
//
//        if (result == JOptionPane.NO_OPTION) {
//            JOptionPane.showMessageDialog(this, "Reporte generado exitosamente", "Reporte Generado", JOptionPane.INFORMATION_MESSAGE);
//        }
    }//GEN-LAST:event_btnGenerarReporteMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
//       
//        int filaSeleccionada = tablaInventario.getSelectedRow();
//
//        if (filaSeleccionada == -1) {
//            Toolkit.getDefaultToolkit().beep();
//            JOptionPane.showMessageDialog(this, "Seleccione un producto para eliminar", "Alerta", JOptionPane.ERROR_MESSAGE);
//        } else {
//            DefaultTableModel model = (DefaultTableModel) tablaInventario.getModel();
//
//            int id = (int) model.getValueAt(filaSeleccionada, 0);
//            String nombre = (String) model.getValueAt(filaSeleccionada, 1);
//            double precio = (double) model.getValueAt(filaSeleccionada, 2);
//            int stock = (int) model.getValueAt(filaSeleccionada, 3);
//
//            int confirmacion = JOptionPane.showConfirmDialog(this,
//                "¿Seguro que desea eliminar el producto?\n\n"
//                + "ID: " + id + "\n"
//                + "Nombre: " + nombre + "\n"
//                + "Precio: " + precio + "\n"
//                + "Stock: " + stock,
//                "Confirmar eliminación",
//                JOptionPane.YES_NO_OPTION);
//
//            if (confirmacion == JOptionPane.YES_OPTION) {
//                // Eliminar el producto de InventarioNegocio
//                inventarioNegocio.eliminarProducto(id);
//
//                // Eliminar la fila seleccionada de la tabla
//                model.removeRow(filaSeleccionada);
//            }
//        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    
    //SE RECORRE LA LISTA REGRESADA DE PRODUCTOBO Y SE IMPRIME EN LA TABLA
    
    private void actualizarTabla() {
        
        DefaultTableModel model = (DefaultTableModel) tablaInventario.getModel();
        model.setRowCount(0);
        
        ProductoBO instanciaProductoBO = new ProductoBO();
        
        List<ProductoBO> productos = instanciaProductoBO.getProductos();

        for (ProductoBO producto : productos) {
            model.addRow(new Object[]{producto.getId(), producto.getNombre(), producto.getPrecio(), producto.getStock()});
        }
    }
    
    
    
    
    private boolean validarCampos() {
        return !txtId.getText().trim().isEmpty() &&
               !txtNombre.getText().trim().isEmpty() &&
               !txtPrecio.getText().trim().isEmpty() &&
               !txtStock.getText().trim().isEmpty();
    }
    
    
    
    class NumberDocumentFilter extends DocumentFilter {
        @Override
        public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
            StringBuilder sb = new StringBuilder();
            sb.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
            sb.insert(offset, string);
            if (validate(sb.toString())) {
                super.insertString(fb, offset, string, attr);
            } else {
                Toolkit.getDefaultToolkit().beep();
            }
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            StringBuilder sb = new StringBuilder();
            sb.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
            sb.replace(offset, offset + length, text);
            if (validate(sb.toString())) {
                super.replace(fb, offset, length, text, attrs);
            } else {
                Toolkit.getDefaultToolkit().beep();
            }
        }

        private boolean validate(String text) {
            return text.isEmpty() || text.matches("\\d+(\\.\\d*)?");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAgregar;
    private javax.swing.JLabel btnEditar;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnGenerarReporte;
    private javax.swing.JLabel btnRegresar;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaInventario;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}