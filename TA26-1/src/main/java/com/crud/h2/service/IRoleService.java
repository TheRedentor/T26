package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Role;

public interface IRoleService {
	
	public List<Role> listarRole();
	
	public Role guardarRole(Role role);
	
	public Role roleXID(long id);
	
	public Role actualizarRole(Role role);
	
	public void eliminarRole(long id);
	
}
