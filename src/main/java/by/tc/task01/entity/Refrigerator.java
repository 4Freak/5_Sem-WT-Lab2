package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

/**
 * 
 * Refrigerator appliance
 * 
 */
public class Refrigerator extends Appliance{
	
	public int powerConsumtion;
	public int weight;
	public int freezerCapacity;
	public int overallCapacity;
	public double height;
	public double width;
	
	@Override
	public String toString() {
		return String.format(
				"Refrigerator : POWER_CONSUMTION = %d, " +
				"WEIGTH = %d, " +
				"FREEZER_CAPACITY = %d, " +
				"OVERALL_CAPACITY = %d, " +
				"HEIGHT = %.1f, " + 
				"WIDTH = %.1f", 
				powerConsumtion, weight, freezerCapacity, overallCapacity, height, weight);
	}

	/**
	 * {@inheritDoc}	
	 */
	@Override
	public boolean isMatch(String key, Object value) {
		return switch(SearchCriteria.Refrigerator.valueOf(key)) {
			case POWER_CONSUMPTION 	-> powerConsumtion == (Integer)value;
			case WEIGHT 			-> weight == (Integer)value;
			case FREEZER_CAPACITY	-> freezerCapacity == (Integer)value;
			case OVERALL_CAPACITY	-> overallCapacity == (Integer)value;
			case HEIGHT				-> height == (Double)value;
			case WIDTH				-> width == (Double)value;
		};
	}
}
