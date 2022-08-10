package com.api.concessionari.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.concessionari.dao.ITreballadorDAO;
import com.api.concessionari.dto.Treballador;

@Service
public class TreballadorServiceImpl implements ITreballadorService{

	@Autowired
	ITreballadorDAO iTreballadorDAO;
	
	@Override
	public List<Treballador> listarTreballador() {
		// TODO Auto-generated method stub
		return iTreballadorDAO.findAll();
	}

	@Override
	public Treballador guardarTreballador(Treballador treballador) {
		// TODO Auto-generated method stub
		return iTreballadorDAO.save(treballador);
	}

	@Override
	public Treballador treballadorID(Long IDPK_TREB) {
		// TODO Auto-generated method stub
		return iTreballadorDAO.findById(IDPK_TREB).get();
	}

	@Override
	public Treballador actualizarTreballador(Treballador treballador) {
		// TODO Auto-generated method stub
		return iTreballadorDAO.save(treballador);
	}

	@Override
	public void eliminarTreballador(Long IDPK_TREB) {
		// TODO Auto-generated method stub
		
	}

}