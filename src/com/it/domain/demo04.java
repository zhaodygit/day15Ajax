package com.it.domain;

import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

public class demo04 implements HttpSessionActivationListener, Serializable{

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void sessionWillPassivate(HttpSessionEvent se) {
		System.out.println("session的值被钝化了");
		
	}

	@Override
	public void sessionDidActivate(HttpSessionEvent se) {
		System.out.println("session的值被活化了");
	}

}
