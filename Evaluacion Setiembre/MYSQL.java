package paqueteEv;
import java.sql.*;

import javax.security.sasl.SaslException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class MYSQL {



private final String URL = "jdbc:mysql://23.111.185.242/program1_avanzada?useSSL=false";
private final String USER = "program1_estudiantes";
private final String PASS = "estudiantesarrayanes";

private Connection getConnection() throws SQLException {
	return DriverManager.getConnection(URL, USER, PASS);
	

	
}

public void listar (DefaultTableModel modelo) {

String sentencia = "SELECT ID,Producto,Precio FROM productos";

try {
	Connection conexion = getConnection();
	PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia);
	ResultSet rs = declaracionSQL.executeQuery();

	while (rs.next()) {
		String ID = rs.getString(1);
		String Producto = rs.getString(2);
		String Precio = rs.getString(3);
		String[] fila = {ID,Producto,Precio};
		modelo.addRow(fila);
		
	}

}catch ( SQLException ex) {
	JOptionPane.showMessageDialog(null,"error:" + ex.getMessage());
}



}







}
