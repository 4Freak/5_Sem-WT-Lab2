package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

/**
 * VacuumCleaner appliance
 */
public class VacuumCleaner extends Appliance{
	
	public enum FilterType{
	        A, B, C
	    }
	
	public int powerConsumtion;
	public FilterType filterType;
	public String bagType ;
	public String wandType;
	public int motorSpeedRegulation;
	public int cleaningWidth;
	
	@Override
	public String toString() {
		return String.format(
				"Vacuum cleaner: POWER_CONSUMPTION = $d, " + 
				"FILTER_TYPE = %s, " + 
				"BAG_TYPE = %s, " +
				"WAND_TYPE = %s, " +
				"MOTOR_SPEED_REGULATION = %d, " + 
				"CLEANING_WIDTH = %d",
				powerConsumtion, filterType.toString(), bagType, wandType, motorSpeedRegulation, cleaningWidth);
	}
	
	/**
	 * 
	 *{@inheritDoc}
	 */
	@Override
	public boolean isMatch(String key, Object value) {
		return switch (SearchCriteria.VacuumCleaner.valueOf(key)) {
			case POWER_CONSUMPTION		-> powerConsumtion == (Integer)value;
			case FILTER_TYPE 			-> filterType == FilterType.valueOf((String) value);
			case BAG_TYPE				-> bagType.equals(value);
			case WAND_TYPE				-> wandType.equals(value);
			case MOTOR_SPEED_REGULATION	-> motorSpeedRegulation == (Integer)value;
			case CLEANING_WIDTH			-> cleaningWidth == (Integer)value;
		};
	}

}
