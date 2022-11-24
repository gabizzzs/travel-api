package project.backend.traveljavaapi.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import project.backend.traveljavaapi.model.Travel;

@Service
public class StatisticService {
	
	private TravelFactory factory;
	private List<Travel> travels;
	
	public void createTravelFactory() {
		if(factory == null) {
			factory = new TravelFactoryImpl();
		}
	}
	
	public void createTravelList() {
		if(travels == null) {
			travels = new ArrayList<>();
		}
	}
	
	public boolean isJSONValid(String JsonInString) {
		try {
			return new ObjectMapper().readTree(jsonInString) != null;
		} catch (IOException e) {
			return false;
		}
	}
	
	private long parseId(JSONObject travel) {
		return Long.valueOf((int) travel.get("id"));
	}
	
	

}
