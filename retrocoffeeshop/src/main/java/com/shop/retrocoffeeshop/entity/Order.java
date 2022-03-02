package com.shop.retrocoffeeshop.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="retro_orders")

public class Order implements Serializable{
	
	@Id
	@SequenceGenerator(name="order_seq",initialValue = 1,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "order_seq")
	int orderId;
	String orderDate;
	double totalOrderAmount;
	int itemCount;
	double gst;
	
	@OneToMany(mappedBy = "order",cascade = CascadeType.ALL)
	List<OrderItems> orderItems;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="customerId")
	Customer customer;
	
	public Order() {
		super();
	}

	public Order(int orderId,String orderDate,int itemCount,double totalOrderAmount,double gst, Customer customer,
			List<OrderItems> orderItems) {
		super();
		this.orderId = orderId;
		this.orderDate=orderDate;
		this.itemCount=itemCount;
		this.totalOrderAmount = totalOrderAmount;
		this.gst=gst;
		this.customer = customer;
		this.orderItems = orderItems;
	}



	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public double getTotalOrderAmount() {
		return totalOrderAmount;
	}

	public void setTotalOrderAmount(double totalOrderAmount) {
		this.totalOrderAmount = totalOrderAmount;
	}
    
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public List<OrderItems> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItems> orderItems) {
		this.orderItems = orderItems;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	public double getGst() {
		return gst;
	}

	public void setGst(double gst) {
		this.gst = gst;
	}
	
}
