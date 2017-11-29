package com.capgemini.jfs.handler;

import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

import com.capgemini.jfs.model.Manufacturer;

@Component
@RepositoryEventHandler(Manufacturer.class)
public class ManufacturerHandler {

	
	@HandleBeforeCreate
	public void handleBeforeCreate(Manufacturer m){
		
		if(!m.getActive()){
			throw new IllegalArgumentException("new manufacture must be active");
		}
	}
}
