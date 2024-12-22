package com.elranchoabelito.empleados.services.impl;

import com.elranchoabelito.empleados.mappers.EmpleadoMapper;
import com.elranchoabelito.empleados.models.dtos.*;
import com.elranchoabelito.empleados.models.entities.Contrato;
import com.elranchoabelito.empleados.models.entities.Empleado;
import com.elranchoabelito.empleados.models.entities.Local;
import com.elranchoabelito.empleados.models.entities.PuestoLaboral;
import com.elranchoabelito.empleados.repositories.ContratoRepository;
import com.elranchoabelito.empleados.repositories.EmpleadoRepository;
import com.elranchoabelito.empleados.repositories.LocalRepository;
import com.elranchoabelito.empleados.repositories.PuestoLaboralRepository;
import com.elranchoabelito.empleados.services.IEmpleadoService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {
    EmpleadoRepository empleadoRepository;
    ContratoRepository contratoRepository;
    LocalRepository localRepository;
    PuestoLaboralRepository puestoLaboralRepository;
    @Override
    @Transactional
    public Contrato createEmpleado(CreateEmpleadoDTO createEmpleadoDTO){
        Local local = localRepository.findById(createEmpleadoDTO.getLocal_id()).orElse(null);
        Empleado empleado = EmpleadoMapper.toEmpleadoEntity(createEmpleadoDTO,local);
        empleadoRepository.save(empleado);
        PuestoLaboral puesto = puestoLaboralRepository.findById(createEmpleadoDTO.getIdPuesto()).orElse(null);
        Contrato contrato = EmpleadoMapper.toContratoEntity(createEmpleadoDTO,empleado,puesto);
        return contratoRepository.save(contrato);
    }
    @Override
    @Transactional
    public Empleado updateEmpleado(UpdateEmpleadoDTO updateEmpleadoDTO){
        Empleado empleado = empleadoRepository.findById(updateEmpleadoDTO.getIdEmpleado()).orElse(null);
        empleado.setTelefono(updateEmpleadoDTO.getTelefono());
        empleadoRepository.save(empleado);
        return empleado;
    }

    @Override
    @Transactional
    public Empleado updateLocal(UpdateLocalDTO updateLocalDTO){
        Empleado empleado = empleadoRepository.findById(updateLocalDTO.getIdEmpleado()).orElse(null);
        Local local = localRepository.findById(updateLocalDTO.getIdLocal()).orElse(null);
        empleado.setId_local(local);
        empleadoRepository.save(empleado);
        return empleado;
    }
}
