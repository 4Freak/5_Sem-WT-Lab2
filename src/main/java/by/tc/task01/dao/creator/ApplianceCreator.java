package by.tc.task01.dao.creator;

import org.w3c.dom.NodeList;

import by.tc.task01.entity.Appliance;

/**
 * 
 * Interface of ApplianceCreatorFactory elements
 * 
 */
public interface ApplianceCreator {

	/**
	 * Create appliance
	 * @param appliance's list node
	 * @return a certain type of appliance
	 */
	Appliance create(NodeList nodes);
	
}
