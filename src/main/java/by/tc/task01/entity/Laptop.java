package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

/**
 * Laptop appliance
 */
public class Laptop extends Appliance{
	
	public double batteryCapacity;
	public String os;
	public int memoryRom;
	public int systemMemory;
	public double cpu;
	public int displayInch;
	
	@Override
	public String toString() {
		return String.format(
				"Laptop: BATTERY_CAPACITY = %.1f, " +
				"OS = $s, " + 
				"MEMORY_ROM = %d, " + 
				"SYSTEM_MEMORY = %d, " +
				"CPU = %.1f, " +
				"DISPLAY_INCH = %d",
				batteryCapacity, os, memoryRom, systemMemory, cpu, displayInch);
	}
	
	/**
	 * 
	 *{@inheritDoc}
	 */
	@Override
	public boolean isMatch(String key, Object value) {
		return switch (SearchCriteria.Laptop.valueOf(key)) {
			case BATTERY_CAPACITY	-> batteryCapacity == (Integer)value;
			case OS 				-> os == (String)value;
			case MEMORY_ROM			-> memoryRom == (Integer)value;
			case SYSTEM_MEMORY		-> systemMemory == (Integer)value;
			case CPU				-> cpu == (Double)value;
			case DISPLAY_INCHS		-> displayInch == (Integer)value;
		};
	}
}
