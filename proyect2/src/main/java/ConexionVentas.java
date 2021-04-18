

import DaoTables.DaoVentas;
import Tablas.Ventas;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ConexionVentas {
 
    public static void main(String[] args) throws SQLException {
        
        List<Ventas> ListaVentas = new ArrayList<>();
        ListaVentas = DaoVentas.ventasLista();
        for(Ventas ventas:ListaVentas){
            System.out.println(ventas);
        
        }
    }
    
}
