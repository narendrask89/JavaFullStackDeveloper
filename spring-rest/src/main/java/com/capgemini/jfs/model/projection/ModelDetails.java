package com.capgemini.jfs.model.projection;

import java.math.BigDecimal;

import org.springframework.data.rest.core.config.Projection;

import com.capgemini.jfs.model.Model;

@Projection(name="modelDetail", types=Model.class)
public interface ModelDetails {

	public String getName();
	public BigDecimal getPrice();
	public String getWoodType();
	
}
