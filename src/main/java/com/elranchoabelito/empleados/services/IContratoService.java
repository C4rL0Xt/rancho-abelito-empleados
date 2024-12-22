package com.elranchoabelito.empleados.services;

import com.elranchoabelito.empleados.models.dtos.ContratoDTO;
import com.elranchoabelito.empleados.models.dtos.ContratoHistDTO;

import java.util.List;

public interface IContratoService {

    List<ContratoDTO> listarContratosEjerciendo();
    List<ContratoHistDTO> listarContratos();
}
