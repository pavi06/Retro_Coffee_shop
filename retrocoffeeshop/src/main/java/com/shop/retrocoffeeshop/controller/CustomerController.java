package com.shop.retrocoffeeshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shop.retrocoffeeshop.dto.CustomerDto;
import com.shop.retrocoffeeshop.entity.Customer;
import com.shop.retrocoffeeshop.service.CustomerService;

@CrossOrigin("*")
@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@PostMapping(path = "/addCustomer")
	public Customer addCustomer(@RequestBody CustomerDto customer) {
		Customer c = new Customer();
		try {
			c.setName(customer.getName());
			c.setMobile(customer.getMobile());
			c.setPoints(customer.getPoints());
			customerService.addCustomer(c);
		}catch(Exception e){
			e.printStackTrace();
		}
		return c;	
	}
	
	
	@PostMapping(path = "/findCustomer")
	public Customer findCustomerById(@RequestParam("customerId") int customerId) {
		return customerService.findCustomerById(customerId);
	}

	
}
