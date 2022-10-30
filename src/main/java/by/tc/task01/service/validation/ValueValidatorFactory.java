package by.tc.task01.service.validation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.validation.validators.*;

/**
 * 
 * Criteria validator's factory
 * 
 */
public class ValueValidatorFactory {

	private static final ValueValidatorFactory instance = new ValueValidatorFactory();
	
	private final Map<List<String>, ValueValidator> validators = new HashMap<List<String>, ValueValidator>();
	
	/**
	 * Get the instance of a factory
	 * @return instance of the factory
	 */
	public static ValueValidatorFactory getInstance() {
		return instance;
	}
	
	public ValueValidator getValidator(String searchCriteria) {
		for (Map.Entry<List<String>, ValueValidator> entry : validators.entrySet()) {
			List<String> key = entry.getKey();
			ValueValidator value = entry.getValue();
			
			if (key.contains(searchCriteria)) {
				return value;
			}
		}
		return null;
	}
	
	/**
	 *Instantiates a map of search criteria
	 */
	private ValueValidatorFactory() {
		
		validators.put(
				List.of(
						SearchCriteria.Oven.POWER_CONSUMPTION.name(),
						SearchCriteria.Oven.WEIGHT.name(),
			            SearchCriteria.Oven.CAPACITY.name(),
			            SearchCriteria.Oven.DEPTH.name(),
			            
			            SearchCriteria.Laptop.MEMORY_ROM.name(),
		                SearchCriteria.Laptop.SYSTEM_MEMORY.name(),
		                SearchCriteria.Laptop.DISPLAY_INCHS.name(),

		                SearchCriteria.Refrigerator.POWER_CONSUMPTION.name(),
		                SearchCriteria.Refrigerator.WEIGHT.name(),
		                SearchCriteria.Refrigerator.FREEZER_CAPACITY.name(),
		                SearchCriteria.Refrigerator.HEIGHT.name(),
		                SearchCriteria.Refrigerator.WIDTH.name(),

		                SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.name(),
		                SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.name(),
		                SearchCriteria.VacuumCleaner.CLEANING_WIDTH.name(),

		                SearchCriteria.TabletPC.BATTERY_CAPACITY.name(),
		                SearchCriteria.TabletPC.DISPLAY_INCHES.name(),
		                SearchCriteria.TabletPC.MEMORY_ROM.name(),
		                SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.name(),

		                SearchCriteria.Speakers.POWER_CONSUMPTION.name(),
		                SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.name(),
		                SearchCriteria.Speakers.CORD_LENGTH.name()
		                ),
						new IntValidator());
		
		validators.put(
				List.of(
		                SearchCriteria.Oven.HEIGHT.name(),
		                SearchCriteria.Oven.WIDTH.name(),

		                SearchCriteria.Laptop.BATTERY_CAPACITY.name(),
		                SearchCriteria.Laptop.CPU.name(),

		                SearchCriteria.Refrigerator.OVERALL_CAPACITY.name()
		                ),
						new DoubleValidator());
		
		validators.put(
				List.of(
		                SearchCriteria.Laptop.OS.name(),

		                SearchCriteria.VacuumCleaner.BAG_TYPE.name(),
		                SearchCriteria.VacuumCleaner.WAND_TYPE.name()
						),
						new StringValidator());
				
		validators.put(
				List.of(
						SearchCriteria.TabletPC.COLOR.name()
						),
						new ColorValidator());
		
		validators.put(
				List.of(
						SearchCriteria.Speakers.FREQUENCY_RANGE.name()
						), 
						new RangeValidator());

		validators.put(
				List.of(
						SearchCriteria.VacuumCleaner.FILTER_TYPE.name()
						),
						new FilterTypeValidator());
	}
}
