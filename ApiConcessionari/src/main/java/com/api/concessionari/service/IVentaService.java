package com.api.concessionari.service;

import java.util.List;

import com.api.concessionari.dto.Venta;

public interface IVentaService {
	
	//Lista de reservas
		public List <Venta> listarVenta();
						
		
		//Guardar
		public Venta saveVenta(Venta venta);
						
				
		//Leer por id
		public Venta getById(Long IDPK_VENTA);
						
						
		//Actualizar
		public Venta updateVenta(Venta venta);
						
						
		//Elimina la reserva
		public void deleteVenta(Long IDPK_VENTA);

}
