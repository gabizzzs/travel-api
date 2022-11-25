package project.backend.traveljavaapi.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.backend.traveljavaapi.model.Statistic;
import project.backend.traveljavaapi.model.Travel;
import project.backend.traveljavaapi.service.StatisticService;
import project.backend.traveljavaapi.service.TravelService;

@RestController
@RequestMapping("/api-travels/statistics")
public class StatisticController {

	private static final Logger logger = Logger.getLogger(StatisticController.class);
	
	@Autowired
	private TravelService tripsService;
	
	@Autowired
	private StatisticService statisticService;
	
	@Autowired
	private Statistic statistics;
	
	@GetMapping(produces = { "application/json" })
	public ResponseEntity<Statistic> getStatistics() {
		List<Travel> trips = tripsService.create(trips);
		
		logger.info(statistics);
		
		return ResponseEntity.ok(statistics);
	}
	
	
}
