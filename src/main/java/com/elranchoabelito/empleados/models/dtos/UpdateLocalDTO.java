package com.elranchoabelito.empleados.models.dtos;

public class UpdateLocalDTO {
    private String idEmpleado;
    private Integer idLocal;

    public UpdateLocalDTO() {
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }
}
