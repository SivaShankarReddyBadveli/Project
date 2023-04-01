package com.gofortrainings.newsportal.core.models;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true, service = Ride.class)
public class Ride {		
		private static final Logger logger = LoggerFactory.getLogger(Ride.class);
		@Reference
		private Bike bikes;
		@Activate
		public void active() {
			logger.info("Bundles is activated from Ride....");
			logger.info("ride service" + bikes.fueltype("petrol"));

}
}