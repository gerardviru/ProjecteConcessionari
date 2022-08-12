package com.api.concessionari.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
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
	public Rol saveRol(Rol rol) {
		// TODO Auto-generated method stub
		return iRolDAO.save(rol);
	}

	@Override
	public Rol getById(Long IDPK_ROL) {
		// TODO Auto-generated method stub
		return iRolDAO.findById(IDPK_ROL).get();
	}
	
	@Override
	public Rol updateRol(Rol rol) {
		// TODO Auto-generated method stub
		return iRolDAO.save(rol);
	}

	@Override
	public void deleteRol(Long IDPK_ROL) {
		// TODO Auto-generated method stub
		
	}

}
