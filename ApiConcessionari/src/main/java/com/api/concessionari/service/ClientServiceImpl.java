package com.api.concessionari.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.concessionari.dao.IClientDAO;
import com.api.concessionari.dto.Client;

@Service
public class ClientServiceImpl implements IClientService{

	@Autowired
	IClientDAO iClientDAO;
	
	@Override
	public List<Client> listarClient() {
		// TODO Auto-generated method stub
		return iClientDAO.findAll();
	}

	@Override
	public Client guardarClient(Client client) {
		// TODO Auto-generated method stub
		return iClientDAO.save(client);
	}

	@Override
	public Client personasXID(Long IDPK_CLIENT) {
		// TODO Auto-generated method stub
		return iClientDAO.findById(IDPK_CLIENT).get();
	}

	@Override
	public Client actualizarClient(Client client) {
		// TODO Auto-generated method stub
		return iClientDAO.save(client);
	}

	@Override
	public void eliminarClient(Long IDPK_CLIENT) {
		// TODO Auto-generated method stub
		
	}

}
