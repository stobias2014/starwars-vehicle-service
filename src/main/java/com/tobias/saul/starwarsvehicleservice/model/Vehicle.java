package com.tobias.saul.starwarsvehicleservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Vehicle {
	
	private String name;
	private String model;
	private String manufacturer;
	@JsonProperty(value = "cost_in_credits")
	private String costInCredits;
	private String length;
	@JsonProperty(value = "max_atmosphering_speed")
	private String maxAtmosphereSpeed;
	private String crew;
	private String passengers;
	@JsonProperty("cargo_capacity")
	private String cargoCapacity;
	private String consumables;
	@JsonProperty("vehicle_class")
	private String vehicleClass;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getCostInCredits() {
		return costInCredits;
	}
	public void setCostInCredits(String costInCredits) {
		this.costInCredits = costInCredits;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getMaxAtmosphereSpeed() {
		return maxAtmosphereSpeed;
	}
	public void setMaxAtmosphereSpeed(String maxAtmosphereSpeed) {
		this.maxAtmosphereSpeed = maxAtmosphereSpeed;
	}
	public String getCrew() {
		return crew;
	}
	public void setCrew(String crew) {
		this.crew = crew;
	}
	public String getPassengers() {
		return passengers;
	}
	public void setPassengers(String passengers) {
		this.passengers = passengers;
	}
	public String getCargoCapacity() {
		return cargoCapacity;
	}
	public void setCargoCapacity(String cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}
	public String getConsumables() {
		return consumables;
	}
	public void setConsumables(String consumables) {
		this.consumables = consumables;
	}
	public String getVehicleClass() {
		return vehicleClass;
	}
	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cargoCapacity == null) ? 0 : cargoCapacity.hashCode());
		result = prime * result + ((consumables == null) ? 0 : consumables.hashCode());
		result = prime * result + ((costInCredits == null) ? 0 : costInCredits.hashCode());
		result = prime * result + ((crew == null) ? 0 : crew.hashCode());
		result = prime * result + ((length == null) ? 0 : length.hashCode());
		result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
		result = prime * result + ((maxAtmosphereSpeed == null) ? 0 : maxAtmosphereSpeed.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((passengers == null) ? 0 : passengers.hashCode());
		result = prime * result + ((vehicleClass == null) ? 0 : vehicleClass.hashCode());
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
		Vehicle other = (Vehicle) obj;
		if (cargoCapacity == null) {
			if (other.cargoCapacity != null)
				return false;
		} else if (!cargoCapacity.equals(other.cargoCapacity))
			return false;
		if (consumables == null) {
			if (other.consumables != null)
				return false;
		} else if (!consumables.equals(other.consumables))
			return false;
		if (costInCredits == null) {
			if (other.costInCredits != null)
				return false;
		} else if (!costInCredits.equals(other.costInCredits))
			return false;
		if (crew == null) {
			if (other.crew != null)
				return false;
		} else if (!crew.equals(other.crew))
			return false;
		if (length == null) {
			if (other.length != null)
				return false;
		} else if (!length.equals(other.length))
			return false;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (maxAtmosphereSpeed == null) {
			if (other.maxAtmosphereSpeed != null)
				return false;
		} else if (!maxAtmosphereSpeed.equals(other.maxAtmosphereSpeed))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (passengers == null) {
			if (other.passengers != null)
				return false;
		} else if (!passengers.equals(other.passengers))
			return false;
		if (vehicleClass == null) {
			if (other.vehicleClass != null)
				return false;
		} else if (!vehicleClass.equals(other.vehicleClass))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", model=" + model + ", manufacturer=" + manufacturer + ", costInCredits="
				+ costInCredits + ", length=" + length + ", maxAtmosphereSpeed=" + maxAtmosphereSpeed + ", crew=" + crew
				+ ", passengers=" + passengers + ", cargoCapacity=" + cargoCapacity + ", consumables=" + consumables
				+ ", vehicleClass=" + vehicleClass + "]";
	}
	
	

}
