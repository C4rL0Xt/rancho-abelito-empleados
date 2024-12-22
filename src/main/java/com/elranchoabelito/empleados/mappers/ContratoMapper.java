package com.elranchoabelito.empleados.mappers;

import com.elranchoabelito.empleados.models.dtos.ContratoDTO;
import com.elranchoabelito.empleados.models.dtos.ContratoHistDTO;
import com.elranchoabelito.empleados.models.entities.Contrato;
import com.elranchoabelito.empleados.models.entities.Empleado;

public class ContratoMapper {
    public static ContratoDTO toContratoDTO(Contrato contrato){
        ContratoDTO dto = new ContratoDTO();
        dto.setIdEmpleado(contrato.getEmpleado().getIdEmpleado());
        dto.setNombre(contrato.getEmpleado().getNombres());
        dto.setApellido(contrato.getEmpleado().getApellidos());
        dto.setCargo(contrato.getPuestoLaboral().getNombrePuesto());
        dto.setTelefono(contrato.getEmpleado().getTelefono());
        dto.setFecha_inicio(contrato.getFechaInicio());
        dto.setTipo_contrato(contrato.getTipoContrato());
        dto.setTurno(contrato.getTurno());
        return dto;
    }

    public static ContratoHistDTO toContratoHistDTO(Contrato contrato){
        ContratoHistDTO dto = new ContratoHistDTO();
        dto.setIdEmpleado(contrato.getEmpleado().getIdEmpleado());
        dto.setNombre(contrato.getEmpleado().getNombres());
        dto.setApellido(contrato.getEmpleado().getApellidos());
        dto.setCargo(contrato.getPuestoLaboral().getNombrePuesto());
        dto.setTelefono(contrato.getEmpleado().getTelefono());
        dto.setFecha_inicio(contrato.getFechaInicio());
        dto.setFecha_fin(contrato.getFechaFin());
        dto.setTipo_contrato(contrato.getTipoContrato());
        dto.setTurno(contrato.getTurno());
        return dto;
    }
}
