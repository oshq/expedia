package com.expedia.offering.model.dao.dto;

import com.expedia.offering.model.bean.model.offer.OfferInfo;
import com.expedia.offering.model.bean.model.offer.Offers;
import com.expedia.offering.model.bean.model.user.UserInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Bean contains offering info
 * 
 * @author oqaoud
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OfferingData {

	private OfferInfo offerInfo;
	private UserInfo userInfo;
	private Offers offers;

	public OfferInfo getOfferInfo() {
		return offerInfo;
	}

	public void setOfferInfo(OfferInfo offerInfo) {
		this.offerInfo = offerInfo;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public Offers getOffers() {
		return offers;
	}

	public void setOffers(Offers offers) {
		this.offers = offers;
	}
}
