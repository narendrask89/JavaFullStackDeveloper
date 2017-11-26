package com.capgemini.jfs.spring.fundamental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.jfs.spring.fundamental.model.Customer;
import com.capgemini.jfs.spring.fundamental.reposiroty.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	//@Autowired
	private CustomerRepository customerRepository;

	public CustomerServiceImpl() {
	}

	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("Constructor injection");
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {

		return customerRepository.findAll();
	}

	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("setter injection");
		this.customerRepository = customerRepository;
	}
}
