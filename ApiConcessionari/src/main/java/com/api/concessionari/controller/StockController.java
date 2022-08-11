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

import com.api.concessionari.dto.Stock;
import com.api.concessionari.service.StockServiceImpl;


@RestController
@RequestMapping("/api")

public class StockController {

	@Autowired
	StockServiceImpl stockServiceImpl;
	
	
	public StockController() {
	}
	
	// Get all
	@GetMapping("/stock")
	public List<Stock> listarStocks() {
		return stockServiceImpl.listarStock();
	}

	// Get stock by id
	@GetMapping("/stock/{id}")
	public Stock listarPorId(@PathVariable(name = "id") Long idpk_stock) {
		return stockServiceImpl.getById(idpk_stock);
	}

	
	// Add Stock
	@PostMapping("/stock")
	public Stock addNewStock(@RequestBody Stock stock) {
		return stockServiceImpl.saveStock(stock);
	}
	
	// Update Stock
	@PutMapping("/stock/{id}")
	public Stock updateStock(@PathVariable(name = "id") Long idpk_stock, @RequestBody Stock stock) {

		Stock stock_seleccionada = new Stock();
		Stock stock_actualizada = new Stock();
		
		System.out.println(stock.toString());

		stock_seleccionada = stockServiceImpl.getById(idpk_stock);

		if(stock.getUnitats()!= null) {
			stock_seleccionada.setUnitats(stock.getUnitats());			
		}
		if(stock.getPreu() != null) {
			stock_seleccionada.setPreu(stock.getPreu());			
		}

		stock_actualizada = stockServiceImpl.updateStock(stock_seleccionada);
		return stock_actualizada;
	}

	// Delete stock
	@DeleteMapping("/stock/{id}")
	public void deleteStock(@PathVariable(name = "id") Long idpk_stock) {
		stockServiceImpl.deleteStock(idpk_stock);
	}

}
