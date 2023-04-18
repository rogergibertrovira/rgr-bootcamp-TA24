package com.rgibert.ta24.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rgibert.ta24.dto.Empleado;

public interface IEmpleadoDAO extends  JpaRepository<Empleado, Long>{

	// Listar empleados por campo nombre
	public List<Empleado> findByNombre(String nombre);
	
	public List<Empleado> findByTrabajo(String trabajo);
}
