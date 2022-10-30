package by.tc.task01.entity;

public abstract class Appliance {

	/**
	 * Return true if value matches giving criteria
	 * @param key - filed to match for 
	 * @param value - value of field
	 * @return true if value matches giving criteria, otherwise - false
	 */
	public abstract boolean isMatch(String key, Object value);
}
