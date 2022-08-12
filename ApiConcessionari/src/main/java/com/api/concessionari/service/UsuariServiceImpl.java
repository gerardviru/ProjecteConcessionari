package com.api.concessionari.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
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
	public Usuari saveUsuari(Usuari usuari) {
		// TODO Auto-generated method stub
		return iUsuariDAO.save(usuari);
	}

	@Override
	public Usuari getById(Long IDPK_USUARI) {
		// TODO Auto-generated method stub
		return iUsuariDAO.findById(IDPK_USUARI).get();
	}

	@Override
	public Usuari updateUsuari(Usuari usuari) {
		// TODO Auto-generated method stub
		return iUsuariDAO.save(usuari);
	}

	@Override
	public void deleteUsuari(Long IDPK_USUARI) {
		// TODO Auto-generated method stub
		
	}
}
