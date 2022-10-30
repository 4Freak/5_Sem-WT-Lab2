package by.tc.task01.dao.creator.appCreators;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import by.tc.task01.dao.creator.ApplianceCreator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;

/**
 * 
 * Creator of a laptop appliance
 *
 */
public class LaptorCreator implements ApplianceCreator {
	
	public static final String BATTERY_CAPACITY = "batteryCapacity";
	public static final String OS = "os";
	public static final String MEMORY_ROM = "memoryRom";
	public static final String SYSTEM_MEMORY = "systemMemory";
	public static final String CPU = "cpu";
	public static final String DISPLAY_INCHS = "displayInch";
	
    /**
     * {@inheritDoc}
     */
	@Override
	public Appliance create(NodeList nodes) {
		Laptop laptop = new Laptop();
		
		for (int i = 0; i < nodes.getLength(); i++) {
			if (nodes.item(i).getNodeType() == Node.ELEMENT_NODE) {
				String text = nodes.item(i).getTextContent();
				switch(nodes.item(i).getNodeName()) {
					case BATTERY_CAPACITY 	-> laptop.batteryCapacity = Double.parseDouble(text);
					case OS 				-> laptop.os = text;
					case MEMORY_ROM			-> laptop.memoryRom = Integer.parseInt(text);
					case SYSTEM_MEMORY		-> laptop.systemMemory = Integer.parseInt(text);
					case CPU				-> laptop.cpu = Double.parseDouble(text);
					case DISPLAY_INCHS		-> laptop.displayInch = Integer.parseInt(text);
					default 				-> throw new IllegalArgumentException("No such appliance exists");
				}
			}
		}
		
		return laptop;
	}	
}
