package com.insside.mscompras.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insside.mscompras.entity.OrdenCompra;
import com.insside.mscompras.repository.OrdenCompraRepository;
import com.insside.mscompras.service.IOrdenCompraService;

@RestController
public class OrdenCompraController {
	
	@Autowired
	private  IOrdenCompraService iOrdenCompraService;
	
	
	@RequestMapping("/buscarOrdenCompra/{ordenCompraId}")
	public List<OrdenCompra> getByNumeroOrdenCompra(@PathVariable String ordenCompraId){
		return iOrdenCompraService.getByNumeroOrdenCompra(ordenCompraId);
	}
	
	@PostMapping ("/saveOrdenCompra")
	public OrdenCompra save(@RequestBody OrdenCompra ordenCompra){
		return iOrdenCompraService.save(ordenCompra);
	}
	
	@RequestMapping("/listarOrdenCompra")
	public List<OrdenCompra> findAll(){
		return iOrdenCompraService.findAll();
	}
	
}
