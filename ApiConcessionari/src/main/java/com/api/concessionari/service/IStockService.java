package com.api.concessionari.service;

import java.util.List;

import com.api.concessionari.dto.Stock;


public interface IStockService {
	
	//Lista de reservas
		public List <Stock> listarStock();
						
		
		//Guardar
		public Stock guardarStock(Stock stock);
						
				
		//Leer por id
		public Stock stockID(Long IDPK_STOCK);
						
						
		//Actualizar
		public Stock actualizarStock(Stock stock);
						
						
		//Elimina la reserva
		public void eliminarStock(Long IDPK_STOCK);

}
