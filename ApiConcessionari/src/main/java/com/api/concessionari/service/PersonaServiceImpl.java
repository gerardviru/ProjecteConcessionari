package com.api.concessionari.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.concessionari.dao.IPersonaDAO;
import com.api.concessionari.dto.Persona;

@Service
public class PersonaServiceImpl implements IPersonaService{

	
	@Autowired
	IPersonaDAO iPersonaDAO;
	
	@Override
	public List<Persona> listarPersona() {
		// TODO Auto-generated method stub
		return iPersonaDAO.findAll();
	}

	@Override
	public Persona guardarPersona(Persona persona) {
		// TODO Auto-generated method stub
		return iPersonaDAO.save(persona);
	}

	@Override
	public Persona personasXID(Long IDPK_PERSONA) {
		// TODO Auto-generated method stub
		return iPersonaDAO.findById(IDPK_PERSONA).get();
	}

	@Override
	public Persona actualizarPersona(Persona persona) {
		// TODO Auto-generated method stub
		return iPersonaDAO.save(persona);
	}

	@Override
	public void eliminarPersona(Long IDPK_PERSONA) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Persona getPersonaByNIF(String NIF) {
		// TODO Auto-generated method stub
		return iPersonaDAO.findByNIF(NIF);
	}

	

}
