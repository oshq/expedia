package com.expedia.offring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expedia.offering.model.dao.OffersDao;
import com.expedia.offering.model.dao.dto.OfferingData;
import com.expedia.offering.model.dao.dto.OfferingRequest;
import com.expedia.offring.service.OffringService;

@Service
public class OffringServiceImpl implements OffringService {
	@Autowired
	OffersDao offersDao;

	public OfferingData getOfferingData(OfferingRequest request) {
		return offersDao.findOffers(request);
	}

}
