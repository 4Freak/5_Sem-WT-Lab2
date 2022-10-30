package by.tc.task01.dao.creator.appCreators;

import java.awt.Color;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import by.tc.task01.dao.creator.ApplianceCreator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;

/**
 * 
 * Creator of a tabletPC appliance
 *
 */
public class TabletPCCreator implements ApplianceCreator{
	
	private static final String BATTERY_CAPACITY = "batteryCapacity";
	private static final String DISPLAY_INCHES = "displayInches";
	private static final String MEMORY_ROM= "memoryRom";
	private static final String FLASH_MEMORY_CAPACITY = "flashMemoryCapacity";
	private static final String COLOR = "color";	
	
	@Override
	public Appliance create(NodeList nodes) {
		TabletPC tabletPC = new TabletPC();
		
		for (int i = 0; i < nodes.getLength(); i++) {
			if (nodes.item(i).getNodeType() == Node.ELEMENT_NODE) {
				String text = nodes.item(i).getTextContent();
				switch(nodes.item(i).getNodeName()) {
					case BATTERY_CAPACITY 		-> tabletPC.batteryCapacity = Integer.parseInt(text);
					case DISPLAY_INCHES 		-> tabletPC.displayInches = Integer.parseInt(text);
					case MEMORY_ROM				-> tabletPC.memoryRom = Integer.parseInt(text);
					case FLASH_MEMORY_CAPACITY	-> tabletPC.flashMemoryCapacity = Integer.parseInt(text);
					case COLOR					-> {
	                        try {
	                            tabletPC.color = (Color) Color.class.getField(text).get(null);
	                        } catch (Exception e) {
	                            tabletPC = null;
	                            throw new IllegalArgumentException("Cannot hadle color");
	                        }
					}
					default 					-> throw new IllegalArgumentException("No such appliance exists");
				};
			}
		}
		
		return tabletPC;
	}

}
