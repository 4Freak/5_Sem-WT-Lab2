package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;


/**
 * 
 *Oven appliance
 *
 */
public class Oven extends Appliance{
	
	public int powerConsumption;
	public int weight;
	public int capacity;
	public int depth;
	public double height;
	public double width;
	
	@Override
	public String toString() {
		return String.format(
				"Oven : POWER_CONSUMTION = %d, " +
				"WEIGTH = %d, " +
				"CAPACITY = %d, " +
				"DEPTH = %d, " +
				"HEIGHT = %.2f, " + 
				"WIDTH = %.2f ", 
				powerConsumption, weight, capacity, depth, height, width);
	}

	/**
	 * {@inheritDoc}	
	 */
	@Override
	public boolean isMatch(String key, Object value) {
		return switch(SearchCriteria.Oven.valueOf(key)) {
			case POWER_CONSUMPTION 	-> powerConsumption == (Integer)value;
			case WEIGHT 			-> weight == (Integer)value;
			case CAPACITY			-> capacity == (Integer)value;
			case DEPTH				-> depth == (Integer)value;
			case HEIGHT				-> height == (Double)value;
			case WIDTH				-> width == (Double)value;
		};
	}
	
}
