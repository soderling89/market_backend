package com.soderling.market.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soderling.market.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
	List<Pedido> findByTotal(int total);
	List<Pedido> findByIdusuarioAndFechaBetween(int id, LocalDate dateStart, LocalDate dateEnd);

}
