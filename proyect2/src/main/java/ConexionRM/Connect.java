
package ConexionRM;

import java.sql.*;



public class Connect{
    //.........................................................................
    private static final String URL ="jdbc:mysql://127.0.0.1:3306/rmempresa?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    //.........................................................................
     
    public static Connection getConnection2()throws SQLException {
        
        return DriverManager.getConnection(URL,USUARIO,PASSWORD);
        
    }

    public Connect() {
    }
    
    public static void close(Connection conexion, Statement declaracion) throws SQLException{
        conexion.close();
        declaracion.close();
    }
    public static void close(Statement declaracion, ResultSet resultado)throws SQLException{
        resultado.close();
        declaracion.close();
    
    }
    public static void close(Connection conexion, Statement declaracion, ResultSet resultado)throws SQLException{
        conexion.close();
        resultado.close();
        declaracion.close();
    
    }
}


/*
Connection con = null;
        try{
        Class.forName(DRIVER);
        con = DriverManager.getConnection(URL1, USUARIO1, PASSWORD1); //here 
  
        JOptionPane.showMessageDialog(null, "Conexion exitosa.");
    }
    catch(Exception e){
     e.printStackTrace();
    }
        
        return con;
        
*/