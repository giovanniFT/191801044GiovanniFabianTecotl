/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prueba
 */
public class Envios {
    
    private int id;
    private double peso;
    private String tipo,fechaEnvio,fechaEntrega;

    public Envios() {
    }

    public Envios(int id, double peso, String tipo, String fechaEnvio, String fechaEntrega) {
        this.id = id;
        this.peso = peso;
        this.tipo = tipo;
        this.fechaEnvio = fechaEnvio;
        this.fechaEntrega = fechaEntrega;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    @Override
    public String toString() {
        return "Envios{" + "id=" + id + ", peso=" + peso + ", tipo=" + tipo + ", fechaEnvio=" + fechaEnvio + ", fechaEntrega=" + fechaEntrega + '}';
    }
    
    
    
}
