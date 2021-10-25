package com.nishant.spring.SpringCore.constructorinjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nishant/spring/SpringCore/constructorinjection/ambiguity/config.xml");
		Addition bean = (Addition) ctx.getBean("addition");
		System.out.println(bean);
	}
}
