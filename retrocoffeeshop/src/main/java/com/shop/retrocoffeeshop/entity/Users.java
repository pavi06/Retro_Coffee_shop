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
@Table(name="tbl_users")
public class Users {
	
	@Id
	@SequenceGenerator(name="user_seq",initialValue=2000,allocationSize= 1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="user_seq")
	private int userId;
	private String name;
	private String mobile;
	private int points;
	
	@OneToMany
	@JoinColumn(name="userId")
	private List<Order> orders;
	
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
		return name;
	}
	public void setFirstName(String name) {
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
