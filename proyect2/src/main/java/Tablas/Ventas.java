
package Tablas;


public class Ventas {
    
    private String nombreCliente,fecha;
    private int id;
    private double totalVenta,descuento;

    public Ventas() {
    }
    
    public Ventas(int id) {
        this.id = id;
    }

    public Ventas(String nombreCliente, double totalVenta, double descuento) {
        this.nombreCliente = nombreCliente;
        this.totalVenta = totalVenta;
        this.descuento = descuento;
    }

    public Ventas(String nombreCliente, int id, double totalVenta, double descuento) {
        this.nombreCliente = nombreCliente;
        this.id = id;
        this.totalVenta = totalVenta;
        this.descuento = descuento;
    }

    public Ventas(String nombreCliente, String fecha, int id, double totalVenta, double descuento) {
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
        this.id = id;
        this.totalVenta = totalVenta;
        this.descuento = descuento;
    }

    

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Ventas{" + "nombreCliente=" + nombreCliente + ", fecha=" + fecha + ", id=" + id + ", totalVenta=" + totalVenta + ", descuento=" + descuento + '}';
    }
    
    
    
    
}
