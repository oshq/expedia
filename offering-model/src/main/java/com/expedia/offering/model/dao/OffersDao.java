package com.expedia.offering.model.dao;

import com.expedia.offering.model.dao.dto.OfferingRequest;
import com.expedia.offering.model.dao.dto.OfferingData;

public interface OffersDao {
	/**
	 * 
	 * @param offerParameters
	 * @returns The offering data based on the filters in
	 *          {@link OfferingRequest}
	 */
	public OfferingData findOffers(OfferingRequest offerParameters);

}
