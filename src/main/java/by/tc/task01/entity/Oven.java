package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;


/**
 * 
 *Oven appliance
 *
 */
public class Oven extends Appliance{
	
	public int powerConsumtion;
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
				"HEIGHT = %.1f, " + 
				"WIDTH = %.1f", 
				powerConsumtion, weight, capacity, depth, height, weight);
	}

	/**
	 * {@inheritDoc}	
	 */
	@Override
	public boolean isMatch(String key, Object value) {
		return switch(SearchCriteria.Oven.valueOf(key)) {
			case POWER_CONSUMPTION 	-> powerConsumtion == (Integer)value;
			case WEIGHT 			-> weight == (Integer)value;
			case CAPACITY			-> capacity == (Integer)value;
			case DEPTH				-> depth == (Integer)value;
			case HEIGHT				-> height == (Double)value;
			case WIDTH				-> width == (Double)value;
		};
	}
	
}
