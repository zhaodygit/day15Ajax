package com.it.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {

	//初始化使用
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("ServletContext 初始了");
	}

	//销毁使用
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("ServletContext 销毁了");
	}

}
