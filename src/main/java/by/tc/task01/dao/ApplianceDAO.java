package by.tc.task01.dao;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import java.util.List;

/**
 * 
 * DAO's class interface
 *
 */
public interface ApplianceDAO {

	/**
	 * 
	 * Look for appliances that match given criteria
	 *
	 */
	List<Appliance> find(Criteria criteria);
}
