package com.assignment.app.ordersdto;

import java.util.ArrayList;
import java.util.List;

import com.assignment.app.orders.Orders;

public class OrdersDTO {

	private List<Orders> orders = new ArrayList<>();

	public OrdersDTO(List<Orders> orders) {
		super();
		this.orders = orders;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

}
