package by.tc.task01.service.validation.validators;

import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.service.validation.ValueValidator;

/**
 * 
 * Implements value validator for filter
 * 
 */
public class FilterTypeValidator implements ValueValidator {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean validate(Object obj) {
		try {
			VacuumCleaner.FilterType.valueOf((String)obj);
			return true;
		}catch(Exception e) {
			return false;			
		}
	}
}
