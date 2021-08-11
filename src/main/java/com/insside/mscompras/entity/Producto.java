package com.insside.mscompras.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto  implements Serializable {
		

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String marca;
		private String modelo;
		private Double precio;
		private Integer codigo;
		


		public Long getId() {
			return id;
		}



		public void setId(Long id) {
			this.id = id;
		}



		public String getMarca() {
			return marca;
		}



		public void setMarca(String marca) {
			this.marca = marca;
		}



		public String getModelo() {
			return modelo;
		}



		public void setModelo(String modelo) {
			this.modelo = modelo;
		}



		public Double getPrecio() {
			return precio;
		}



		public void setPrecio(Double precio) {
			this.precio = precio;
		}



		public Integer getCodigo() {
			return codigo;
		}



		public void setCodigo(Integer codigo) {
			this.codigo = codigo;
		}



		/**
	 * 
	 */
	private static final long serialVersionUID = -6851202107649776537L;
		
}
