package com.soderling.market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.soderling.market.model.Pedido;
import com.soderling.market.service.PedidoService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class PedidosController {
	
	@Autowired
	PedidoService pedidoService;
	
	@PostMapping("/pedidos")
	@ResponseStatus(HttpStatus.CREATED)
	public Pedido create(@RequestBody Pedido pedido) {
		
		this.pedidoService.save(pedido);
		return pedido;
	}

}
