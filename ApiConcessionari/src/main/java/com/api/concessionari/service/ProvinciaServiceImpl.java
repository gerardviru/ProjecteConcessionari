package com.api.concessionari.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.concessionari.dao.IProvinciaDAO;
import com.api.concessionari.dto.Provincia;

@Service
public class ProvinciaServiceImpl implements IProvinciaService{

	@Autowired
	IProvinciaDAO iprovinciaDAO;
	
	@Override
	public List<Provincia> listarProvincia() {
		// TODO Auto-generated method stub
		return iprovinciaDAO.findAll();
	}

	@Override
	public Provincia guardarProvincia(Provincia provincia) {
		// TODO Auto-generated method stub
		return iprovinciaDAO.save(provincia);
	}

	@Override
	public Provincia provinciaID(Long IDPK_PROV) {
		// TODO Auto-generated method stub
		return iprovinciaDAO.findById(IDPK_PROV).get();
	}

	@Override
	public Provincia actualizarProvincia(Provincia provincia) {
		// TODO Auto-generated method stub
		return iprovinciaDAO.save(provincia);
	}

	@Override
	public void eliminarProvincia(Long IDPK_PROV) {
		// TODO Auto-generated method stub
		
	}

	

	

}
