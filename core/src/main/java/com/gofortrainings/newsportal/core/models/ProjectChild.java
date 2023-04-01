package com.gofortrainings.newsportal.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;

import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL )
public class ProjectChild {
	


	@ChildResource
	public List<ProjectTwo> thirdMultiField;
	
	public List<ProjectTwo> getThirdMultiField() {
		return thirdMultiField;
	}	
	
	

}
