package com.shop.retrocoffeeshop.service;

import com.shop.retrocoffeeshop.entity.Customer;

public interface CustomerService {
	public void addCustomer(Customer customer);
	public Customer findCustomerById(int customerId);

}
