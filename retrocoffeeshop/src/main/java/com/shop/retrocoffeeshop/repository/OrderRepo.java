package com.shop.retrocoffeeshop.repository; 

import java.util.List; 
import com.shop.retrocoffeeshop.entity.Order;

public interface OrderRepo {
	Order createOrder();
	void cancelOrder(Order order);
	Order repeatOrder(Order order);
	Order viewOrderDetails(int orderId);
	List<Order> getOrdersByUserId(int userId);

}
