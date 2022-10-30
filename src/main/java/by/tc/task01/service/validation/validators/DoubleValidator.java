package by.tc.task01.service.validation.validators;

import by.tc.task01.service.validation.ValueValidator;

/**
 * 
 * Implements value validator for double
 * 
 */
public class DoubleValidator implements ValueValidator {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean validate(Object obj) {
		try {
			return (Double)obj > 0;
		}catch(Exception e) {
			return false;			
		}
	}
}