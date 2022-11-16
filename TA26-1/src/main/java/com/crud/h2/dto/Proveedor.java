package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="proveedores")
public class Proveedor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo_proveedor;
	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany
    @JoinColumn(name="codigo_proveedor")
    private List<Suministra> sala;
	
	public Proveedor() {
		
	}

	/**
	 * @param codigo_proveedor
	 * @param nombre
	 */
	public Proveedor(int codigo_proveedor, String nombre) {
		//super();
		this.codigo_proveedor = codigo_proveedor;
		this.nombre = nombre;
	}

	
	//Getters y Setters
	
	/**
	 * @return codigo_proveedor
	 */
	public int getId() {
		return codigo_proveedor;
	}

	/**
	 * @param codigo_proveedor
	 */
	public void setId(int codigo_proveedor) {
		this.codigo_proveedor = codigo_proveedor;
	}

	/**
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Proveedor [codigo_proveedor=" + codigo_proveedor + ", nombre=" + nombre + "]";
	}
	
}
