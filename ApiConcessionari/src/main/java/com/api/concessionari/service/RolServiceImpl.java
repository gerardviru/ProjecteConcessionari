package com.api.concessionari.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.concessionari.dao.IRolDAO;
import com.api.concessionari.dto.Rol;

@Service
public class RolServiceImpl implements IRolService{
	
	@Autowired
	IRolDAO iRolDAO;

	@Override
	public List<Rol> listarRol() {
		// TODO Auto-generated method stub
		return iRolDAO.findAll();
	}

	@Override
	public Rol guardarRol(Rol rol) {
		// TODO Auto-generated method stub
		return iRolDAO.save(rol);
	}

	@Override
	public Rol rolID(Long IDPK_ROL) {
		// TODO Auto-generated method stub
		return iRolDAO.findById(IDPK_ROL).get();
	}
	
	@Override
	public Rol actualizarRol(Rol rol) {
		// TODO Auto-generated method stub
		return iRolDAO.save(rol);
	}

	@Override
	public void eliminarRol(Long IDPK_ROL) {
		// TODO Auto-generated method stub
		
	}
	

}
