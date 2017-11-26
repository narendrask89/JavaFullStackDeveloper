package com.capgemini.jfs.spring.fundamental.service;

import java.util.List;

import com.capgemini.jfs.spring.fundamental.model.Customer;
import com.capgemini.jfs.spring.fundamental.reposiroty.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;

	public CustomerServiceImpl() {
	}

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {

		return customerRepository.findAll();
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
}
