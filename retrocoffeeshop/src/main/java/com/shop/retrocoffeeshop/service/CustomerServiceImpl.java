package com.shop.retrocoffeeshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.retrocoffeeshop.entity.Customer;
import com.shop.retrocoffeeshop.repository.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepo repository;

	@Override
	public void addCustomer(Customer customer) {
		repository.addCustomer(customer);
		
	}

	@Override
	public Customer findCustomerById(int customerId) {
		return repository.findCustomerById(customerId);
	}

	
}
