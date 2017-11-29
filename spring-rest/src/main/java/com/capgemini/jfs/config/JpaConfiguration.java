package com.capgemini.jfs.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages={"com.capgemini.jfs.repository"})
public class JpaConfiguration {

}
