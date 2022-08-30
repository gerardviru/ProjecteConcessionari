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

	public UsuariController(IUsuariDAO UsuariDAO, BCryptPasswordEncoder bCryptPasswordEncoder) {
		this.usuariDAO = UsuariDAO;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
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
	public List<Usuari> listarGcon_tb_usuari(){
		return usuariServiceImpl.listarUsuari();
	}
	

	@PostMapping("/usuari")
	public Usuari salvarGcon_tb_usuario(@RequestBody Usuari usuario) {
		usuario.setPassword(bCryptPasswordEncoder.encode(usuario.getPassword()));
		usuariDAO.save(usuario);
		
		return usuario;
	}
	
	
	@GetMapping("/usuari/{id}")
	public Usuari gcon_tb_usuari(@PathVariable(name="id") Long idpk_usuari) {
		
		
		Usuari usuari= new Usuari();
		
		usuari=usuariServiceImpl.getById(idpk_usuari);
		
				//System.out.println("Gcon_tb_usuario XID: "+Gcon_tb_usuario_xid);
		
		return usuari;
	}
	
	@PutMapping("/usuario/{id}")
	public Usuari actualizarGcon_tb_usuario(@PathVariable(name="id")Long idpk_usuari,@RequestBody Usuari usuari) {
		
		Usuari usuario_seleccionado= new Usuari();
		Usuari usuario_actualizado= new Usuari();
		
		usuario_seleccionado= usuariServiceImpl.getById(idpk_usuari);
		
		usuario_seleccionado.setUsername(usuari.getUsername());
		usuario_seleccionado.setPassword(usuari.getPassword());
		usuario_seleccionado.setRol(usuari.getRol());
		
	
		usuario_actualizado = usuariServiceImpl.updateUsuari(usuario_seleccionado);
		
		return usuario_actualizado;
	}
	
	@DeleteMapping("/usuario/{id}")
	public void eleiminarGcon_tb_usuario(@PathVariable(name="id")Long idpk_usuari) {
		usuariServiceImpl.deleteUsuari(idpk_usuari);
	}
}