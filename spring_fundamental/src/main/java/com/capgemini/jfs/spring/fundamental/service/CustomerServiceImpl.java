package com.capgemini.jfs.spring.fundamental.service;

import java.util.List;

import com.capgemini.jfs.spring.fundamental.model.Customer;
import com.capgemini.jfs.spring.fundamental.reposiroty.CustomerRepository;
import com.capgemini.jfs.spring.fundamental.reposiroty.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.capgemini.jfs.spring.fundamental.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){

		return customerRepository.findAll();
	}
}
