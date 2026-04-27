/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ikerr
 */



public class Cita {
    private int id;
    private String dniPaciente;
    private String fecha;
    private String hora;
    private int idPersonal;

    public Cita() {
    }

    public Cita(int id, String dniPaciente, String fecha, String hora, int idPersonal) {
        this.id = id;
        this.dniPaciente = dniPaciente;
        this.fecha = fecha;
        this.hora = hora;
        this.idPersonal = idPersonal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDniPaciente() {
        return dniPaciente;
    }

    public void setDniPaciente(String dniPaciente) {
        this.dniPaciente = dniPaciente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }
}