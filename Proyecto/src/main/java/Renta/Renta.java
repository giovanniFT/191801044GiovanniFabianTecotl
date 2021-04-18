/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Renta;

/**
 *
 * @author prueba
 */
public class Renta {
    
    private int id;
    private String nombre;
    private double horaInicio,horaFin,tiempoConexion,total;

    public Renta() {
    }

    public Renta(int id, String nombre, double horaInicio, double horaFin, double tiempoConexion,  double total) {
        this.id = id;
        this.nombre = nombre;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.tiempoConexion = tiempoConexion;
        this.total = total;
    }

    public Renta(String nombre, double horaInicio, double horaFin, double tiempoConexion, double total) {
        this.nombre = nombre;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.tiempoConexion = tiempoConexion;
        this.total = total;
    }

     public Renta(int id) {
        this.id = id;
    }

    public Renta(int id, double horaInicio, double horaFin  ) {  //
        this.id = id;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }  

    public Renta(int id, double horaInicio, double horaFin, double tiempoConexion, double total) {
        this.id = id;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.tiempoConexion = tiempoConexion;
        this.total = total;
    }

    public Renta(int id, double horaFin) {
        this.id = id;
        this.horaFin = horaFin;
    }

   
  
     
     

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(double horaInicio) {
        this.horaInicio = horaInicio;
    }

    public double getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(double horaFin) {
        this.horaFin = horaFin;
    }

    public double getTiempoConexion() {
        return tiempoConexion;
    }

    public void setTiempoConexion(double tiempoConexion) {
        this.tiempoConexion = tiempoConexion;
    }

    @Override
    public String toString() {
        return "Renta{" + "id=" + id + ", nombre=" + nombre + ", total=" + total + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", tiempoConexion=" + tiempoConexion + '}';
    }

    public double setTiempoConexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
     
   
}
