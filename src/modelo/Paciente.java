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
public class Paciente {

    private int id;
    private String dni;
    private String nombre;
    private String apellidos;
    private Date fecha_nacimiento;
    private String telefono;
    private String email;
    private String cp;
    private String sexo;
    private String tabaquismo;
    private String consumo_alcohol;
    private String antecedentes_salud;
    private String datos_salud_general;
    private Date fecha_registro;

    public Paciente() {}

    public Paciente(int id, String dni, String nombre, String apellidos, Date fecha_nacimiento,
                    String telefono, String email, String cp, String sexo, String tabaquismo,
                    String consumo_alcohol, String antecedentes_salud, String datos_salud_general,
                    Date fecha_registro) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha_nacimiento = fecha_nacimiento;
        this.telefono = telefono;
        this.email = email;
        this.cp = cp;
        this.sexo = sexo;
        this.tabaquismo = tabaquismo;
        this.consumo_alcohol = consumo_alcohol;
        this.antecedentes_salud = antecedentes_salud;
        this.datos_salud_general = datos_salud_general;
        this.fecha_registro = fecha_registro;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getCp() {
        return cp;
    }
    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTabaquismo() {
        return tabaquismo;
    }
    public void setTabaquismo(String tabaquismo) {
        this.tabaquismo = tabaquismo;
    }

    public String getConsumo_alcohol() {
        return consumo_alcohol;
    }
    public void setConsumo_alcohol(String consumo_alcohol) {
        this.consumo_alcohol = consumo_alcohol;
    }

    public String getAntecedentes_salud() {
        return antecedentes_salud;
    }
    public void setAntecedentes_salud(String antecedentes_salud) {
        this.antecedentes_salud = antecedentes_salud;
    }

    public String getDatos_salud_general() {
        return datos_salud_general;
    }
    public void setDatos_salud_general(String datos_salud_general) {
        this.datos_salud_general = datos_salud_general;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }
    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

}