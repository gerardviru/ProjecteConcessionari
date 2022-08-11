package com.api.concessionari.service;

import java.util.List;

import com.api.concessionari.dto.Stock;


public interface IStockService {
	
	//Lista de reservas
		public List <Stock> listarStock();
						
		
		//Guardar
		public Stock saveStock(Stock stock);
						
				
		//Leer por id
		public Stock getById(Long IDPK_STOCK);
						
						
		//Actualizar
		public Stock updateStock(Stock stock);
						
						
		//Elimina la reserva
		public void deleteStock(Long IDPK_STOCK);

}
