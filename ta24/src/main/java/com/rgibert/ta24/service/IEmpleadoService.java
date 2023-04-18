package com.rgibert.ta24.service;

import java.util.List;

import com.rgibert.ta24.dto.Empleado;

public interface IEmpleadoService {

	// Metodos del CRUD
	public List<Empleado> listarEmpleados(); // Listar All

	public Empleado guardarEmpleado(Empleado empleado); // Guarda un empleado CREATE

	public Empleado empleadoXID(Long id); // Leer datos de un empleado READ

	public Empleado actualizarEmpleado(Empleado empleado); // Actualiza datos del empleado UPDATE

	public void eliminarEmpleado(Long id);// Elimina el empleado DELETE

	// Otros listados
	public List<Empleado> listarEmpleadosNombre(String nombre);// Listar Empleados por campo nombre

	public List<Empleado> listarEmpleadosTrabajo(String trabajo);// Listar Empleados por campo trabajo
}
