package model;

import java.util.AbstractList;
import java.util.ArrayList;

public class Tarea {

    private String titutlo;
    private String descripcion;
    private String fecha;
    private String unestadopendiente;


    // Constructor
    public DataTareas(String titulo, String descripcion, String fecha, String Unestadopendiente) {
        this.titutlo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.unestadopendiente =;

    }

    // Getters y Setters
    public String getTitutloo() {
        return titutlo;
    }

    public void setTitutlo(String titulo) {
        this.titutlo = titulo;
    }

    public String getdescripcion() {
        return descripcion;
    }

    public void setDescripcion(String nombre) {
        this.descripcion = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setfecha(String fecha) {
        this.fecha = fecha;
    }

    public String getunestadopendiente() {
        return unestadopendiente;
    }

    public void setUnestadopendiente(String unestadopendiente) {
        this.unestadopendiente = unestadopendiente;
    }


    @Override
    public String toString() {
        return "Paciente: " + "descripcion" + ", fecha: " + unestadopendiente + ", Motivo de Visita: ";
    }


}




