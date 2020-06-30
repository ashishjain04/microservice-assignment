package com.assignment.app.ordersdto;

import java.util.ArrayList;
import java.util.List;

public class UserOrders {
	private List<OrderDTO> orders = new ArrayList<>();

	public UserOrders(List<OrderDTO> orders) {
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
