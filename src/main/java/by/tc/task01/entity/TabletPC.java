package by.tc.task01.entity;

import java.awt.Color;
import java.util.Locale;

import by.tc.task01.entity.criteria.SearchCriteria;

/**
 * TabletPC appliance
 */
public class TabletPC extends Appliance{

	public int batteryCapacity;
	public int displayInches;
	public int memoryRom;
	public int flashMemoryCapacity;
	public Color color;
	
	@Override
	public String toString() {
		return String.format(
				"TabletPC: BATTERY_CAPACITY = %.1f, " +
				"DISPLAY_INCHES = $d, " + 
				"MEMORY_ROM = %d, " + 
				"FLASH_MEMORY_CAPACITY = %d, " +
				"COLOR = %s",
				batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color.toString());
	}
	
	/**
	 * 
	 *{@inheritDoc}
	 */
	@Override
	public boolean isMatch(String key, Object value) {
        Color clr = null;
        if (SearchCriteria.TabletPC.valueOf(key) == SearchCriteria.TabletPC.COLOR){
            try{
                clr = (Color) Color.class.getField(value.toString().toLowerCase(Locale.ROOT)).get(null);
            }
            catch (Exception e){
            	throw new IllegalArgumentException("Cannot hadle color field");
            }
        }
		return switch (SearchCriteria.TabletPC.valueOf(key)) {
			case BATTERY_CAPACITY		-> batteryCapacity == (Integer)value;
			case DISPLAY_INCHES 		-> displayInches == (Integer)value;
			case MEMORY_ROM				-> memoryRom == (Integer)value;
			case FLASH_MEMORY_CAPACITY	-> flashMemoryCapacity == (Integer)value;
			case COLOR					-> color == clr;
		};
	}
}
