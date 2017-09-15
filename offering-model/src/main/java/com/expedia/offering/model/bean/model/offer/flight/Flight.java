package com.expedia.offering.model.bean.model.offer.flight;

import com.expedia.offering.model.bean.model.offer.Destination;
import com.expedia.offering.model.bean.model.offer.OfferDateRange;

public class Flight {

	private FlightInfo flightInfo;
	private FlightPricingInfo flightPricingInfo;
	private FlightUrls flightUrls;
	private FlightScores flightScores;
	private OfferDateRange offerDateRange;
	private Destination destination;
	private Origin origin;

	public FlightInfo getFlightInfo() {
		return flightInfo;
	}

	public OfferDateRange getOfferDateRange() {
		return offerDateRange;
	}

	public void setOfferDateRange(OfferDateRange offerDateRange) {
		this.offerDateRange = offerDateRange;
	}

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	public void setFlightInfo(FlightInfo flightInfo) {
		this.flightInfo = flightInfo;
	}

	public FlightPricingInfo getFlightPricingInfo() {
		return flightPricingInfo;
	}

	public void setFlightPricingInfo(FlightPricingInfo flightPricingInfo) {
		this.flightPricingInfo = flightPricingInfo;
	}

	public FlightUrls getFlightUrls() {
		return flightUrls;
	}

	public void setFlightUrls(FlightUrls flightUrls) {
		this.flightUrls = flightUrls;
	}

	public FlightScores getFlightScores() {
		return flightScores;
	}

	public void setFlightScores(FlightScores flightScores) {
		this.flightScores = flightScores;
	}

	public Origin getOrigin() {
		return origin;
	}

	public void setOrigin(Origin origin) {
		this.origin = origin;
	}
}
