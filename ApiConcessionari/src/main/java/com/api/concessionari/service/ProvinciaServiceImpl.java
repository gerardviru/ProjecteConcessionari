package com.api.concessionari.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
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
	public Provincia saveProvincia(Provincia provincia) {
		// TODO Auto-generated method stub
		return iprovinciaDAO.save(provincia);
	}

	@Override
	public Provincia getById(Long IDPK_PROV) {
		// TODO Auto-generated method stub
		return iprovinciaDAO.findById(IDPK_PROV).get();
	}

	@Override
	public Provincia updateProvincia(Provincia provincia) {
		// TODO Auto-generated method stub
		return iprovinciaDAO.save(provincia);
	}

	@Override
	public void deleteProvincia(Long IDPK_PROV) {
		// TODO Auto-generated method stub
		iprovinciaDAO.deleteById(IDPK_PROV);
		
	}


	

	

}
