package com.api.concessionari.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.concessionari.dto.Vehicle;
import com.api.concessionari.service.VehicleServiceImpl;

@RestController
@RequestMapping("/api")

public class VehicleController {
	
	@Autowired
	VehicleServiceImpl vehicleServiceImpl;
	
	
	public VehicleController() {
	}
	
	// Get all
	@GetMapping("/vehicle")
	public List<Vehicle> listarVehicles() {
		return vehicleServiceImpl.listarVehicle();
	}

	// Get vehicle by id
	@GetMapping("/vehicle/{id}")
	public Vehicle listarPorId(@PathVariable(name = "id") Long idpk_vehicle) {
		return vehicleServiceImpl.getById(idpk_vehicle);
	}

	
	// Add Vehicle
	@PostMapping("/vehicle")
	public Vehicle addNewVehicle(@RequestBody Vehicle vehicle) {
		return vehicleServiceImpl.saveVehicle(vehicle);
	}
	
	// Update Vehicle
	@PutMapping("/vehicle/{id}")
	public Vehicle updateVehicle(@PathVariable(name = "id") Long idpk_vehicle, @RequestBody Vehicle vehicle) {

		Vehicle vehicle_seleccionada = new Vehicle();
		Vehicle vehicle_actualizada = new Vehicle();
		
		System.out.println(vehicle.toString());

		vehicle_seleccionada = vehicleServiceImpl.getById(idpk_vehicle);

		if(vehicle.getModel()!= null) {
			vehicle_seleccionada.setModel(vehicle.getModel());			
		}
		if(vehicle.getMarca() != null) {
			vehicle_seleccionada.setMarca(vehicle.getMarca());			
		}
		if(vehicle.getColor() != null) {
			vehicle_seleccionada.setColor(vehicle.getColor());			
		}
		
		vehicle_actualizada = vehicleServiceImpl.updateVehicle(vehicle_seleccionada);
		return vehicle_actualizada;
	}

	// Delete vehicle
	@DeleteMapping("/vehicle/{id}")
	public void deleteVehicle(@PathVariable(name = "id") Long idpk_vehicle) {
		vehicleServiceImpl.deleteVehicle(idpk_vehicle);
	}

}
