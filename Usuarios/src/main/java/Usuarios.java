/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prueba
 */
public class Usuarios {
    
    private int id;
    private String nombre, contrasena,fechaAlta;
    private boolean status;

    public Usuarios() {
    }

    public Usuarios(int id, String nombre, String contrasena, String fechaAlta, boolean status) {
        this.id = id;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.fechaAlta = fechaAlta;
        this.status = status;
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

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "id=" + id + ", nombre=" + nombre + ", contrasena=" + contrasena + ", fechaAlta=" + fechaAlta + ", status=" + status + '}';
    }
    
    
}
