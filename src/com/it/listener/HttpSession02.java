package com.it.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class HttpSession02 implements HttpSessionAttributeListener {

	@Override
	public void attributeAdded(HttpSessionBindingEvent se) {
		System.out.println("属性被添加了");

	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent se) {
		System.out.println("属性被移除了");

	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent se) {
		System.out.println("属性被替换了");

	}

}
