package com.modelo;

import java.util.List;

public interface Fabricavehiculos {
	
	public void guardarVehiculo(Vehiculo vehiculo);

	public List<Vehiculo> mostrarListado();

	public int cantidadVehiculosCreados();
}
