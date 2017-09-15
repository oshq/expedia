package com.expedia.offering.model.dao.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.expedia.offering.model.dao.impl.OffersDaoRESTImpl;

@Configuration
@ComponentScan(basePackageClasses = { OffersDaoRESTImpl.class })
public class modelConfig {

}
