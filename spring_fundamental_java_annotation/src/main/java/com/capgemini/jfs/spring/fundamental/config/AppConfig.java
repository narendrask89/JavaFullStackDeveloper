package com.capgemini.jfs.spring.fundamental.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.capgemini.jfs.spring.fundamental"})
public class AppConfig {

	/*@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}*/

	/*@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		//CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerRepository());
		CustomerServiceImpl customerService = new CustomerServiceImpl();
		//customerService.setCustomerRepository(getCustomerRepository());
		return customerService;
	}*/
}
