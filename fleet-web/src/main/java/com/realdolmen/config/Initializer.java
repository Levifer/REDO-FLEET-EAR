package com.realdolmen.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.*;
import java.util.EnumSet;

public class Initializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext)
			throws ServletException {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(ProductionConfig.class, ConsumeWsdlConfig.class);
		context.register(SecurityConfig.class);
		servletContext.addListener(new ContextLoaderListener(context));

		FilterRegistration.Dynamic filter = servletContext.addFilter(AbstractSecurityWebApplicationInitializer.DEFAULT_FILTER_NAME, new DelegatingFilterProxy());
		filter.addMappingForUrlPatterns(EnumSet.allOf(DispatcherType.class), true, "/*");

		ServletRegistration.Dynamic dispatcher = servletContext.addServlet(
				"dispatcher", new DispatcherServlet(context));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
		dispatcher.setInitParameter("throwExceptionIfNoHandlerFound","true");

		servletContext.addFilter("HttpMethodFilter", org.springframework.web.filter.HiddenHttpMethodFilter.class)
				.addMappingForUrlPatterns(null, false, "/*");
	}
}