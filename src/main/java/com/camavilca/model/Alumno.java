package com.camavilca.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

public class Alumno {

	@NotNull
	@Size(min = 5, max = 30)
	private String nombre;

	@NotNull
	@Range(min = 0, max = 20)
	private Integer nota1;
	@NotNull
	@Range(min = 0, max = 20)
	private Integer nota2;
	@NotNull
	@Range(min = 0, max = 20)
	private Integer nota3;
	
	
	private String condicion;
	private int promedio;
	

	public String getCondicion() {
		return condicion;
	}

	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}

	public int getPromedio() {
		return promedio;
	}

	public void setPromedio(int promedio) {
		this.promedio = promedio;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getNota1() {
		return nota1;
	}

	public void setNota1(Integer nota1) {
		this.nota1 = nota1;
	}

	public Integer getNota2() {
		return nota2;
	}

	public void setNota2(Integer nota2) {
		this.nota2 = nota2;
	}

	public Integer getNota3() {
		return nota3;
	}

	public void setNota3(Integer nota3) {
		this.nota3 = nota3;
	}
	


	public Alumno(@NotNull @Size(min = 5, max = 30) String nombre, @NotNull @Range(min = 0, max = 20) Integer nota1,
			@NotNull @Range(min = 0, max = 20) Integer nota2, @NotNull @Range(min = 0, max = 20) Integer nota3,
		    String condicion, int promedio) {
		super();
		this.nombre = nombre;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.condicion = condicion;
		this.promedio = promedio;
	}

	public Alumno() {
		super();
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + 
				", condicion=" + condicion + ", promedio=" + promedio + "]";
	}
	

}