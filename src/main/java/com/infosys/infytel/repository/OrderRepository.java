package com.infosys.infytel.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.infytel.entity.Order;


public interface OrderRepository extends JpaRepository<Order, String> {
	
	Order findTopByOrderByOrdersIdDesc();
	List<Order> findAllByBuyerId(String BuyerId);
}
