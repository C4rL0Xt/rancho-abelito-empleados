package com.elranchoabelito.empleados.services;

import com.elranchoabelito.empleados.models.dtos.*;
import com.elranchoabelito.empleados.models.entities.Contrato;
import com.elranchoabelito.empleados.models.entities.Empleado;

import java.util.List;

public interface IEmpleadoService {

    Contrato createEmpleado(CreateEmpleadoDTO createEmpleadoDTO);
    Empleado updateEmpleado(UpdateEmpleadoDTO updateEmpleadoDTO);
    Empleado updateLocal(UpdateLocalDTO updateLocalDTO);
}
