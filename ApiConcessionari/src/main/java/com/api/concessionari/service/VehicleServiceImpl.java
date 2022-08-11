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
	public Vehicle saveVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return iVehicleDAO.save(vehicle);
	}

	@Override
	public Vehicle getById(Long IDPK_VEHICLE) {
		// TODO Auto-generated method stub
		return iVehicleDAO.findById(IDPK_VEHICLE).get();
	}

	@Override
	public Vehicle updateVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return iVehicleDAO.save(vehicle);
	}

	@Override
	public void deleteVehicle(Long IDPK_VEHICLE) {
		// TODO Auto-generated method stub
		
	}

}
