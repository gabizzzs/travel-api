package project.backend.traveljavaapi.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.backend.traveljavaapi.model.Travel;
import project.backend.traveljavaapi.service.TravelService;

@RestController
@RequestMapping("/api-travels/travels")
public class TravelController {

	private static final Logger logger = Logger.getLogger(TravelController.class);
	
	@Autowired
	private TravelService tripService;
	
	@GetMapping
	public ResponseEntity<List<Travel>> find() {
		if(tripService.find().isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		logger.info(tripService.find());
		return ResponseEntity.ok(tripService.find());
	}
	
	@DeleteMapping
	public ResponseEntity<Boolean> delete() {
		try {
			tripService.delete();
			return ResponseEntity.noContent().build();		
		} catch(Exception e) {
			logger.error(e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	
	}
	
}
