package com.assignment.app.ordersService;

import com.assignment.app.orders.Orders;
import com.assignment.app.ordersdto.OrderDTO;
import com.assignment.app.ordersdto.OrdersDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {

	/**
	 * This method will generate dummy order details
	 * 
	 * @return orderDto that is having list of orders.
	 */
	public OrdersDTO getOrders() {
		List<Orders> orderDetails = List.of(
				new Orders(1,
						List.of(new OrderDTO(1, 350, "04-May-2020"), new OrderDTO(2, 123, "21-Apr-2020"),
								new OrderDTO(3, 456, "12-May-2020"))),
				new Orders(2, List.of(new OrderDTO(1, 223, "13-Apr-2020"), new OrderDTO(2, 345, "11-May-2020"),
						new OrderDTO(3, 123, "23-May-2020"))));

		return new OrdersDTO(orderDetails);

	}

}
