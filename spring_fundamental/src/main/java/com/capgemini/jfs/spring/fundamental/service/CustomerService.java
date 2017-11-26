package com.capgemini.jfs.spring.fundamental.service;

import java.util.List;

import com.capgemini.jfs.spring.fundamental.model.Customer;

public interface CustomerService {

	List<Customer> findAll();

}