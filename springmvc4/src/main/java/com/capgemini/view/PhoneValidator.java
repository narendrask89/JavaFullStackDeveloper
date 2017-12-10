package com.capgemini.view;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneValidator implements ConstraintValidator<Phone, String> {

	@Override
	public void initialize(Phone phone) {
		
	}

	@Override
	public boolean isValid(String phoneField, ConstraintValidatorContext ctx) {
		if(phoneField == null)
			return false;
		return phoneField.matches("[0-9()-]*");
	}

}
