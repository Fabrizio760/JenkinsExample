package com.controlador;

import java.util.List;

import com.modelo.Vehiculo;

public class FabricaController {
private List<Vehiculo> listavehiculos;
	
	public void guardarVehiculo(Vehiculo vehiculo) {
			
			listavehiculos.add(vehiculo);
			
	}

	public List<Vehiculo> mostrarListado() {
		
		return listavehiculos;
	}

	public int cantidadVehiculosCreados() {
		
		return listavehiculos.size();
	}

	public FabricaController(List<Vehiculo> listavehiculos) {
		this.listavehiculos = listavehiculos;
	}
}
