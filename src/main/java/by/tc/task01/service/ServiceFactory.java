package by.tc.task01.service;

import by.tc.task01.service.impl.ApplianceServiceImpl;

/**
 * 
 * Factory of appliance service
 * 
 */
public final class ServiceFactory {
	private static final ServiceFactory instance = new ServiceFactory();

	private final ApplianceService applianceService = new ApplianceServiceImpl();
	
	private ServiceFactory() {}

	/**
	 * Get appliance service
	 * @return appliance service
	 */
	public ApplianceService getApplianceService() {

		return applianceService;
	}

	/**
	 * Get the instance of the factory
	 * @return instance of the factory
	 */
	public static ServiceFactory getInstance() {
		return instance;
	}

}
