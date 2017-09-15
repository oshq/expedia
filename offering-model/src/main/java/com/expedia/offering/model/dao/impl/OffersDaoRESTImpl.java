package com.expedia.offering.model.dao.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.expedia.offering.model.dao.dto.OfferingRequest;
import com.expedia.offering.model.dao.dto.OfferingData;

/**
 * DAO to get the offers data from the expedia servers using rest api
 * 
 * @author oqaoud
 *
 */
@Repository
public class OffersDaoRESTImpl {
	// private final static String OFFERS_URL =
	// "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel";
	private RestTemplate restTemplate = new RestTemplate();

	public OfferingData findOffers(OfferingRequest offerParameters) {

		ResponseEntity<OfferingData> responseEntity = restTemplate
				.getForEntity("https://offersvc.expedia.com/offers/v2/getOffers", OfferingData.class, offerParameters);

		if (responseEntity.getStatusCode() == HttpStatus.OK) {
			OfferingData response = responseEntity.getBody();
			return (response);
		}
		return null;
	}

}
