package com.shop.retrocoffeeshop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tbl_orderItems")

public class OrderItems {
	
	@Id
	@SequenceGenerator(name="orderItems_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="orderItems_seq")
	
	int orderItemId;
	int orderItemQuantity;
	
	@OneToOne
	@JoinColumn(name="itemId")
	Items item;

	Order order;
	
	public int getOrderItemId() {
		return orderItemId;
	}
	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}
	public int getOrderItemQuantity() {
		return orderItemQuantity;
	}
	public void setOrderItemQuantity(int orderItemQuantity) {
		this.orderItemQuantity = orderItemQuantity;
	}
	
	public Items getItem() {
		return item;
	}
	public void setItem(Items item) {
		this.item = item;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	
	
	

}
