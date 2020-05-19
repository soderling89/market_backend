package com.soderling.market.service;

import com.soderling.market.model.Pedido;

public interface UsuarioService {
	Iterable<Pedido> findByIdUsuarioAndFecha(); 

}
