package com.api.concessionari.service;

import java.util.List;

import com.api.concessionari.dto.Venta;

public interface IVentaService {
	
	//Lista de reservas
		public List <Venta> listarUsuari();
						
		
		//Guardar
		public Venta guardarUsuari(Venta venta);
						
				
		//Leer por id
		public Venta ventaID(Long IDPK_VENTA);
						
						
		//Actualizar
		public Venta actualizarVenta(Venta venta);
						
						
		//Elimina la reserva
		public void eliminarVenta(Long IDPK_VENTA);

}
