package bbdd;

import java.sql.*;
import javax.swing.JOptionPane;
import utilidades.Encriptado;
import utilidades.Utilidades; // Cambiado de Sesion a Utilidades

public class Conexion {

    private static final String SERVIDOR = "127.0.0.1:3307"; 
    private static final String BBDD = "consultorio";        
    private static final String USUARIO = "root";            
    private static final String PASS = "";                   

    private static final String URL = "jdbc:mysql://" + SERVIDOR + "/" + BBDD + "?useSSL=false&serverTimezone=UTC";
    private static final String DRIVER = "com.mysql.jdbc.Driver";

    private static Connection conexion = null;

    public static Connection conectar() {
        try {
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL, USUARIO, PASS);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error de conexión: " + e.getMessage());
        }
        return conexion;
    }

    public static boolean Acceder(String user, String passPlana) {
        String sql = "SELECT contrasenya FROM personal WHERE usuario = ?";
        try (Connection con = conectar(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, user);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return passPlana.equals(Encriptado.desencriptar(rs.getString("contrasenya")));
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return false;
    }

    public static void RescataDatosUserLogado(String user) {
        String sql = "SELECT nombre, apellidos, numero_colegiado, tipo FROM personal WHERE usuario = ?";
        try (Connection con = conectar(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, user);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                // Ahora usamos Utilidades en lugar de Sesion
                Utilidades.nombre = Encriptado.desencriptar(rs.getString("nombre")) + " " + 
                                   Encriptado.desencriptar(rs.getString("apellidos"));
                Utilidades.colegiado = rs.getString("numero_colegiado");
                Utilidades.tipo = rs.getString("tipo");
                Utilidades.usuario = user;
            }
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public static ResultSet CargarCitas(String numColegiado, String tipoConsulta) {
        Connection con = conectar();
        String sql = "SELECT nombre_paciente, dia, hora FROM citas WHERE numero_colegiado = ? AND tipo_consulta = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, numColegiado);
            ps.setString(2, tipoConsulta);
            return ps.executeQuery();
        } catch (SQLException e) { return null; }
    }
}