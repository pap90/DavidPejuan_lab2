/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.ii;

/**
 *
 * @author david
 */
public class aviones {
    private int nummod;
    private String codigo;
    private int fabricacion;
    private int ingreso;
    private int capacidadpasageros;
    private int pesomax;
    private int horasvuelo;
    private int nummotores;
    private String estado;
    private String nombre;

    public aviones() {
    }

    public aviones(int nummod, String codigo, int fabricacion, int ingreso, int capacidadpasageros, int pesomax, int nummotores, String nombre) {
        this.nummod = nummod;
        this.codigo = codigo;
        this.fabricacion = fabricacion;
        this.ingreso = ingreso;
        this.capacidadpasageros = capacidadpasageros;
        this.pesomax = pesomax;
        horasvuelo = 0;
        this.nummotores = nummotores;
        estado = "estacionado";
        this.nombre = nombre;
    }

    public int getNummod() {
        return nummod;
    }

    public void setNummod(int nummod) {
        this.nummod = nummod;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(int fabricacion) {
        this.fabricacion = fabricacion;
    }

    public int getIngreso() {
        return ingreso;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    public int getCapacidadpasageros() {
        return capacidadpasageros;
    }

    public void setCapacidadpasageros(int capacidadpasageros) {
        this.capacidadpasageros = capacidadpasageros;
    }

    public int getPesomax() {
        return pesomax;
    }

    public void setPesomax(int pesomax) {
        this.pesomax = pesomax;
    }

    public int getHorasvuelo() {
        return horasvuelo;
    }

    public void setHorasvuelo(int horasvuelo) {
        this.horasvuelo = horasvuelo;
    }

    public int getNummotores() {
        return nummotores;
    }

    public void setNummotores(int nummotores) {
        this.nummotores = nummotores;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "nummod=" + nummod + ", codigo=" + codigo + ", fabricacion=" + fabricacion + ", ingreso=" + ingreso + ", capacidadpasageros=" + capacidadpasageros + ", pesomax=" + pesomax + ", horasvuelo=" + horasvuelo + ", nummotores=" + nummotores + ", estado=" + estado + ", nombre=" + nombre;
    }
    
    
}
