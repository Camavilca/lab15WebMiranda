package com.camavilca.model;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Positive;
import org.hibernate.validator.constraints.Length;
import com.sun.istack.internal.NotNull;

public class Producto {

	private static final String message = "tiene que ser mayor de cero";

	@NotNull
	@Length(min = 5 , max=30)
	private String nombre;

	@NotNull
	@Positive
	private double precio;

	@NotNull
	@Positive
	private int cantidad;

	private double descuento;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getDescuento() {
		double des = getPrecio() * getCantidad();
		double res = 0;
		if (des > 1000) {
			res = des - (des * 0.5);
		}else {
			res = des;
		}
		return res;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public static String getMessage() {
		return message;
	}

	public Producto(@Length(min = 5) String nombre, @DecimalMin("tiene que ser mayor de cero") double precio,
			@Positive int cantidad, double descuento) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		this.descuento = descuento;
	}

	public Producto() {
		super();
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + ", descuento="
				+ descuento + "]";
	}

}
