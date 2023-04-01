package com.gofortrainings.newsportal.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ProjectTwo {
	@ValueMapValue
	private String title;
	
	
	@ValueMapValue
	private String desc1;
	

	@ValueMapValue
	private String desc2;
	
	@ValueMapValue
	private String desc3;

	public String getTitle() {
		return title;
	}

	public String getDesc1() {
		return desc1;
	}

	public String getDesc2() {
		return desc2;
	}

	public String getDesc3() {
		return desc3;
	}
		

}
