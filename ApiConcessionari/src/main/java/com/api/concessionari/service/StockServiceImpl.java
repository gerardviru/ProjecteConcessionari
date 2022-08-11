package com.api.concessionari.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.concessionari.dao.IStockDAO;
import com.api.concessionari.dto.Stock;
import com.api.concessionari.dto.Usuari;

@Service
public class StockServiceImpl implements IStockService{

	@Autowired
	IStockDAO iStockDAO;

	@Override
	public List<Stock> listarStock() {
		// TODO Auto-generated method stub
		return iStockDAO.findAll();
	}

	@Override
	public Stock saveStock(Stock stock) {
		// TODO Auto-generated method stub
		return iStockDAO.save(stock);
	}

	@Override
	public Stock getById(Long IDPK_STOCK) {
		// TODO Auto-generated method stub
		return iStockDAO.findById(IDPK_STOCK).get();
	}

	@Override
	public Stock updateStock(Stock stock) {
		// TODO Auto-generated method stub
		return iStockDAO.save(stock);
	}

	@Override
	public void deleteStock(Long IDPK_STOCK) {
		// TODO Auto-generated method stub
		
	}
}
