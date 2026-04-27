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
public class ConsultaEnfermeria {

    private int id;
    private String dni_paciente;
    private Date fecha_consulta;
    private double maxima;
    private double minima;
    private int glucosa;
    private double peso;
    private int codigo_facultativo;

    public ConsultaEnfermeria() {}

    public ConsultaEnfermeria(int id, String dni_paciente, Date fecha_consulta, double maxima,
                               double minima, int glucosa, double peso, int codigo_facultativo) {
        this.id = id;
        this.dni_paciente = dni_paciente;
        this.fecha_consulta = fecha_consulta;
        this.maxima = maxima;
        this.minima = minima;
        this.glucosa = glucosa;
        this.peso = peso;
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

    public double getMaxima() {
        return maxima;
    }
    public void setMaxima(double maxima) {
        this.maxima = maxima;
    }

    public double getMinima() {
        return minima;
    }
    public void setMinima(double minima) {
        this.minima = minima;
    }

    public int getGlucosa() {
        return glucosa;
    }
    public void setGlucosa(int glucosa) {
        this.glucosa = glucosa;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getCodigo_facultativo() {
        return codigo_facultativo;
    }
    public void setCodigo_facultativo(int codigo_facultativo) {
        this.codigo_facultativo = codigo_facultativo;
    }

}