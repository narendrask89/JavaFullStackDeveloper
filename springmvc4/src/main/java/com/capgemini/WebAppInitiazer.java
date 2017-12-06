package com.capgemini;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.capgemini.config.WebConfig;

public class WebAppInitiazer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		WebApplicationContext context = getContext();
		
		servletContext.addListener(new ContextLoaderListener(context));
		
		ServletRegistration.Dynamic dispatcherServlet = servletContext.addServlet("DispatcherServlet",
				new DispatcherServlet(context));
		dispatcherServlet.setLoadOnStartup(1);
		dispatcherServlet.addMapping("/");
	}

	private AnnotationConfigWebApplicationContext getContext() {
		AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
		applicationContext.register(WebConfig.class);
		return applicationContext;
	}

}
