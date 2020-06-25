package com.modelo;

public class Vehiculo {
	private String marca;
	private String modelo;
	private String color;
	private Tipo tipo;
	private double precio;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Vehiculo(String marca, String modelo, String color, Tipo tipo, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tipo = tipo;
		this.precio = precio;
	}

	public Vehiculo() {

	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tipo=" + tipo + ", precio="
				+ precio + "]";
	}
}
