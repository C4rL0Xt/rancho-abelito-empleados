package com.elranchoabelito.empleados.models.dtos;

public class UpdateEmpleadoDTO {
    private String idEmpleado;
    private String telefono;

    public UpdateEmpleadoDTO() {
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
