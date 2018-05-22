package com.example.demo.config;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 实现自定义的servlet监听器
 * 可以定义项目的根目录
 * @author Administrator
 *
 */
@WebListener
public class MyListenerConfig implements ServletContextListener{
	
	public static String WEB_CONTEXT_PATH="";

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		WEB_CONTEXT_PATH = arg0.getServletContext().getRealPath("/");
	}
	
}
