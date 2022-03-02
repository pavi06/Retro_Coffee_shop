package com.shop.retrocoffeeshop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import antlr.collections.List;

@Entity
@Table(name="tbl_users")


public class Users {
	
	@Id
	@SequenceGenerator(name="user_seq",initialValue=2000,allocationSize= 1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="user_seq")
	
	private int userId;
	private String firstName;
	private String lastName;
	private String mobile;
	private int points;
	
	
//	private List<Order> orders;
	
	public Users() {
		super();
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	
//	public List<Order> getOrders() {
//		return orders;
//	}
//
//	public void setOrders(List<Order> orders) {
//		this.orders = orders;
//	}
	
}
