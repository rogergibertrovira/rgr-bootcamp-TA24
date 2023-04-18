package com.rgibert.ta24.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rgibert.ta24.dto.Empleado;
import com.rgibert.ta24.service.EmpleadoServiceImp;


@RestController
@RequestMapping("/api")
public class EmpleadoController {
	
	@Autowired
	EmpleadoServiceImp empleadoServiceImp;

	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados() {
		return empleadoServiceImp.listarEmpleados();
	}
	
	@PostMapping("/empleados")
	public Empleado guardarEmpleado(@RequestBody Empleado empleado) {
		return empleadoServiceImp.guardarEmpleado(empleado);
	}
	
	@GetMapping("/empleados/{id}")
	public Empleado empleadoXID(@PathVariable(name="id") Long id) {
		return empleadoServiceImp.empleadoXID(id);
	}
	
	@PutMapping("empleados/{id}")
	public Empleado actualizarEmpleado(@PathVariable(name="id") Long id, @RequestBody Empleado empleado) {
		Empleado empleadoSeleccionado = new Empleado();
		Empleado empleadoActualizado = new Empleado();
		
		empleadoSeleccionado = empleadoServiceImp.empleadoXID(id);
		
		empleadoSeleccionado.setNombre(empleado.getNombre());
		empleadoSeleccionado.setApellido(empleado.getApellido());
		empleadoSeleccionado.setTrabajo(empleado.getTrabajo());
		
		empleadoActualizado = empleadoServiceImp.actualizarEmpleado(empleadoSeleccionado);
		
		return empleadoActualizado;

	}
	
	@DeleteMapping("/empleados/{id}")
	public void eliminarEmpleado(@PathVariable(name="id")Long id) {
		empleadoServiceImp.eliminarEmpleado(id);
	}
	
	@GetMapping("/empleados/nombre/{nombre}")
	public List<Empleado> listarEmpleadoNombre(@PathVariable(name="nombre") String nombre){
		return empleadoServiceImp.listarEmpleadosNombre(nombre);
	}
	
	@GetMapping("/empleados/trabajo/{trabajo}")
	public List<Empleado> listarEmpleadosTrabajo(@PathVariable(name="trabajo") String trabajo){
		return empleadoServiceImp.listarEmpleadosTrabajo(trabajo);
	}
}
