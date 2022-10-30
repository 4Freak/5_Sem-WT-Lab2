package by.tc.task01.dao.creator.appCreators;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import by.tc.task01.dao.creator.ApplianceCreator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;

/**
 * 
 * Creator of a speakers appliance
 *
 */
public class SpeakersCreator implements ApplianceCreator{

	private static final String POWER_CONSUMPTION = "powerConsumtion";
	private static final String NUMBER_OF_SPEKERS = "numberOfSpeakers";
	private static final String FREQUENCY_RANGE = "frequencyRange";
	private static final String CORD_LENGTH = "cordLength";
	
	 /**
     * {@inheritDoc}
     */
	@Override
	public Appliance create(NodeList nodes) {
		Speakers speakers = new Speakers();
		
		for (int i = 0; i < nodes.getLength(); i++) {
			if (nodes.item(i).getNodeType() == Node.ELEMENT_NODE) {
				String text = nodes.item(i).getTextContent();
				switch(nodes.item(i).getNodeName()) {
					case POWER_CONSUMPTION 	-> speakers.powerConsumtion = Integer.parseInt(text);
					case NUMBER_OF_SPEKERS 	-> speakers.numberOfSpeakers = Integer.parseInt(text);
					case FREQUENCY_RANGE	-> speakers.frequencyRange = text;
					case CORD_LENGTH		-> speakers.cordLength = Integer.parseInt(text);
					default 				-> throw new IllegalArgumentException("No such appliance exists");
				};
			}
		}
		
		return speakers;
	}


}
