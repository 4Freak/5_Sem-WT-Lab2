package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

/**
 * Speakers appliance
 */
public class Speakers extends Appliance{

	public int powerConsumtion;
	public int numberOfSpeakers;
	public String frequencyRange;
	public int cordLength;
	
	@Override
	public String toString() {
		return String.format(
				"Speaker : POWER_CONSUMTION = %d, " +
				"NUMBER_OF_SPEAKERS = %d, " +
				"FREQUENCY_RANGE = %s, " +
				"CORD_LENGTH = %d, ",
				powerConsumtion, numberOfSpeakers, frequencyRange, cordLength);
	}

	/**
	 * {@inheritDoc}	
	 */
	@Override
	public boolean isMatch(String key, Object value) {
		return switch(SearchCriteria.Speakers.valueOf(key)) {
			case POWER_CONSUMPTION 	-> powerConsumtion == (Integer)value;
			case NUMBER_OF_SPEAKERS -> numberOfSpeakers == (Integer)value;
			case FREQUENCY_RANGE	-> frequencyRange.equals(value);
			case CORD_LENGTH		-> cordLength == (Integer)value;
		};
	}
}
