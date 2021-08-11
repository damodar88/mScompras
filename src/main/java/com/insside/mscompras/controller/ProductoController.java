package com.insside.mscompras.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insside.mscompras.entity.Producto;
import com.insside.mscompras.service.IProductoService;

@RestController
public class ProductoController {
	
	@Autowired
	private IProductoService iProductoService;
	
	@GetMapping("/listar")
	public List<Producto> listar(){
		return iProductoService.findAll();
	}
	
	@GetMapping("/listar/{id}")
	public Producto detalle(@PathVariable Long id ){
		return iProductoService.findById(id);
	}
	
}
