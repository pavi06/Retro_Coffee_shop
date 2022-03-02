package com.shop.retrocoffeeshop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name="retro_customers")
public class Customer {
	
	@Id
	@SequenceGenerator(name="customer_seq",initialValue=2000,allocationSize= 1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="customer_seq")
	private int customerId;
	private String name;
	private String mobile;
	private int points;
	
	@OneToMany
	@JoinColumn(name="customerId")
	private List<Order> orders;
	
	public Customer() {
		super();
	}
	
	
	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
}
