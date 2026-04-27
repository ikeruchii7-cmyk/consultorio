/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author ikerr
 */
public class Cita {

    private int id;
    private String dni_paciente;
    private String nombre;
    private Date dia;
    private double hora;

    public Cita() {}

    public Cita(int id, String dni_paciente, String nombre, Date dia, double hora) {
        this.id = id;
        this.dni_paciente = dni_paciente;
        this.nombre = nombre;
        this.dia = dia;
        this.hora = hora;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getDni_paciente() {
        return dni_paciente;
    }
    public void setDni_paciente(String dni_paciente) {
        this.dni_paciente = dni_paciente;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getDia() {
        return dia;
    }
    public void setDia(Date dia) {
        this.dia = dia;
    }

    public double getHora() {
        return hora;
    }
    public void setHora(double hora) {
        this.hora = hora;
    }

}