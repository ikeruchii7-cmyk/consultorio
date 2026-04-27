/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bbdd;

/**
 *
 * @author ikerr
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Gestión de la conexión a la base de datos para la aplicación Consultorio.
 */
public class Conexion {

    // Datos de conexión según la documentación y capturas
    private static final String SERVIDOR = "145.14.151.1";
    private static final String BBDD = "u812167471_consultorio25";
    private static final String USUARIO = "u812167471_consultorio25";
    private static final String PASS = "2025-Consultorio";
    
    // URL de conexión con parámetros para evitar errores de zona horaria y SSL
    private static final String URL = "jdbc:mysql://" + SERVIDOR + "/" + BBDD + "?useSSL=false&serverTimezone=UTC";
    private static final String DRIVER = "com.mysql.jdbc.Driver";

    private static Connection conexion = null;

    /**
     * Método para establecer la conexión con el servidor MySQL.
     * @return Connection objeto de conexión activo.
     */
    public static Connection conectar() {
        try {
            // Cargar el driver JDBC
            Class.forName(DRIVER);
            
            // Intentar conectar con las credenciales
            conexion = DriverManager.getConnection(URL, USUARIO, PASS);
            
            System.out.println("ÉXITO: Conexión establecida con " + BBDD);
            
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error: No se encontró el driver de MySQL.\n" + e.getMessage(), 
                    "Error de Driver", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error SQL: No se pudo conectar a la base de datos.\n" + e.getMessage(), 
                    "Error de Conexión", JOptionPane.ERROR_MESSAGE);
        }
        
        return conexion;
    }

    /**
     * Método para cerrar la conexión activa y liberar recursos.
     */
    public static void cerrarConexion() {
        if (conexion != null) {
            try {
                if (!conexion.isClosed()) {
                    conexion.close();
                    System.out.println("INFO: Conexión cerrada correctamente.");
                }
            } catch (SQLException e) {
                System.err.println("Error al intentar cerrar la conexión: " + e.getMessage());
            }
        }
    }
}