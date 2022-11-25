package com.crud.h2.service;

import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.crud.h2.dao.IRoleDAO;
import com.crud.h2.dto.Role;

@Service
public class RoleServiceImpl implements IRoleService {
	
	@Autowired
	IRoleDAO iRoleDAO;
	
	@Override
	public List<Role> listarRole() {
		
		return iRoleDAO.findAll();
	}

	@Override
	public Role guardarRole(Role role) {
		
		return iRoleDAO.save(role);
	}

	@Override
	public Role roleXID(long id) {
		
		return iRoleDAO.findById(id).get();
	}
	

	@Override
	public Role actualizarRole(Role role) {
		
		return iRoleDAO.save(role);
	}

	@Override
	public void eliminarRole(long id) {
		
		iRoleDAO.deleteById(id);
		
	}
	
}
