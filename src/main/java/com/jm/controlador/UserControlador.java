package com.jm.controlador;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jm.modelos.User;
import com.jm.repositorio.InterfaceUsuario;

@RestController
@RequestMapping("/User")
public class UserControlador {
	
	@Autowired
	private InterfaceUsuario interfaceUser;
	
	@GetMapping
	public List<User> usuarios()
	{
		return (List<User>) interfaceUser.findAll();
		
	}
	

}
