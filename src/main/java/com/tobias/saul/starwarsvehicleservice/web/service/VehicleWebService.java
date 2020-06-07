package com.tobias.saul.starwarsvehicleservice.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.tobias.saul.starwarsvehicleservice.model.Vehicle;
import com.tobias.saul.starwarsvehicleservice.web.response.VehiclesResponse;
import com.tobias.saul.starwarsvehicleservice.web.utils.StarWarsVehicleUtils;

@RestController
@RequestMapping("/vehicles")
public class VehicleWebService {
	
	private final String BASE_URL = "https://swapi.dev/api/vehicles/";
	private final RestTemplate restTemplate;
	
	@Autowired
	public VehicleWebService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	@GetMapping
	public List<Vehicle> getAllVehicles() {
		ResponseEntity<VehiclesResponse> response = restTemplate.getForEntity(BASE_URL, VehiclesResponse.class);
		
		List<Vehicle> vehicles = StarWarsVehicleUtils.addVehiclesToList(restTemplate, response);
		
		return vehicles;
	}
	
	@GetMapping("/{vehicleId}")
	public Vehicle getStarWarsPerson(@PathVariable("vehicleId") Integer vehicleId) {		
		ResponseEntity<VehiclesResponse> response = restTemplate.getForEntity(BASE_URL, VehiclesResponse.class);
		
		List<Vehicle> vehicles = StarWarsVehicleUtils.addVehiclesToList(restTemplate, response);
		
		Vehicle vehicle = vehicles.get(vehicleId - 1);
		
		return vehicle;
	}
	
}
