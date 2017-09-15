package com.expedia.offring.service.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.expedia.offering.model.dao.config.modelConfig;
import com.expedia.offring.service.impl.OffringServiceImpl;

@Configuration
@ComponentScan(basePackageClasses = { OffringServiceImpl.class })
@Import({ modelConfig.class })
public class OffringServiceConfig {

}
