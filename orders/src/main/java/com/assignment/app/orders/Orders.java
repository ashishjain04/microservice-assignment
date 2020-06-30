package com.assignment.app.orders;

import java.util.ArrayList;
import java.util.List;

import com.assignment.app.ordersdto.OrderDTO;

public class Orders {

	private Integer userId;
	private List<OrderDTO> orders = new ArrayList<>();

	public Orders() {
		super();
	}

	public Orders(Integer userId, List<OrderDTO> orders) {
		super();
		this.userId = userId;
		this.orders = orders;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public List<OrderDTO> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderDTO> orders) {
		this.orders = orders;
	}

}
