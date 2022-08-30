package com.api.concessionari.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.api.concessionari.dao.IUsuariDAO;
import com.api.concessionari.dto.Usuari;

@Service
public class UsuariServiceImpl implements IUsuariService,UserDetailsService {

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
		return null;
	}

	@Override
	public Usuari getById(Long IDPK_USUARI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuari updateUsuari(Usuari usuari) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUsuari(Long IDPK_USUARI) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuari usuario = iUsuariDAO.findByUsername(username);
		if (usuario == null) {
			throw new UsernameNotFoundException(username);
		}

		return new User(usuario.getUsername(), usuario.getPassword(), usuario.getAuthorities());
	}
	

	
}
