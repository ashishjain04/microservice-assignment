package com.aggregator.app.dto;

public class OrderDetailsResponseDTO {

	private UserDetailsDTO userDetailsDTO;

	private OrdersDTO ordersDTO;
	
	

	public OrderDetailsResponseDTO() {
		super();
	}

	public OrderDetailsResponseDTO(UserDetailsDTO userDetails, OrdersDTO orders) {
		super();
		this.userDetailsDTO = userDetails;
		this.ordersDTO = orders;
	}

	public UserDetailsDTO getUserDetailsDTO() {
		return userDetailsDTO;
	}

	public void setUserDetailsDTO(UserDetailsDTO userDetailsDTO) {
		this.userDetailsDTO = userDetailsDTO;
	}

	public OrdersDTO getOrdersDTO() {
		return ordersDTO;
	}

	public void setOrdersDTO(OrdersDTO ordersDTO) {
		this.ordersDTO = ordersDTO;
	}

}
