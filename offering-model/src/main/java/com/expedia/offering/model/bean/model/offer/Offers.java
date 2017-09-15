package com.expedia.offering.model.bean.model.offer;

import java.util.List;

import com.expedia.offering.model.bean.model.offer.flight.Flight;
import com.expedia.offering.model.bean.model.offer.hotel.Hotel;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Offers {

	private List<Flight> flights;
	private List<Package> packages;
	private List<Hotel> hotels;

	@JsonProperty("Flight")
	public List<Flight> getflights() {
		return flights;
	}

	@JsonProperty("Flight")
	public void setflights(List<Flight> flights) {
		this.flights = flights;
	}

	@JsonProperty("Hotel")
	public List<Hotel> gethotels() {
		return hotels;
	}

	@JsonProperty("Hotel")
	public void sethotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}

	@JsonProperty("Package")
	public List<Package> getpackages() {
		return packages;
	}

	@JsonProperty("Package")
	public void setpackages(List<Package> packages) {
		this.packages = packages;
	}
}
