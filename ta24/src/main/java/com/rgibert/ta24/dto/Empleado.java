package com.rgibert.ta24.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import com.rgibert.ta24.Trabajo;

@Entity
@Table(name = "empleados")
public class Empleado {

	// Atributos de entidad empleado
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "trabajo")
	private String trabajo;
	@Column(name = "salario")
	private int salario;

	public Empleado() {
	}

	/**
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param trabajo
	 */
	public Empleado(Long id, String nombre, String apellido, String trabajo) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;

		if (trabajo == Trabajo.DEVELOPER.toString()) {
			this.trabajo = Trabajo.DEVELOPER.toString();
			this.salario = 2000;
		} else if (trabajo == Trabajo.CONSULTANT.toString()) {
			this.trabajo = Trabajo.CONSULTANT.toString();
			this.salario = 1500;
		} else if (trabajo == Trabajo.ENGINEER.toString()) {
			this.trabajo = Trabajo.ENGINEER.toString();
			this.salario = 2400;
		} else if (trabajo == Trabajo.CEO.toString()) {
			this.trabajo = Trabajo.CEO.toString();
			this.salario = 5800;
		}
	}

	// Getters
	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public int getSalario() {
		return salario;
	}

	// Setters
	public void setId(Long id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setTrabajo(String trabajo) {
		if (trabajo.equalsIgnoreCase(Trabajo.DEVELOPER.toString())) {
			this.trabajo = Trabajo.DEVELOPER.toString();
			this.salario = 2000;
		} else if (trabajo.equalsIgnoreCase(Trabajo.CONSULTANT.toString())) {
			this.trabajo = Trabajo.CONSULTANT.toString();
			this.salario = 1500;
		} else if (trabajo.equalsIgnoreCase(Trabajo.ENGINEER.toString())) {
			this.trabajo = Trabajo.ENGINEER.toString();
			this.salario = 2400;
		} else if (trabajo.equalsIgnoreCase(Trabajo.CEO.toString())) {
			this.trabajo = Trabajo.CEO.toString();
			this.salario = 5800;
		}
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", trabajo=" + trabajo
				+ ", salario=" + salario + "]";
	}
}
