package com.api.concessionari.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
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
	public Client saveClient(Client client) {
		// TODO Auto-generated method stub
		return iClientDAO.save(client);
	}

	@Override
	public Client getById(Long IDPK_CLIENT) {
		// TODO Auto-generated method stub
		return iClientDAO.findById(IDPK_CLIENT).get();
	}

	@Override
	public Client updateClient(Client client) {
		// TODO Auto-generated method stub
		return iClientDAO.save(client);
	}

	@Override
	public void deleteClient(Long IDPK_CLIENT) {
		// TODO Auto-generated method stub
		iClientDAO.deleteById(IDPK_CLIENT);
		
	}

}
