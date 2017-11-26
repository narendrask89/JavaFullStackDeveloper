package com.capgemini.jfs.spring.fundamental.reposiroty;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.jfs.spring.fundamental.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.capgemini.jfs.spring.fundamental.reposiroty.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {

		List<Customer> list = new ArrayList<>();

		Customer customer = new Customer();
		customer.setFirstName("Narendra");
		customer.setLastName("Sahu");

		list.add(customer);

		return list;
	}
}
