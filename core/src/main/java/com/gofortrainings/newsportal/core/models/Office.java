package com.gofortrainings.newsportal.core.models;

import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables= Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class Office {
	final static Logger logger=LoggerFactory.getLogger(Office.class);
	@ChildResource
	public List<Employee> fieldname;
	
	@OSGiService
	private TaskService taskService;
	
	private String message;
	private String message1;
	
	
	public List<Employee> getFieldname() {
		return fieldname;
	}

	
	
public String getMessage() {
	return message;
	
}

public String getMessage1() {
	return message1;
}

@PostConstruct
public void init() {
	message=taskService.task();
	message1=taskService.programe();
	
}


}
 
