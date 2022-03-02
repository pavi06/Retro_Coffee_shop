package com.shop.retrocoffeeshop.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import com.shop.retrocoffeeshop.entity.Customer;

@Repository
public class CustomerRepoImpl implements CustomerRepo {
	
	@PersistenceContext
	EntityManager em;

	@Override
	@Transactional
	public void addCustomer(Customer customer) {
		Customer new_Customer= em.merge(customer);
	}

	@Override
	public Customer findCustomerById(int customerId) {
		Customer c=em.find(Customer.class, customerId);
		return c;
	}

}
