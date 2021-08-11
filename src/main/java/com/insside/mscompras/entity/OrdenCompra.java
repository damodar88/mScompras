package com.insside.mscompras.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "orden_compras")
public class OrdenCompra implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn( name = "clientes_id"  )
	Cliente cliente;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn( name = "productos_id"  )
	Producto producto;
	
	@Column(name = "fecha_compras")
	@Temporal(TemporalType.DATE)
	private Date fechaCompra;
	private Double totalPagar;
	
	@Column(name = "numero_orden")
	private String numeroOrden;
	

	

	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public Cliente getCliente() {
		return cliente;
	}




	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}




	public Producto getProducto() {
		return producto;
	}




	public void setProducto(Producto producto) {
		this.producto = producto;
	}




	public Date getFechaCompra() {
		return fechaCompra;
	}




	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}




	public Double getTotalPagar() {
		return totalPagar;
	}




	public void setTotalPagar(Double totalPagar) {
		this.totalPagar = totalPagar;
	}




	public String getNumeroOrde() {
		return numeroOrden;
	}




	public void setNumeroOrde(String numeroOrde) {
		this.numeroOrden = numeroOrde;
	}




	/**
	 * 
	 */
	private static final long serialVersionUID = 1007915626969249404L;

}
