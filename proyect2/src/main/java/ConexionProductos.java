
import java.util.ArrayList;
import java.util.List;
import Tablas.Productos;
import DaoTables.DaoProductos;
import java.sql.SQLException;

public class ConexionProductos {

    /**
     *
     * @param args
     * @throws SQLException
     */
    public static void main(String[] args) throws SQLException {
        
        List<Productos> ListaProductos = new ArrayList<>();
        ListaProductos = DaoProductos.productosLista();
        for(Productos productos:ListaProductos){
            System.out.println(productos);
        
        }
    }
    
}
