package com.api.concessionari.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.concessionari.dao.IConcessionariDAO;
import com.api.concessionari.dto.Concessionari;

@Service
public class ConcessionariServiceImpl implements IConcessionariService {
	
	@Autowired
	IConcessionariDAO iConcessionariDAO;

	@Override
	public List<Concessionari> listarConcessionari() {
		// TODO Auto-generated method stub
		return iConcessionariDAO.findAll();
	}

	@Override
	public Concessionari getById(Long IDPK_CON) {
		// TODO Auto-generated method stub
		return iConcessionariDAO.findById(IDPK_CON).get();
	}

	@Override
	public Concessionari addNewConcessionari(Concessionari concessionari) {
		// TODO Auto-generated method stub
		return iConcessionariDAO.save(concessionari);
	}

	@Override
	public Concessionari updateConcessionari(Concessionari concessionari) {
		// TODO Auto-generated method stub
		return iConcessionariDAO.save(concessionari);
	}

	@Override
	public void deleteConcessionari(Long IDPK_CON) {
		// TODO Auto-generated method stub
		
	}

}
