package by.tc.task01.dao.creator;

import java.util.HashMap;
import java.util.Map;

import by.tc.task01.dao.creator.appCreators.*;

/**
 * 
 * Appliance creator's factory
 *
 */
public class ApplianceCreatorFactory {
	
	private static final ApplianceCreatorFactory instance = new ApplianceCreatorFactory();
	

    private Map<String, ApplianceCreator> appCreators = new HashMap<>();
	
	private ApplianceCreatorFactory() {
		appCreators.put("laptop", new LaptorCreator());
		appCreators.put("oven", new OvenCreator());
		appCreators.put("refrigerator", new RefrigeratorCreator());
		appCreators.put("speakers", new SpeakersCreator());
		appCreators.put("tablePC", new TabletPCCreator());
		appCreators.put("vacuumCleaner", new VacuumCleanerCreator());
	}
	
	/**
	 * Get Appliance creator factory's instance
	 * @return Appliance creator factory's instance
	 */
	public static ApplianceCreatorFactory getInstance() {
		return instance;
	}

	/**
	 * Get creator according it's name
	 * @param applianceName - name of appliance
	 * @return appliance creator
	 */
	public ApplianceCreator getCreator(String applianceName) {
		return appCreators.get(applianceName);
	}
}
