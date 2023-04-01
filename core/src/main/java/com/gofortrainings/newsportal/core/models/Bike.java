package com.gofortrainings.newsportal.core.models;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Component(immediate = true,service = Bike.class)
public class Bike {
	private static final Logger logger = LoggerFactory.getLogger(Bike.class);

	@Activate
	public void active() {
		logger.info("Newsportal Bundles is activated....");
	}

	@Modified
	public void modify() {
		logger.info("Newsportal Bundles is modified....");
	}
	
	@Deactivate
	public void deActivate() {
		logger.info("Newsportal Bundles is deactivated....");
	}
	public String fueltype(String fuel) {
		logger.info("Bike runs with  " + fuel);
		return "Bike runs with  " + fuel;
	}

}
