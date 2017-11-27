package com.capgemini.jfs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.capgemini.jfs.model.Manufacturer;

@RepositoryRestResource(path="Comapnies")
public interface ManufactureJpaRepository extends JpaRepository<Manufacturer, Long> {

	void findActiveTrue();
}
