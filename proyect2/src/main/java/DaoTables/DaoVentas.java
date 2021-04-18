
package DaoTables;

import ConexionRM.Connect;
import Tablas.Ventas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DaoVentas {
    
    private static String sql;
    
    public static List<Ventas> ventasLista() throws SQLException{
        
        List<Ventas> listaVentas = new ArrayList<>();
        Connection conexion = Connect.getConnection2();
        Statement declaracion = conexion.createStatement();
        sql = "SELECT * FROM ventas";
        ResultSet resultado = declaracion.executeQuery(sql);
        while(resultado.next()){
            Ventas ventas = new Ventas(resultado.getString("nombre_cliente"),resultado.getString("fecha"),resultado.getInt("id"),resultado.getDouble("total_venta"),resultado.getDouble("descuento"));
            listaVentas.add(ventas);
        }
        Connect.close(conexion, declaracion, resultado);

        return listaVentas;
    }
    
    public static void insertar(Ventas ventas) throws SQLException{
        Connection conexion = Connect.getConnection2();
        
        sql = "INSERT INTO ventas(nombre_cliente,descuento,total_venta) VALUES (?,?,?)";
        PreparedStatement declaracion = conexion.prepareStatement(sql);
        
        declaracion.setString(1,ventas.getNombreCliente());
        declaracion.setDouble(2,ventas.getDescuento());
        declaracion.setDouble(3,ventas.getTotalVenta());
          
        
        declaracion.executeUpdate();
        
        Connect.close(conexion,declaracion);
    
    }
    
    public static void modificar(Ventas ventas) throws SQLException{
        
        Connection conexion = Connect.getConnection2();
        sql = "UPDATE ventas SET nombre_cliente =? ,descuento =?,total_venta =? WHERE id =? ";
        PreparedStatement declaracion = conexion.prepareStatement(sql);    
        declaracion.setString(1,ventas.getNombreCliente());
        declaracion.setDouble(2,ventas.getDescuento());
        declaracion.setDouble(3,ventas.getTotalVenta());
        declaracion.setInt(4,ventas.getId());
        declaracion.executeUpdate();
        Connect.close(conexion,declaracion);
    }
    public static void eliminar(Ventas ventas) throws SQLException{
    
        Connection conexion = Connect.getConnection2();
        sql = "DELETE FROM ventas WHERE id =?";
        PreparedStatement declaracion = conexion.prepareStatement(sql);
        declaracion.setInt(1,ventas.getId());
        declaracion.executeUpdate();
        Connect.close(conexion, declaracion);
    
    }
}
