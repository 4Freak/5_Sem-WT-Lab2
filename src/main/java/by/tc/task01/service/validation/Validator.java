package by.tc.task01.service.validation;

import java.util.Map;

import by.tc.task01.entity.criteria.Criteria;

/**
 * 
 * Validator for single criteria
 * 
 */
public class Validator {
	
	public static boolean criteriaValidator(Criteria criteria) {
		
		if (criteria == null || criteria.getSearchCriteria() == null) {
			return false;
		}
		
		Map<String, Object> searchCriteria = criteria.getSearchCriteria();
		
		for (Map.Entry<String, Object> entry : searchCriteria.entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();
			
			ValueValidator valValidator = ValueValidatorFactory.getInstance().getValidator(key);
			boolean isValid = valValidator.validate(value);
			if (!isValid) {
				return false;
			}
		}
		
			return true;
	}

}