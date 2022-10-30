package by.tc.task01.main;

import java.util.List;

import by.tc.task01.entity.Appliance;

/**
 * 
 * Class to print appliances information
 * 
 */
public class PrintApplianceInfo {
	
	/**
	 * Print appliances information
	 * @param appliances - list of appliances
	 */
	public static void print(List<Appliance> appliances) {
		
		if (appliances == null) {
			System.out.println("Can not find result with this parameters");
			return;
		}
		
		for (Appliance appl : appliances) {
			print(appl);
		}
	}
	
	/**
	 * Print appliance information
	 * @param appliance - appliance
	 */
	public static void print(Appliance appliance) {
		
		System.out.println(appliance.toString());
	}
}
