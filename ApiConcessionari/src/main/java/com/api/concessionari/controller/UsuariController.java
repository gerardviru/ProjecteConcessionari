package com.api.concessionari.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.concessionari.dao.IUsuariDAO;
import com.api.concessionari.dto.Usuari;
import com.api.concessionari.service.UsuariServiceImpl;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class UsuariController {

	
	private IUsuariDAO usuariDAO;

	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public UsuariController() {
		
	}
	
	
	
	public UsuariController(IUsuariDAO usuariDAO, BCryptPasswordEncoder bCryptPasswordEncoder,
			UsuariServiceImpl usuariServiceImpl) {
		this.usuariDAO = usuariDAO;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
		this.usuariServiceImpl = usuariServiceImpl;
	}


	@Autowired
	UsuariServiceImpl usuariServiceImpl;
	
	
	@GetMapping("/response-entity-builder-with-http-headers")
	public ResponseEntity<String> usingResponseEntityBuilderAndHttpHeaders() {
	    HttpHeaders responseHeaders = new HttpHeaders();
	    responseHeaders.set("Baeldung-Example-Header", 
	      "Value-ResponseEntityBuilderWithHttpHeaders");

	    return ResponseEntity.ok()
	      .headers(responseHeaders)
	      .body("Response with header using ResponseEntity");
	}
	
	@GetMapping("/usuari")
	@PreAuthorize("hasAnyAuthority('ADMIN','USER')")
	public List<Usuari> listarGcon_tb_usuaris(){
		return usuariServiceImpl.listarUsuari();
	}
	

	@PostMapping("/usuari")
	public Usuari salvarGcon_tb_usuari(@RequestBody Usuari usuari) {
		usuari.setPassword(bCryptPasswordEncoder.encode(usuari.getPassword()));
		usuariDAO.save(usuari);
		
		return usuari;
	}
	
	
	@GetMapping("/usuari/{id}")
	public Usuari gcon_tb_usuariXID(@PathVariable(name="id") Long id) {
		
		
		Usuari usuari_xid= new Usuari();
		
		usuari_xid=usuariServiceImpl.getById(id);
		
		return usuari_xid;
	}
	
	@PutMapping("/usuari/{id}")
	public Usuari actualizarGcon_tb_usuari(@PathVariable(name="id")Long id,@RequestBody Usuari usuari) {
		
		Usuari usuari_seleccionado= new Usuari();
		Usuari usuari_actualizado= new Usuari();
		
		usuari_seleccionado= usuariServiceImpl.getById(id);
		
		usuari_seleccionado.setUsername(usuari.getUsername());
		usuari_seleccionado.setPassword(usuari.getPassword());
		usuari_seleccionado.setRol(usuari.getRol());
		
	
		usuari_actualizado = usuariServiceImpl.updateUsuari(usuari_seleccionado);
		
		return usuari_actualizado;
	}
	
	@DeleteMapping("/usuari/{id}")
	public void eleiminarGcon_tb_usuari(@PathVariable(name="id")Long id) {
		usuariServiceImpl.deleteUsuari(id);
	}
}

