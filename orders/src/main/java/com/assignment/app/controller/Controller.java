package com.assignment.app.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.app.ordersService.OrdersService;
import com.assignment.app.ordersdto.OrderDTO;
import com.assignment.app.ordersdto.UserOrders;

@RestController
public class Controller {

	@Autowired
	private OrdersService orderService;

	@GetMapping("/orders/{id}")
	public UserOrders getOrders(@PathVariable Integer id) {
		List<OrderDTO> ol = orderService.getOrders().getOrders().stream().filter(o -> (o.getUserId() == id))
				.collect(Collectors.toList()).get(0).getOrders();

		return new UserOrders(ol);
	}
}
