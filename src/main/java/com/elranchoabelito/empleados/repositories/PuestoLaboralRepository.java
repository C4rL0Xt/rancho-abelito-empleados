package com.elranchoabelito.empleados.repositories;

import com.elranchoabelito.empleados.models.entities.PuestoLaboral;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PuestoLaboralRepository extends JpaRepository<PuestoLaboral, String> {
}
