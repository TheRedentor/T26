package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	
	@ManyToOne
    @JoinColumn(name="usuario_id")
    private Usuario usuario;
	
	public Role() {
		
	}
	
	public Role(long id, String name, Usuario usuario) {
		//super();
		this.id = id;
		this.name = name;
		this.usuario = usuario;
	}
	
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
