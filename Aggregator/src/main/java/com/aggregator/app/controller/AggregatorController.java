package com.aggregator.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.aggregator.app.dto.OrderDetailsResponseDTO;
import com.aggregator.app.dto.OrdersDTO;
import com.aggregator.app.dto.UserDetailsDTO;

@RestController
public class AggregatorController {

	@Autowired
	RestTemplate restTemplate;

	private String userDetailsUrl = System.getenv("USER");
	private String orderDetailsUrl = System.getenv("ORDER");
	

	@GetMapping("/orderdetails/{id}")
	public OrderDetailsResponseDTO getOrderDetails(@PathVariable Integer id) {
		System.out.println(System.getenv());
		UserDetailsDTO user = restTemplate.getForObject(userDetailsUrl + id, UserDetailsDTO.class);
		OrdersDTO order = restTemplate.getForObject(orderDetailsUrl + id, OrdersDTO.class);

		OrderDetailsResponseDTO detailsResponseDTO = new OrderDetailsResponseDTO(user, order);

		return detailsResponseDTO;

	}

}
