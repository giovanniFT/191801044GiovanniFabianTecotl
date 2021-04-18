
package DaoTables;

import ConexionRM.Connect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Tablas.Productos;
import Tablas.Ventas;
import java.sql.PreparedStatement;



public class DaoProductos {
    
    private static String sql;
    
    public static List<Productos> productosLista() throws SQLException{
        
        List<Productos> listaProductos = new ArrayList<>();
        Connection conexion = Connect.getConnection2();
        Statement declaracion = conexion.createStatement();
        sql = "SELECT * FROM productos";
        ResultSet resultado = declaracion.executeQuery(sql);
        while(resultado.next()){
            Productos productos = new Productos(resultado.getString("nombre"),resultado.getString("proveedor"),resultado.getInt("id"),resultado.getDouble("precio"));
            listaProductos.add(productos);
        }
        Connect.close(conexion, declaracion, resultado);

        return listaProductos;
    }
    
    public static void insertar(Productos productos) throws SQLException{
        Connection conexion = Connect.getConnection2();
        
        sql = "INSERT INTO productos(nombre,precio,proveedor) VALUES (?,?,?)";
        PreparedStatement declaracion = conexion.prepareStatement(sql);
        
        declaracion.setString(1,productos.getNombrePto());
        declaracion.setDouble(2,productos.getPrecio()); 
        declaracion.setString(3,productos.getNombrePdor());
          
        
        declaracion.executeUpdate();
        
        Connect.close(conexion,declaracion);
    
    }
    
    public static void eliminar(Productos productos) throws SQLException{
    
        Connection conexion = Connect.getConnection2();
        sql = "DELETE FROM productos WHERE id =?";
        PreparedStatement declaracion = conexion.prepareStatement(sql);
        declaracion.setInt(1,productos.getId());
        declaracion.executeUpdate();
        Connect.close(conexion, declaracion);
    
    }
    
    public static void modificar(Productos productos) throws SQLException{
        
        Connection conexion = Connect.getConnection2();
        sql = "UPDATE productos SET nombre =? ,proveedor =?,precio =? WHERE id =? ";
        PreparedStatement declaracion = conexion.prepareStatement(sql);    
        declaracion.setString(1,productos.getNombrePto());
        declaracion.setString(2,productos.getNombrePdor());
        declaracion.setDouble(3,productos.getPrecio());
        declaracion.setInt(4,productos.getId());
        declaracion.executeUpdate();
        Connect.close(conexion,declaracion);
    }

    public static void modificar(int i, Productos product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void insertar(Ventas ventas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void modificar(Ventas ventas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
