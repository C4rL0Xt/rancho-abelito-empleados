package com.elranchoabelito.empleados.controllers;

import com.elranchoabelito.empleados.models.dtos.CreateEmpleadoDTO;
import com.elranchoabelito.empleados.models.dtos.UpdateEmpleadoDTO;
import com.elranchoabelito.empleados.models.dtos.UpdateLocalDTO;
import com.elranchoabelito.empleados.models.entities.Contrato;
import com.elranchoabelito.empleados.models.entities.Empleado;
import com.elranchoabelito.empleados.services.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
    @Autowired
    IEmpleadoService empleadoService;

    @PostMapping("/create")
    public ResponseEntity<Contrato> createEmpleado(@RequestBody CreateEmpleadoDTO createEmpleadoDTO){
        Contrato contrato = empleadoService.createEmpleado(createEmpleadoDTO);
        return ResponseEntity.ok(contrato);
    }

    @PutMapping("/update")
    public ResponseEntity<Empleado> updateEmpleado(@RequestBody UpdateEmpleadoDTO updateEmpleadoDTO){
        Empleado empleado = empleadoService.updateEmpleado(updateEmpleadoDTO);
        return ResponseEntity.ok(empleado);
    }

    @PutMapping("/update-local")
    public ResponseEntity<Empleado> updateEmpleado(@RequestBody UpdateLocalDTO updateLocalDTO){
        Empleado empleado = empleadoService.updateLocal(updateLocalDTO);
        return ResponseEntity.ok(empleado);
    }




}
