package com.expedia.offering.model.bean.model.offer.packages;

import com.expedia.offering.model.bean.model.offer.flight.FlightInfo;
import com.expedia.offering.model.bean.model.offer.flight.FlightPricingInfo;
import com.expedia.offering.model.bean.model.offer.flight.Origin;
import com.expedia.offering.model.bean.model.offer.hotel.HotelInfo;
import com.expedia.offering.model.bean.model.offer.hotel.HotelPricingInfo;
import com.expedia.offering.model.bean.model.offer.hotel.HotelUrgencyInfo;

public class Package {

	private HotelInfo hotelInfo;
	private HotelPricingInfo hotelPricingInfo;
	private FlightInfo flightInfo;
	private FlightPricingInfo flightPricingInfo;
	private PackageInfo packageInfo;
	private PackagePricingInfo packagePricingInfo;
	private PackageUrls packageUrls;
	private Origin origin;
	private HotelUrgencyInfo hotelUrgencyInfo;

	public HotelInfo getHotelInfo() {
		return hotelInfo;
	}

	public void setHotelInfo(HotelInfo hotelInfo) {
		this.hotelInfo = hotelInfo;
	}

	public HotelPricingInfo getHotelPricingInfo() {
		return hotelPricingInfo;
	}

	public void setHotelPricingInfo(HotelPricingInfo hotelPricingInfo) {
		this.hotelPricingInfo = hotelPricingInfo;
	}

	public FlightInfo getFlightInfo() {
		return flightInfo;
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

	public PackageInfo getPackageInfo() {
		return packageInfo;
	}

	public void setPackageInfo(PackageInfo packageInfo) {
		this.packageInfo = packageInfo;
	}

	public PackagePricingInfo getPackagePricingInfo() {
		return packagePricingInfo;
	}

	public void setPackagePricingInfo(PackagePricingInfo packagePricingInfo) {
		this.packagePricingInfo = packagePricingInfo;
	}

	public PackageUrls getPackageUrls() {
		return packageUrls;
	}

	public void setPackageUrls(PackageUrls packageUrls) {
		this.packageUrls = packageUrls;
	}

	public Origin getOrigin() {
		return origin;
	}

	public void setOrigin(Origin origin) {
		this.origin = origin;
	}

	public HotelUrgencyInfo getHotelUrgencyInfo() {
		return hotelUrgencyInfo;
	}

	public void setHotelUrgencyInfo(HotelUrgencyInfo hotelUrgencyInfo) {
		this.hotelUrgencyInfo = hotelUrgencyInfo;
	}
}
