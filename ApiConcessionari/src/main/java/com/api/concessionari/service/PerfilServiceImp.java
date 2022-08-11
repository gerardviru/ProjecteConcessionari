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
	public Perfil savePerfil(Perfil perfil) {
		// TODO Auto-generated method stub
		return iPerfilDAO.save(perfil);
	}

	@Override
	public Perfil getById(Long IDPK_PERFIL) {
		// TODO Auto-generated method stub
		return iPerfilDAO.findById(IDPK_PERFIL).get();
	}

	@Override
	public Perfil updatePerfil(Perfil perfil) {
		// TODO Auto-generated method stub
		return iPerfilDAO.save(perfil);
	}

	@Override
	public void deletePerfil(Long IDPK_PERFIL) {
		// TODO Auto-generated method stub
		
	}


	
}
