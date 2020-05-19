package com.soderling.market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soderling.market.service.UsuarioService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping(path = "/usuarios")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping("/vip/{id}")
	public boolean esUsuarioVip(@PathVariable Integer id) {				
		return usuarioService.esUsuarioVip(id);
	}

}
