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
public class Consulta {

    private int id;
    private String dni_paciente;
    private Date fecha_consulta;
    private String diagnostico;
    private String tratamiento;
    private String observaciones;
    private int codigo_facultativo;

    public Consulta() {}

    public Consulta(int id, String dni_paciente, Date fecha_consulta, String diagnostico,
                    String tratamiento, String observaciones, int codigo_facultativo) {
        this.id = id;
        this.dni_paciente = dni_paciente;
        this.fecha_consulta = fecha_consulta;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.observaciones = observaciones;
        this.codigo_facultativo = codigo_facultativo;
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

    public Date getFecha_consulta() {
        return fecha_consulta;
    }
    public void setFecha_consulta(Date fecha_consulta) {
        this.fecha_consulta = fecha_consulta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }
    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getObservaciones() {
        return observaciones;
    }
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getCodigo_facultativo() {
        return codigo_facultativo;
    }
    public void setCodigo_facultativo(int codigo_facultativo) {
        this.codigo_facultativo = codigo_facultativo;
    }

}