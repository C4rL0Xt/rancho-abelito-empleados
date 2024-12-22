package com.elranchoabelito.empleados.repositories;

import com.elranchoabelito.empleados.models.entities.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado,String> {
}
