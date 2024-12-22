package com.elranchoabelito.empleados.models.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "empleado")
public class Empleado {
    @Id
    private String idEmpleado;
    private String nombres;
    private String apellidos;
    private String dni;
    private String telefono;
    private String genero;
    private Date fecha_nacimiento;
    @OneToOne
    @JoinColumn(name = "id_local")
    private Local id_local;

    public Empleado() {
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Local getId_local() {
        return id_local;
    }

    public void setId_local(Local id_local) {
        this.id_local = id_local;
    }
}
