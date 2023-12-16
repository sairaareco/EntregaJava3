
package main;

import java.sql.Connection;
import javax.swing.JOptionPane;


public class FormContactos extends javax.swing.JFrame {
    private Connection conexion;
    private GestorContactos gestorContactos;

    public FormContactos() {
        initComponents();
        AgendaContactos app = new AgendaContactos();
        conexion = app.getConection();
        gestorContactos = new GestorContactos(conexion, tableContacts);
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableContacts = new javax.swing.JTable();
        buttonDeleteContact = new javax.swing.JButton();
        buttonEditContact = new javax.swing.JButton();
        ButtonShowContacts = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        textPhone = new javax.swing.JTextField();
        textEmail = new javax.swing.JTextField();
        buttonCreateContact = new javax.swing.JButton();
        buttonDeleteAll = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("BIENVENIDO A SU AGENDA DE CONTACTOS");

        tableContacts.setBackground(new java.awt.Color(0, 204, 204));
        tableContacts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "NUMERO DE TELEFONO", "CORREO ELECTRONICO"
            }
        ));
        jScrollPane1.setViewportView(tableContacts);

        buttonDeleteContact.setText("Eliminar Contacto");
        buttonDeleteContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteContactActionPerformed(evt);
            }
        });

        buttonEditContact.setText("Editar Contacto");
        buttonEditContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditContactActionPerformed(evt);
            }
        });

        ButtonShowContacts.setText("Mostrar Todos");
        ButtonShowContacts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonShowContactsActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Teléfono: ");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Correo: ");

        buttonCreateContact.setText("Agregar Contacto");
        buttonCreateContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreateContactActionPerformed(evt);
            }
        });

        buttonDeleteAll.setText("Eliminar Todos");
        buttonDeleteAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonDeleteContact, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(388, 388, 388)
                        .addComponent(buttonCreateContact, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(textName, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                                            .addComponent(textPhone)
                                            .addComponent(textEmail)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(buttonEditContact, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(ButtonShowContacts, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonDeleteAll, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(27, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(buttonDeleteAll, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCreateContact, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonShowContacts, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEditContact, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDeleteContact, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      // LIMPIAR CAMPOS DE TEXTO 
    public void cleanTextField () {
        textName.setText("");
        textPhone.setText("");
        textEmail.setText("");
        
    }
    
    
    private void ButtonShowContactsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonShowContactsActionPerformed
        if (conexion != null) {
            gestorContactos.mostrarContactos();
        } else {
            System.out.println("La conexión no está establecida.");
        }
    }//GEN-LAST:event_ButtonShowContactsActionPerformed

    
    private void buttonCreateContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateContactActionPerformed
        String nombre = textName.getText();
        String telefono = textPhone.getText();
        String correo = textEmail.getText();
        
        gestorContactos.agregarContacto(nombre, telefono, correo);
        gestorContactos.mostrarContactos();
        
        cleanTextField();
    }//GEN-LAST:event_buttonCreateContactActionPerformed

    
    private void buttonDeleteContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteContactActionPerformed
        int selectedRow = tableContacts.getSelectedRow();

        if (selectedRow != -1) {
            int idContacto = (int) tableContacts.getValueAt(selectedRow, 0);
            gestorContactos.eliminarContacto(idContacto);
        } else {
            JOptionPane.showMessageDialog(tableContacts, "Debe seleccionar un contacto.");
        }
        
        gestorContactos.mostrarContactos();
    }//GEN-LAST:event_buttonDeleteContactActionPerformed

    
    private void buttonEditContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditContactActionPerformed
       
        int id = obtenerIdSeleccionado();
        String nuevoNombre = textName.getText();
        String nuevoTelefono = textPhone.getText();
        String nuevoCorreo = textEmail.getText();

        gestorContactos.editarContacto(id, nuevoNombre, nuevoTelefono, nuevoCorreo);
        gestorContactos.mostrarContactos();
    }//GEN-LAST:event_buttonEditContactActionPerformed

    
    private void buttonDeleteAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteAllActionPerformed
        gestorContactos.vaciarLista();
        gestorContactos.mostrarContactos();
    }//GEN-LAST:event_buttonDeleteAllActionPerformed

    
    // Logica de la seccion "editar contacto"
    private int obtenerIdSeleccionado() {
    int filaSeleccionada = tableContacts.getSelectedRow();

    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(null, "Debe seleccionar una fila de la tabla");
        return -1;
    }
    return (int) tableContacts.getValueAt(filaSeleccionada, 0);
    }
    
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormContactos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonShowContacts;
    private javax.swing.JButton buttonCreateContact;
    private javax.swing.JButton buttonDeleteAll;
    private javax.swing.JButton buttonDeleteContact;
    private javax.swing.JButton buttonEditContact;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableContacts;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textPhone;
    // End of variables declaration//GEN-END:variables
}
