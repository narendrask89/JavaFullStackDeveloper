package com.capgemini.jfs.spring.fundamental.reposiroty;

import java.util.List;

import com.capgemini.jfs.spring.fundamental.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}