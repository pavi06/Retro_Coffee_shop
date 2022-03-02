package com.shop.retrocoffeeshop.repository;
import com.shop.retrocoffeeshop.entity.Customer;


public interface CustomerRepo {
	
	public void addCustomer(Customer customer);
	public Customer findCustomerById(int customerId);

}
