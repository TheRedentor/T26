package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Role;
import com.crud.h2.service.RoleServiceImpl;

@RestController
@RequestMapping("/api")
public class RoleController {
	@Autowired
	RoleServiceImpl roleServiceImpl;
	
	@GetMapping("/roles")
	public List<Role> listarRole(){
		return roleServiceImpl.listarRole();
	}
	
	
	@PostMapping("/roles")
	public Role salvarRole(@RequestBody Role role) {
		
		return roleServiceImpl.guardarRole(role);
	}
	
	
	@GetMapping("/roles/{id}")
	public Role roleXID(@PathVariable(name="id") Long id) {
		
		Role role_xid= new Role();
		
		role_xid=roleServiceImpl.roleXID(id);
		
		System.out.println("Role XID: "+role_xid);
		
		return role_xid;
	}
	
	@PutMapping("/roles/{id}")
	public Role actualizarRole(@PathVariable(name="id")long id,@RequestBody Role role) {
		
		Role role_seleccionado= new Role();
		Role role_actualizado= new Role();
		
		role_seleccionado= roleServiceImpl.roleXID(id);
		
		role_seleccionado.setName(role.getName());
		
		role_actualizado = roleServiceImpl.actualizarRole(role_seleccionado);
		
		System.out.println("El role actualizado es: "+ role_actualizado);
		
		return role_actualizado;
	}
	
	@DeleteMapping("/roles/{id}")
	public void eliminarRole(@PathVariable(name="id")long id) {
		roleServiceImpl.eliminarRole(id);
	}
}
