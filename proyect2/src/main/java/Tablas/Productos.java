
package Tablas;


public class Productos {
    
    private String nombrePto,nombrePdor;
    private int id;
    private double precio;

    public Productos() {
    }

    public Productos(String nombrePto, String nombrePdor, int id, double precio) {
        this.nombrePto = nombrePto;
        this.nombrePdor = nombrePdor;
        this.id = id;
        this.precio = precio;
    }

    public Productos(String nombrePto, int id) {
        this.nombrePto = nombrePto;
        this.id = id;
    }

    public Productos(int id) {
        this.id = id;
    }

    
    public Productos(String nombrePto, String nombrePdor, double precio) {
        this.nombrePto = nombrePto;
        this.nombrePdor = nombrePdor;
        this.precio = precio;
    }

    public String getNombrePto() {
        return nombrePto;
    }

    public void setNombrePto(String nombrePto) {
        this.nombrePto = nombrePto;
    }

    public String getNombrePdor() {
        return nombrePdor;
    }

    public void setNombrePdor(String nombrePdor) {
        this.nombrePdor = nombrePdor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Productos{" + "nombrePto=" + nombrePto + ", nombrePdor=" + nombrePdor + ", id=" + id + ", precio=" + precio + '}';
    }
    
    
    
}
