package com.elranchoabelito.empleados.services.impl;

import com.elranchoabelito.empleados.mappers.ContratoMapper;
import com.elranchoabelito.empleados.models.dtos.ContratoDTO;
import com.elranchoabelito.empleados.models.dtos.ContratoHistDTO;
import com.elranchoabelito.empleados.models.entities.Contrato;
import com.elranchoabelito.empleados.models.entities.Empleado;
import com.elranchoabelito.empleados.repositories.ContratoRepository;
import com.elranchoabelito.empleados.services.IContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContratoServiceImpl implements IContratoService {

    @Autowired
    ContratoRepository contratoRepository;

    @Override
    public List<ContratoDTO> listarContratosEjerciendo(){
        List<Contrato> contratos = contratoRepository.findAll();
        return contratos.stream().filter(
                contrato -> "Activo".equalsIgnoreCase(contrato.getEstado())
        ).map(
                ContratoMapper::toContratoDTO
        ).toList();
    }
    @Override
    public List<ContratoHistDTO> listarContratos(){
        List<Contrato> contratos = contratoRepository.findAll();
        return contratos.stream().filter(
                contrato -> "Inactivo".equalsIgnoreCase(contrato.getEstado())
        ).map(
                ContratoMapper::toContratoHistDTO
        ).toList();
    }
}
