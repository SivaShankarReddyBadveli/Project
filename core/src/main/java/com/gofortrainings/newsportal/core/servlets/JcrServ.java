package com.gofortrainings.newsportal.core.servlets;
import java.io.IOException;

import javax.jcr.Node;
import javax.jcr.Property;
import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.ModifiableValueMap;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = Servlet.class, immediate = true)
@SlingServletResourceTypes(resourceTypes = "newsportal/components/page", extensions = "txt", selectors = "1234")


public class JcrServ extends SlingSafeMethodsServlet{
	private static final Logger logger= LoggerFactory.getLogger(JcrServ.class);
	@Override
	protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
			throws ServletException, IOException {
		
		
		try {
			 
			
			ResourceResolver resolver = request.getResourceResolver();
			Resource refPath = 	resolver.getResource("/content/jcrse");
			Node infoNode = refPath.adaptTo(Node.class);
			infoNode.getProperties("name");				
			infoNode.setProperty("test1", "job1");
			
			ValueMap infoVM = refPath.getValueMap();
			infoVM.get("name", String.class);
		//	infoVM.put("terstname", "123");
			
			
			ModifiableValueMap map = refPath.adaptTo(ModifiableValueMap.class);
			map.put("modifyVM", "This is a modify VM");
			
			refPath.getResourceResolver().commit();
			response.getWriter().write("From node : " + infoNode.getProperties("name").toString() + "from sling : " +request.getServerPort());
			
		}
		 catch (Exception exc) {
			 logger.info("There is an error in NewsportalNodeRetrive : " + exc.getMessage()+"asd");
			}
		
	}
}
