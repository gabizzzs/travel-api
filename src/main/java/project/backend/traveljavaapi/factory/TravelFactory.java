package project.backend.traveljavaapi.factory;

import project.backend.traveljavaapi.model.Travel;

public interface TravelFactory {
	
	Travel createTravel (String type);

}
