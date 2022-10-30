package by.tc.task01.entity.criteria;

/**
 * Contains all fields associated with appliances 
 */
public final class SearchCriteria {
	
	/**
	 * Oven fields
	 */
	public static enum Oven{
		POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH
	}
	
	/**
	 * Laptop fields
	 */
	public static enum Laptop{
		BATTERY_CAPACITY, OS, MEMORY_ROM, SYSTEM_MEMORY, CPU, DISPLAY_INCHS
	}

	/**
	 * Refrigerator fields
	 */
	public static enum Refrigerator{
		POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, OVERALL_CAPACITY, HEIGHT, WIDTH
	}
	
	/**
	 * VacuumCleaner fields
	 */
	public static enum VacuumCleaner{
		POWER_CONSUMPTION, FILTER_TYPE, BAG_TYPE, WAND_TYPE, MOTOR_SPEED_REGULATION, CLEANING_WIDTH
	}
	
	/**
	 * TabletPC fields
	 */
	public static enum TabletPC{
		BATTERY_CAPACITY, DISPLAY_INCHES, MEMORY_ROM, FLASH_MEMORY_CAPACITY, COLOR		
	}
	
	/**
	 * Speakers fields
	 */
	public static enum Speakers{
		POWER_CONSUMPTION, NUMBER_OF_SPEAKERS, FREQUENCY_RANGE, CORD_LENGTH
	}
	
	private SearchCriteria() {}
}

