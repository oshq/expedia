package com.expedia.offering.model.bean.model.offer.hotel;

import java.util.List;

public class HotelUrgencyInfo {

	private String link;
	private Long numberOfPeopleViewing;
	private Long numberOfPeopleBooked;
	private List<String> almostSoldOutRoomTypeInfoCollection;
	private Long lastBookedTime;
	private String almostSoldStatus;
	private Long airAttachRemainingTime;
	private Long numberOfRoomsLeft;
	private Boolean airAttachEnabled;

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Long getNumberOfPeopleViewing() {
		return numberOfPeopleViewing;
	}

	public void setNumberOfPeopleViewing(Long numberOfPeopleViewing) {
		this.numberOfPeopleViewing = numberOfPeopleViewing;
	}

	public Long getNumberOfPeopleBooked() {
		return numberOfPeopleBooked;
	}

	public void setNumberOfPeopleBooked(Long numberOfPeopleBooked) {
		this.numberOfPeopleBooked = numberOfPeopleBooked;
	}

	public List<String> getAlmostSoldOutRoomTypeInfoCollection() {
		return almostSoldOutRoomTypeInfoCollection;
	}

	public void setAlmostSoldOutRoomTypeInfoCollection(List<String> almostSoldOutRoomTypeInfoCollection) {
		this.almostSoldOutRoomTypeInfoCollection = almostSoldOutRoomTypeInfoCollection;
	}

	public Long getLastBookedTime() {
		return lastBookedTime;
	}

	public void setLastBookedTime(Long lastBookedTime) {
		this.lastBookedTime = lastBookedTime;
	}

	public String getAlmostSoldStatus() {
		return almostSoldStatus;
	}

	public void setAlmostSoldStatus(String almostSoldStatus) {
		this.almostSoldStatus = almostSoldStatus;
	}

	public Long getAirAttachRemainingTime() {
		return airAttachRemainingTime;
	}

	public void setAirAttachRemainingTime(Long airAttachRemainingTime) {
		this.airAttachRemainingTime = airAttachRemainingTime;
	}

	public Long getNumberOfRoomsLeft() {
		return numberOfRoomsLeft;
	}

	public void setNumberOfRoomsLeft(Long numberOfRoomsLeft) {
		this.numberOfRoomsLeft = numberOfRoomsLeft;
	}

	public Boolean getAirAttachEnabled() {
		return airAttachEnabled;
	}

	public void setAirAttachEnabled(Boolean airAttachEnabled) {
		this.airAttachEnabled = airAttachEnabled;
	}

}
