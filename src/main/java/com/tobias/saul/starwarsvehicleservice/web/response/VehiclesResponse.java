package com.tobias.saul.starwarsvehicleservice.web.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tobias.saul.starwarsvehicleservice.model.Vehicle;

public class VehiclesResponse {
	
	private String next;
	@JsonProperty(value = "results")
	private List<Vehicle> vehicles;
	
	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}
	public List<Vehicle> getVehicles() {
		return vehicles;
	}
	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((next == null) ? 0 : next.hashCode());
		result = prime * result + ((vehicles == null) ? 0 : vehicles.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VehiclesResponse other = (VehiclesResponse) obj;
		if (next == null) {
			if (other.next != null)
				return false;
		} else if (!next.equals(other.next))
			return false;
		if (vehicles == null) {
			if (other.vehicles != null)
				return false;
		} else if (!vehicles.equals(other.vehicles))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "VehiclesResponse [next=" + next + ", vehicles=" + vehicles + "]";
	}
	
	

}
