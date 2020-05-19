package com.soderling.market.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soderling.market.model.Pedido;
import com.soderling.market.model.Usuario;
import com.soderling.market.repository.UsuarioRepository;
import com.soderling.market.service.UsuarioService;

@RestController
@RequestMapping(path = "/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository repository;
	
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping
	public Iterable<Usuario> all() {
		return repository.findAll();
	}
	
	@GetMapping("/vip")
	public Iterable<Pedido> findByIdUsuarioAndFecha() {				
		return usuarioService.findByIdUsuarioAndFecha();
	}

}
