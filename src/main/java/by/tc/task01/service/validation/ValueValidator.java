package by.tc.task01.service.validation;

/**
 * 
 * Simple value validators's interface
 * 
 */
public interface ValueValidator {

	/**
	 * Validates single value
	 * @param obj - value to validate
	 * @return true if value is valid, otherwise - false
	 */
	boolean validate(Object obj);
}
