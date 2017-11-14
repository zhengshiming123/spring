package com.smart.myTest;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;
//import sun.plugin.com.Dispatcher;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by h on 2017/11/13.
 */
public class Applicationinit implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        ServletRegistration.Dynamic registration = null;
        servletContext.setAttribute("re", new DispatcherServlet());
        registration.setLoadOnStartup(1);
        registration.addMapping("*.html");

    }
}
