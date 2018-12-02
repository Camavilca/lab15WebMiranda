package com.camavilca.calculos;

import com.camavilca.model.Alumno;

public class Calculos {

	Alumno alumno;
	public int Calcular() {
		int promedio;
		promedio = (alumno.getNota1()+alumno.getNota2()+alumno.getNota3())/3;
		return promedio;
	}
}
