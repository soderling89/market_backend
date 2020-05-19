package com.soderling.market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.soderling.market.model.Pedido;
import com.soderling.market.repository.PedidoRepository;

@Service
public class PedidoServiceImpl implements PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;

	@Override
	@Transactional
	public void save(Pedido pedido) {
		pedidoRepository.save(pedido);
	}

}
