package com.soderling.market.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soderling.market.model.Pedido;
import com.soderling.market.repository.PedidoRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Override
	public boolean esUsuarioVip(Integer id) {
		LocalDate dateStart = LocalDate.now().minusMonths(1);
		LocalDate dateEnd = LocalDate.now();	
		
		
		int acu = 0;
		
		List<Pedido> listaPedidos = new ArrayList<Pedido>();	
		
		listaPedidos = pedidoRepository.findByIdusuarioAndFechaBetween(id, dateStart, dateEnd);	
		
		for (Pedido pedido : listaPedidos) {
			acu += pedido.getTotal();
		}
		
		if (acu > 10000) {
			return true;
		} else {
			return false;
		}
	}

}
