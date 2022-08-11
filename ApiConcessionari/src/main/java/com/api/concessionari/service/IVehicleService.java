package com.api.concessionari.service;

import java.util.List;

import com.api.concessionari.dto.Vehicle;

public interface IVehicleService {

	//Lista de reservas
		public List <Vehicle> listarVehicle();
						
		
		//Guardar
		public Vehicle saveVehicle(Vehicle vehicle);
						
				
		//Leer por id
		public Vehicle getById(Long IDPK_VEHICLE);
						
						
		//Actualizar
		public Vehicle updateVehicle(Vehicle vehicle);
						
						
		//Elimina la reserva
		public void deleteVehicle(Long IDPK_VEHICLE);
		
	
}
