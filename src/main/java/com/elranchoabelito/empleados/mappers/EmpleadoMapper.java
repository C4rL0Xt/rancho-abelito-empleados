package com.elranchoabelito.empleados.mappers;

import com.elranchoabelito.empleados.models.dtos.CreateEmpleadoDTO;
import com.elranchoabelito.empleados.models.entities.Contrato;
import com.elranchoabelito.empleados.models.entities.Empleado;
import com.elranchoabelito.empleados.models.entities.Local;
import com.elranchoabelito.empleados.models.entities.PuestoLaboral;

public class EmpleadoMapper {

    public static Empleado toEmpleadoEntity(CreateEmpleadoDTO createEmpleadoDTO, Local local){
        Empleado empleado = new Empleado();
        empleado.setIdEmpleado(createEmpleadoDTO.getId());
        empleado.setNombres(createEmpleadoDTO.getNombres());
        empleado.setApellidos(createEmpleadoDTO.getApellidos());
        empleado.setDni(createEmpleadoDTO.getDni());
        empleado.setTelefono(createEmpleadoDTO.getTelefono());
        empleado.setGenero(createEmpleadoDTO.getGenero());
        empleado.setFecha_nacimiento(createEmpleadoDTO.getFecha_nacimiento());
        empleado.setId_local(local);
        return empleado;
    }

    public static Contrato toContratoEntity(CreateEmpleadoDTO createEmpleadoDTO, Empleado empleado, PuestoLaboral puesto){
        Contrato contrato = new Contrato();
        contrato.setIdContrato(createEmpleadoDTO.getIdContrato());
        contrato.setEmpleado(empleado);
        contrato.setPuestoLaboral(puesto);
        contrato.setSueldo(createEmpleadoDTO.getSueldo());
        contrato.setFechaInicio(createEmpleadoDTO.getFecha_inicio());
        contrato.setFechaFin(null);
        contrato.setTipoContrato(createEmpleadoDTO.getTipo_contrato());
        contrato.setTurno(createEmpleadoDTO.getTurno());
        contrato.setEstado("Activo");

        return contrato;
    }


}
