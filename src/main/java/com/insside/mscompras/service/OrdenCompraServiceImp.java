package com.insside.mscompras.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.insside.mscompras.entity.OrdenCompra;
import com.insside.mscompras.repository.OrdenCompraRepository;

@Service
public class OrdenCompraServiceImp implements IOrdenCompraService {
	
	@Autowired
	private  OrdenCompraRepository ordenCompraRepository;
	

	@Override
	@Transactional(readOnly = true)
	public OrdenCompra save(OrdenCompra ordenCompra) {
		return ordenCompraRepository.save(ordenCompra);
	}

	@Override
	@Transactional(readOnly = true)
	public List<OrdenCompra> findAll() {
		return (List<OrdenCompra>) ordenCompraRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public List<OrdenCompra> getByNumeroOrdenCompra(String ordenCompraId) {
		return ordenCompraRepository.getByNumeroOrdenCompra(ordenCompraId);
	}

}
