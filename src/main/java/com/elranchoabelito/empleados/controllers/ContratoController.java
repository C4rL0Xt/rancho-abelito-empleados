package com.elranchoabelito.empleados.controllers;

import com.elranchoabelito.empleados.models.dtos.ContratoDTO;
import com.elranchoabelito.empleados.models.dtos.ContratoHistDTO;
import com.elranchoabelito.empleados.services.IContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contrato")
public class ContratoController {
    @Autowired
    IContratoService contratoService;

    @GetMapping("/listar")
    public ResponseEntity<List<ContratoDTO>> listarContratosActivos(){
        List<ContratoDTO> contratos = contratoService.listarContratosEjerciendo();
        return ResponseEntity.ok().body(contratos);
    }

    @GetMapping("/listar-inactivos")
    public ResponseEntity<List<ContratoHistDTO>> listarContratosInactivos(){
        List<ContratoHistDTO> contratos = contratoService.listarContratos();
        return ResponseEntity.ok().body(contratos);
    }
}
