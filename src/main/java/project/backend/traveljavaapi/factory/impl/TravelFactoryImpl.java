package project.backend.traveljavaapi.factory.impl;

import project.backend.traveljavaapi.enumeration.TravelTypeEnum;
import project.backend.traveljavaapi.model.Travel;

public class TravelFactoryImpl {
	
	@Override
	public Travel createTravel (String type) {
		if(TravelTypeEnum.ONE_WAY.getValue().equals(type)) {
			return new Travel(TravelTypeEnum.ONE_WAY);
		}
		else if(TravelTypeEnum.MULTI_CITY.getValue().equals(type)) {
			return new Travel(TravelTypeEnum.MULTI_CITY);
		}
		
		return new Travel(TravelTypeEnum.RETURN);
	}

}
