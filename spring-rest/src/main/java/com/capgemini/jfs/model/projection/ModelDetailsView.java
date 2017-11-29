package com.capgemini.jfs.model.projection;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.capgemini.jfs.model.Model;

@Projection(name="modelDetail", types=Model.class)
public interface ModelDetailsView {

	@Value("#{target.name}")
	public String getModelName();
	public BigDecimal getPrice();
	public String getWoodType();
	
	@Value("#{target.manufacturer.name.split(' ')[0] #{target.name}}")
	public String getFullName();
	
}
