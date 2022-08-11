package com.api.concessionari.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.concessionari.dto.Venta;
import com.api.concessionari.service.VentaServiceImpl;


@RestController
@RequestMapping("/api")

public class VentaController {

	@Autowired
	VentaServiceImpl ventaServiceImpl;
	
	
	public VentaController() {
	}
	
	// Get all
	@GetMapping("/venta")
	public List<Venta> listarVentas() {
		return ventaServiceImpl.listarVenta();
	}

	// Get venta by id
	@GetMapping("/venta/{id}")
	public Venta listarPorId(@PathVariable(name = "id") Long idpk_venta) {
		return ventaServiceImpl.getById(idpk_venta);
	}

	
	// Add Venta
	@PostMapping("/venta")
	public Venta addNewVenta(@RequestBody Venta venta) {
		return ventaServiceImpl.saveVenta(venta);
	}
	
	// Update Venta
	@PutMapping("/venta/{id}")
	public Venta updateVenta(@PathVariable(name = "id") Long idpk_venta, @RequestBody Venta venta) {

		Venta venta_seleccionada = new Venta();
		Venta venta_actualizada = new Venta();
		
		System.out.println(venta.toString());

		venta_seleccionada = ventaServiceImpl.getById(idpk_venta);

		if(venta.getVehicle()!= null) {
			venta_seleccionada.setVehicle(venta.getVehicle());			
		}
		if(venta.getDescompte() != null) {
			venta_seleccionada.setDescompte(venta.getDescompte());			
		}
		if(venta.getConcessionari() != null) {
			venta_seleccionada.setConcessionari(venta.getConcessionari());			
		}
		if(venta.getPreu_final() != null) {
			venta_seleccionada.setPreu_final(venta.getPreu_final());			
		}

		venta_actualizada = ventaServiceImpl.updateVenta(venta_seleccionada);
		return venta_actualizada;
	}

	// Delete venta
	@DeleteMapping("/venta/{id}")
	public void deleteVenta(@PathVariable(name = "id") Long idpk_venta) {
		ventaServiceImpl.deleteVenta(idpk_venta);
	}

}
