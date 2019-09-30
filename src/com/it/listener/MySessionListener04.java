package com.it.listener;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

public class MySessionListener04 implements HttpSessionActivationListener {

	@Override
	public void sessionWillPassivate(HttpSessionEvent se) {
		System.out.println("session被钝化了");
		
	}

	@Override
	public void sessionDidActivate(HttpSessionEvent se) {
		System.out.println("session被活化了");
	}

}
