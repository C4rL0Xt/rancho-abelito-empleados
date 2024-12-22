package com.elranchoabelito.empleados.repositories;

import com.elranchoabelito.empleados.models.entities.Local;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalRepository extends JpaRepository<Local,Integer> {
}
