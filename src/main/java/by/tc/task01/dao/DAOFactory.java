package by.tc.task01.dao;

import by.tc.task01.dao.impl.ApplianceDAOImpl;


/**
 * 
 * ApplianceDAO's factory
 *
 */
public final class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();

	private final ApplianceDAO applianceDAO = new ApplianceDAOImpl();
	
	private DAOFactory() {}

	/**
	 * Get instance of DAO's appliance
	 * @return instance of DAO's appliance
	 */
	public ApplianceDAO getApplianceDAO() {
		return applianceDAO;
	}

	/**
	 * Get instance of DAO's factory
	 * @return instance of DAO's factory
	 */
	public static DAOFactory getInstance() {
		return instance;
	}
}
