package com.insside.mscompras.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.insside.mscompras.entity.OrdenCompra;

public interface OrdenCompraRepository  extends CrudRepository<OrdenCompra, Long> {
	
	@Query("Select pro FROM OrdenCompra  pro WHERE pro.numeroOrden=:ordenCompraConsultaId")
	List<OrdenCompra> getByNumeroOrdenCompra(@Param("ordenCompraConsultaId")String ordenCompraConsultaId);
}
