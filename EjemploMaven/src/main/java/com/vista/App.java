package com.vista;

import java.util.ArrayList;

import com.controlador.FabricaController;
import com.modelo.Tipo;
import com.modelo.Vehiculo;


public class App 
{
    public static void main( String[] args ){
    	
    	FabricaController fc = new FabricaController(new ArrayList<>());
    	
    	fc.guardarVehiculo(new Vehiculo("Honda", "X250", "Rojo", Tipo.MOTOCICLETA, 150000));
    	
    	System.out.println(fc.cantidadVehiculosCreados());
    	
    	fc.mostrarListado().forEach(x ->{
			System.out.println(x);
		});

    }
}
