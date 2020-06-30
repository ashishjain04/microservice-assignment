package com.aggregator.app.dto;

import java.util.ArrayList;
import java.util.List;


public class OrdersDTO {

	private List<OrderDTO> orders = new ArrayList<>();
	

	public OrdersDTO() {
		super();
	}

	public OrdersDTO(List<OrderDTO> orders) {
		super();
		this.orders = orders;
	}

	public List<OrderDTO> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderDTO> orders) {
		this.orders = orders;
	}
}
