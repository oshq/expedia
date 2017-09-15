package com.expedia.offering.model.dao.dto;

/**
 * Bean that contains the search params
 * 
 * @author oqaoud
 *
 */
public class OfferingRequest {
	String destinationName;
	String minTripStartDate;
	String lengthOfStay;
	String scenario = "deal-finder";
	Integer page = 1;
	String uid = "foo";
	String productType = "Hotel";

	public String getDestinationName() {
		return destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public String getMinTripStartDate() {
		return minTripStartDate;
	}

	public void setMinTripStartDate(String minTripStartDate) {
		this.minTripStartDate = minTripStartDate;
	}

	public String getLengthOfStay() {
		return lengthOfStay;
	}

	public void setLengthOfStay(String lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}

	public String getScenario() {
		return scenario;
	}

	public void setScenario(String scenario) {
		this.scenario = scenario;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

}
