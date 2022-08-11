package com.api.concessionari.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.concessionari.dao.IPerfilDAO;
import com.api.concessionari.dto.Perfil;

@Service
public class PerfilServiceImp implements IPerfilService{

	
	@Autowired
	IPerfilDAO iPerfilDAO;

	@Override
	public List<Perfil> listarPerfil() {
		// TODO Auto-generated method stub
		return iPerfilDAO.findAll();
	}

	@Override
	public Perfil guardarPerfil(Perfil perfil) {
		// TODO Auto-generated method stub
		return iPerfilDAO.save(perfil);
	}

	@Override
	public Perfil perfilID(Long IDPK_PERFIL) {
		// TODO Auto-generated method stub
		return iPerfilDAO.findById(IDPK_PERFIL).get();
	}

	@Override
	public Perfil actualizarPerfil(Perfil perfil) {
		// TODO Auto-generated method stub
		return iPerfilDAO.save(perfil);
	}

	@Override
	public void eliminarPerfil(Long IDPK_PERFIL) {
		// TODO Auto-generated method stub
		
	}

	
}
