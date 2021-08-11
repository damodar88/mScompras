package com.insside.mscompras.service;

import java.util.List;

import com.insside.mscompras.entity.Producto;

public interface IProductoService {
	
	public List<Producto> findAll();
	public Producto findById(Long id);

}
