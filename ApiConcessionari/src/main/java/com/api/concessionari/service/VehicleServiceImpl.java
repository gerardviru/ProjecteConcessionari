package com.api.concessionari.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.concessionari.dao.IVehicleDAO;
import com.api.concessionari.dto.Vehicle;

@Service
public class VehicleServiceImpl implements IVehicleService{

	@Autowired
	IVehicleDAO iVehicleDAO;

	@Override
	public List<Vehicle> listarVehicle() {
		// TODO Auto-generated method stub
		return iVehicleDAO.findAll();
	}

	@Override
	public Vehicle guardarVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return iVehicleDAO.save(vehicle);
	}

	@Override
	public Vehicle vehicleID(Long IDPK_VEHICLE) {
		// TODO Auto-generated method stub
		return iVehicleDAO.findById(IDPK_VEHICLE).get();
	}

	@Override
	public Vehicle actualizarVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return iVehicleDAO.save(vehicle);
	}

	@Override
	public void eliminarVehicle(Long IDPK_VEHICLE) {
		// TODO Auto-generated method stub
		
	}
}
