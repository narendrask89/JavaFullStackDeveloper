package com.capgemini.jfs.spring.fundamental;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.jfs.spring.fundamental.config.AppConfig;
import com.capgemini.jfs.spring.fundamental.service.CustomerService;

public class Application {

	public static void main(String[] args) {

		// CustomerService customerService = new CustomerServiceImpl();

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService customerService = applicationContext.getBean(CustomerService.class, "customerService");

		System.out.println(customerService.findAll().get(0).getFirstName());
	}

}
