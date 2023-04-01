package com.gofortrainings.newsportal.core.models;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Component(immediate = true, service = TaskService.class)
@Designate(ocd = TestConfig.class)
public class TaskService {
private static final Logger logger = LoggerFactory.getLogger(TaskService.class);	
	//@Reference
	//Bike bike;
	TestConfig testConfig;
	private String name;
	private String city;
	@Activate
	public void active(TestConfig testConfig ) {
		this.testConfig=testConfig;
		logger.info("config value : " +testConfig.programe()+ testConfig.task());
		name=testConfig.task();
		city=testConfig.programe();
}
	public String task() {
		return name;
	}
	public String programe() {
		return city;
	}
}