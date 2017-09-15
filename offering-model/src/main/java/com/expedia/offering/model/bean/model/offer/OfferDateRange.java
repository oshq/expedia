package com.expedia.offering.model.bean.model.offer;

import java.util.List;

public class OfferDateRange {

	private List<Integer> travelEndDate;
	private List<Integer> travelStartDate;
	private Integer lengthOfStay;

	public List<Integer> getTravelStartDate() {
		return travelStartDate;
	}

	public void setTravelStartDate(List<Integer> travelStartDate) {
		this.travelStartDate = travelStartDate;
	}

	public List<Integer> getTravelEndDate() {
		return travelEndDate;
	}

	public void setTravelEndDate(List<Integer> travelEndDate) {
		this.travelEndDate = travelEndDate;
	}

	public Integer getLengthOfStay() {
		return lengthOfStay;
	}

	public void setLengthOfStay(Integer lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}
}
