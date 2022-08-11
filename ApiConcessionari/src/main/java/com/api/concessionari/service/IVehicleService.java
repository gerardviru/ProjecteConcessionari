package com.api.concessionari.service;

import java.util.List;

import com.api.concessionari.dto.Vehicle;

public interface IVehicleService {

	//Lista de reservas
		public List <Vehicle> listarVehicle();
						
		
		//Guardar
		public Vehicle guardarVehicle(Vehicle vehicle);
						
				
		//Leer por id
		public Vehicle vehicleID(Long IDPK_VEHICLE);
						
						
		//Actualizar
		public Vehicle actualizarVehicle(Vehicle vehicle);
						
						
		//Elimina la reserva
		public void eliminarVehicle(Long IDPK_VEHICLE);
		
	
}
