package by.tc.task01.service;

import java.util.List;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

/**
 * 
 * Appliance's service interface
 * 
 */
public interface ApplianceService {	
	
	/**
	 * Find all appliances that match given criteria
	 * @param criteria - criteria to match with
	 * @return appliances array that match criteria if it exist, otherwise - null
	 */
	List<Appliance> find(Criteria criteria);
	
}
