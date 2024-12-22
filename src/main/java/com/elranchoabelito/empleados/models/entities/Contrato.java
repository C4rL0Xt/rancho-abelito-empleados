package com.elranchoabelito.empleados.models.entities;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "contrato")
public class Contrato {

    @Id
    private String idContrato;

    @ManyToOne
    @JoinColumn(name = "id_empleado")
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "id_puesto")
    private PuestoLaboral puestoLaboral;

    private BigDecimal sueldo;

    private LocalDate fechaInicio;

    private LocalDate fechaFin;

    private String tipoContrato;

    private String turno;

    private String estado;


    public Contrato() {
    }

    public String getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(String idContrato) {
        this.idContrato = idContrato;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public PuestoLaboral getPuestoLaboral() {
        return puestoLaboral;
    }

    public void setPuestoLaboral(PuestoLaboral puestoLaboral) {
        this.puestoLaboral = puestoLaboral;
    }

    public BigDecimal getSueldo() {
        return sueldo;
    }

    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
