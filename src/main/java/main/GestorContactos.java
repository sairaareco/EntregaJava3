
package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GestorContactos {
    private Connection conexion;
    private JTable tableContacts;

    public GestorContactos(Connection conexion, JTable tableContacts) {
        this.conexion = conexion;
        this.tableContacts = tableContacts;
    }
    
  
    
    // MOSTRAR TODOS LOS CONTACTOS 
    public void mostrarContactos() {
            String consulta = "SELECT * FROM contactos";

            DefaultTableModel modeloTabla = new DefaultTableModel();
            
        try {
            PreparedStatement declaracion = conexion.prepareStatement(consulta);
            ResultSet resultado = declaracion.executeQuery();

            ResultSetMetaData data = resultado.getMetaData();
            int columnas = data.getColumnCount();

            for (int i = 1; i <= columnas; i++) {
                modeloTabla.addColumn(data.getColumnName(i));
            }

            while (resultado.next()) {
                Object[] rowData = new Object[columnas];
                for (int i = 1; i <= columnas; i++) {
                    rowData[i - 1] = resultado.getObject(i);
                }
                modeloTabla.addRow(rowData);
            }

            setModel(modeloTabla);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        }
    }

    private void setModel(DefaultTableModel modeloTabla) {
        tableContacts.setModel(modeloTabla);
    }
    
    // AGREGAR UN NUEVO CONTACTO
    public void agregarContacto(String nombre, String telefono, String correo) {
        if (nombre != null && !nombre.isEmpty() && telefono != null && !telefono.isEmpty() && correo != null && !correo.isEmpty()) {
        String consulta = "INSERT INTO contactos (nombre, telefono, correo) VALUES(?, ?, ?)";
        
        try {
            PreparedStatement declaracion = conexion.prepareStatement(consulta);
            
            declaracion.setString(1, nombre);
            declaracion.setString(2, telefono);
            declaracion.setString(3, correo);
            
            declaracion.executeUpdate(); 

            declaracion.close();
            JOptionPane.showMessageDialog(tableContacts, "Contato agregado con éxito.");
        } catch(SQLException e) {
            e.printStackTrace();
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        }
        } else {
            JOptionPane.showMessageDialog(tableContacts, "Debe completar todos los campos.");
        }
    
    }
    
    // ELIMINAR CONTACTO
    public void eliminarContacto (int id) {
        String consulta = "DELETE FROM contactos WHERE id = ?";
        
        try {
            PreparedStatement declaracion = conexion.prepareStatement(consulta);
            declaracion.setInt(1, id);
            int filasAfectadas = declaracion.executeUpdate();
            
            declaracion.close();
            
            if(filasAfectadas > 0) {
                JOptionPane.showMessageDialog(tableContacts, "Contacto eliminado");
            }
            else {
                JOptionPane.showMessageDialog(tableContacts, "Debe seleccionar un contacto.");
            }
    
            
        } catch(SQLException e) {
            e.printStackTrace();
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        }
    }   
    
    // ELIMINA TODOS LOS CONTACTOS
    public void vaciarLista () {
        
        int rta = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas eliminar todos los contactos?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

        if (rta == JOptionPane.YES_OPTION) {
        String consulta = "DELETE FROM contactos";
        
            try {
                PreparedStatement declaracion = conexion.prepareStatement(consulta);
                declaracion.executeUpdate();
            
            } catch(SQLException e) {
                e.printStackTrace();
                System.out.println("Error al ejecutar la consulta: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(tableContacts, "Operacion cancelada.");
        }
    }
    
    // ACTUALIZAR UN CONTACTO
    
    public void editarContacto (int id, String nuevoNombre, String nuevoTelefono, String nuevoCorreo) {
        String consulta = "UPDATE contactos SET nombre = ?, telefono = ?, correo = ? WHERE id = ?";

        try {
            PreparedStatement declaracion = conexion.prepareStatement(consulta);
            
            declaracion.setString(1, nuevoNombre);
            declaracion.setString(2, nuevoTelefono);
            declaracion.setString(3, nuevoCorreo);
            declaracion.setInt(4, id);
            int filasAfectadas = declaracion.executeUpdate();
            
            declaracion.close();
            
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(tableContacts, "Contacto actualizado correctamente.");
            } else {
                JOptionPane.showMessageDialog(tableContacts, "No se pudo actualizar el contacto.");
            }    
        } 
        catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        }
        
    }

    
}

