package com.expedia.offering.model.bean.model.offer.packages;

/**
 * 
 * @author oqaoud
 *
 */
public class PackagePricingInfo {

	private String currencyCode;
	private Double totalPackagePrice;
	private Double percentSavings;
	private Double perPsgrSavings;
	private Double savingsPctOfFlight;
	private Double perPsgrPackagePrice;
	private Double totalSavings;
	private Double savingsPctOfHotel;

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public Double getTotalPackagePrice() {
		return totalPackagePrice;
	}

	public void setTotalPackagePrice(Double totalPackagePrice) {
		this.totalPackagePrice = totalPackagePrice;
	}

	public Double getPercentSavings() {
		return percentSavings;
	}

	public void setPercentSavings(Double percentSavings) {
		this.percentSavings = percentSavings;
	}

	public Double getPerPsgrSavings() {
		return perPsgrSavings;
	}

	public void setPerPsgrSavings(Double perPsgrSavings) {
		this.perPsgrSavings = perPsgrSavings;
	}

	public Double getSavingsPctOfFlight() {
		return savingsPctOfFlight;
	}

	public void setSavingsPctOfFlight(Double savingsPctOfFlight) {
		this.savingsPctOfFlight = savingsPctOfFlight;
	}

	public Double getPerPsgrPackagePrice() {
		return perPsgrPackagePrice;
	}

	public void setPerPsgrPackagePrice(Double perPsgrPackagePrice) {
		this.perPsgrPackagePrice = perPsgrPackagePrice;
	}

	public Double getTotalSavings() {
		return totalSavings;
	}

	public void setTotalSavings(Double totalSavings) {
		this.totalSavings = totalSavings;
	}

	public Double getSavingsPctOfHotel() {
		return savingsPctOfHotel;
	}

	public void setSavingsPctOfHotel(Double savingsPctOfHotel) {
		this.savingsPctOfHotel = savingsPctOfHotel;
	}
}