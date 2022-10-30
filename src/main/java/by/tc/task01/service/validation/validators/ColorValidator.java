package by.tc.task01.service.validation.validators;

import java.awt.Color;
import java.lang.reflect.Field;
import java.util.Locale;

import by.tc.task01.service.validation.ValueValidator;

/**
 * 
 * Implements value validator for double
 * 
 */
public class ColorValidator implements ValueValidator {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean validate(Object obj) {
		try {
			Field field = Color.class.getField(obj.toString().toLowerCase(Locale.ROOT));
			return (Color)field.get(null) != null;
		}catch(Exception e) {
			return false;			
		}
	}
}