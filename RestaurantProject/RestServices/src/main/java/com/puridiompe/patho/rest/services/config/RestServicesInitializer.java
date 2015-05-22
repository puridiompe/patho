/**
 * 
 */
package com.puridiompe.patho.rest.services.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.puridiompe.patho.business.config.BusinessConfiguration;
import com.puridiompe.patho.dataaccess.config.DataAccessConfiguration;
import com.puridiompe.patho.repository.config.RepositoryConfiguration;
import com.puridiompe.patho.repository.persistence.config.PersistenceConfiguration;
import com.puridiompe.patho.rest.controller.config.RestServicesConfiguration;

/**
 * Initialize web application context considering custom configuration class
 * 
 * @author Puridiom-PE
 *
 */
public class RestServicesInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext context) throws ServletException {
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(RestServicesConfiguration.class,
				BusinessConfiguration.class, DataAccessConfiguration.class,
				RepositoryConfiguration.class, PersistenceConfiguration.class);
		ctx.setServletContext(context);

		ServletRegistration.Dynamic servlet = context.addServlet("dispatcher",
				new DispatcherServlet(ctx));

		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");

	}

}
