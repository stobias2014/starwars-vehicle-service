package com.tobias.saul.starwarsvehicleservice.web.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.tobias.saul.starwarsvehicleservice.model.Vehicle;
import com.tobias.saul.starwarsvehicleservice.web.response.VehiclesResponse;

public class StarWarsVehicleUtils {

	public static String formatUrlToContainHttps(String url) {
		StringBuilder str = new StringBuilder(url);
		str.insert(4, 's');
		return str.toString();
	}

	public static List<Vehicle> addVehiclesToList(RestTemplate restTemplate,
			ResponseEntity<VehiclesResponse> vehiclesResponse) {

		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.addAll(vehiclesResponse.getBody().getVehicles());

		while (vehiclesResponse.getBody().getNext() != null) {
			if (vehiclesResponse.getBody().getNext() == null) {
				continue;
			} else {
				String urlFormattedToHttps = StarWarsVehicleUtils
						.formatUrlToContainHttps(vehiclesResponse.getBody().getNext());
				vehiclesResponse = restTemplate.getForEntity(urlFormattedToHttps, VehiclesResponse.class);
				vehicles.addAll(vehiclesResponse.getBody().getVehicles());
			}
		}

		return vehicles;
	}

}
