package com.api.concessionari.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.concessionari.dao.IUsuariDAO;
import com.api.concessionari.dto.Usuari;

@Service
public class UsuariServiceImpl implements IUsuariService{

	@Autowired
	IUsuariDAO iUsuariDAO;

	@Override
	public List<Usuari> listarUsuari() {
		// TODO Auto-generated method stub
		return iUsuariDAO.findAll();
	}

	@Override
	public Usuari guardarUsuari(Usuari usuari) {
		// TODO Auto-generated method stub
		return iUsuariDAO.save(usuari);
	}

	@Override
	public Usuari usuariID(Long IDPK_USUARI) {
		// TODO Auto-generated method stub
		return iUsuariDAO.findById(IDPK_USUARI).get();
	}

	@Override
	public Usuari actualizarUsuari(Usuari usuari) {
		// TODO Auto-generated method stub
		return iUsuariDAO.save(usuari);
	}

	@Override
	public void eliminarUsuari(Long IDPK_USUARI) {
		// TODO Auto-generated method stub
		
	}
	
	
}
