package com.gofortrainings.newsportal.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
@Model(adaptables= Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Employee {
	@ValueMapValue
	private String mail;
	
	@ValueMapValue
	private String stname;
	
	@ValueMapValue
	private String dropDown;
	
	@ValueMapValue
	private String entertinment;
	
	@ValueMapValue
	private String crimes;

	public String getMail() {
		return mail;
	}

	public String getStname() {
		return stname;
	}

	public String getDropDown() {
		return dropDown;
	}

	public String getEntertinment() {
		return entertinment;
	}

	public String getCrimes() {
		return crimes;
	}
	

}
