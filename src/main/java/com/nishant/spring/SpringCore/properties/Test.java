package com.nishant.spring.SpringCore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/nishant/spring/SpringCore/properties/config.xml");
		Languages bean = (Languages) ctx.getBean("Languages");
		System.out.println(bean);
	}

}
