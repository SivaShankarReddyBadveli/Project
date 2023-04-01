package com.gofortrainings.newsportal.core.models;
import javax.annotation.PostConstruct;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Required;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ArticalDetails {
	

	@ValueMapValue
	private String articalTitle;
	
	@ValueMapValue
	private String articaldesc;
	
	
	public String getText() {
		return articalTitle;
	}

	public String getArticaldesc() {
		return articaldesc;
	}

}


