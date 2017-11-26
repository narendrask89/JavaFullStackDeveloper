package com.capgemini.jfs.spring.fundamental;

import com.capgemini.jfs.spring.fundamental.service.CustomerService;
import com.capgemini.jfs.spring.fundamental.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {

		CustomerService customerService = new CustomerServiceImpl();

		System.out.println(customerService.findAll().get(0).getFirstName());
	}

}
