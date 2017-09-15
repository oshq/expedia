package com.expedia.offering.model.bean.model.offer.packages;

public class PackageUrls {

	private FlightDeeplinks flightDeeplinks;
	private String packageSearchUrl;
	private HotelDeeplinks hotelDeeplinks;

	public String getPackageSearchUrl() {
		return packageSearchUrl;
	}

	public void setPackageSearchUrl(String packageSearchUrl) {
		this.packageSearchUrl = packageSearchUrl;
	}

	public FlightDeeplinks getFlightDeeplinks() {
		return flightDeeplinks;
	}

	public void setFlightDeeplinks(FlightDeeplinks flightDeeplinks) {
		this.flightDeeplinks = flightDeeplinks;
	}

	public HotelDeeplinks getHotelDeeplinks() {
		return hotelDeeplinks;
	}

	public void setHotelDeeplinks(HotelDeeplinks hotelDeeplinks) {
		this.hotelDeeplinks = hotelDeeplinks;
	}


	
}
