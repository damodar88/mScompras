package com.insside.mscompras.service;

import java.util.List;

import com.insside.mscompras.entity.OrdenCompra;

public interface IOrdenCompraService {
	
	public OrdenCompra save(OrdenCompra ordenCompra);
	
	public List<OrdenCompra> findAll();
	
	public List<OrdenCompra> getByNumeroOrdenCompra(String ordenCompraId);
	

}
