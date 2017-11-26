package com.capgemini.jfs.spring.fundamental.reposiroty;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.capgemini.jfs.spring.fundamental.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

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
