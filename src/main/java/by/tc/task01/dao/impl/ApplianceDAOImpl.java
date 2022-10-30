package by.tc.task01.dao.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.creator.ApplianceCreator;
import by.tc.task01.dao.creator.ApplianceCreatorFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

/**
 * Implementation of DAO's appliance that reads information from file in resource folder
 *
 */
public class ApplianceDAOImpl implements ApplianceDAO{

	private static final String APPLIANCES_RES = ".\\src\\main\\resources\\appliances_db.xml";//".src\\main\\resources\\appliances_db.xml";	
	/**
	 * {@inheritDoc}
	 * Assumes that file has correct format
	 */
	@Override
	public List<Appliance> find(Criteria criteria) {
		List<Appliance> appls = new ArrayList<>();
		try {
			
			// Open xml file
			DocumentBuilder  docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			File file = new File(APPLIANCES_RES);
			Document doc = docBuilder.parse(file);
			
			Node root = doc.getDocumentElement();
			NodeList nodes = root.getChildNodes();
			for (int i = 0; i < nodes.getLength(); i++) {
				Node node = nodes.item(i);
				
				if (node.getNodeType() == Node.ELEMENT_NODE){
					if (node.getNodeName().equalsIgnoreCase(criteria.getGroupSearchName())){ 
						ApplianceCreator appCreator = ApplianceCreatorFactory.getInstance().getCreator(node.getNodeName());
						Appliance app = appCreator.create(node.getChildNodes());
						
						Map<String, Object> criterias = criteria.getSearchCriteria();
						boolean isValid = true;
						
						for (Map.Entry<String, Object> entry : criterias.entrySet()) {
							String key = entry.getKey();
							Object value = entry.getValue();
							
							if (!app.isMatch(key, value)) {
								isValid = false;
								break;
							}
						}
						
						if (isValid){
							appls.add(app);
						}
					}
				}
			}
			
		}
		catch (Exception e) {
			return null;
		}
		if (appls.size() != 0) {
			return appls;
		}else {
			return null;
		}
	}
	
	// you may add your own code here

}


//you may add your own new classes