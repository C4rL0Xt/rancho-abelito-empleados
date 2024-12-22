package com.elranchoabelito.empleados.repositories;

import com.elranchoabelito.empleados.models.entities.Contrato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratoRepository extends JpaRepository<Contrato,String> {
}
