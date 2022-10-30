package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Class represent search criteria
 *
 */
public class Criteria {

	/**
	 * Search type
	 */
	private String groupSearchName;
	
	/**
	 * Search fields
	 */
	private Map<String, Object> criteria = new HashMap<String, Object>();

	/**
	 * Instantiates object of a type Criteria
	 * @param groupSearchName - search type
	 */
	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}
	
	/**
	 * Get search type
	 * @return search type
	 */
	public String getGroupSearchName() {
		return groupSearchName;
	}

	/**
	 * Add new search criteria
	 * @param searchCriteria - field to search
	 * @param value - search criteria's value
	 */
	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}
	
	/**
	 * Get search criteria
	 * @return search criteria
	 */
	public Map <String, Object> getSearchCriteria(){
		return criteria;
	}

}
