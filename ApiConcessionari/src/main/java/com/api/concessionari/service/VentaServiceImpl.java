package com.api.concessionari.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.concessionari.dao.IVentaDAO;
import com.api.concessionari.dto.Venta;

@Service
public class VentaServiceImpl implements IVentaService{

	@Autowired
	IVentaDAO iVentaDAO;

	@Override
	public List<Venta> listarUsuari() {
		// TODO Auto-generated method stub
		return iVentaDAO.findAll();
	}

	@Override
	public Venta guardarUsuari(Venta venta) {
		// TODO Auto-generated method stub
		return iVentaDAO.save(venta);
	}

	@Override
	public Venta ventaID(Long IDPK_VENTA) {
		// TODO Auto-generated method stub
		return iVentaDAO.findById(IDPK_VENTA).get();
	}

	@Override
	public Venta actualizarVenta(Venta venta) {
		// TODO Auto-generated method stub
		return iVentaDAO.save(venta);
	}

	@Override
	public void eliminarVenta(Long IDPK_VENTA) {
		// TODO Auto-generated method stub
		
	}
	
	
}
