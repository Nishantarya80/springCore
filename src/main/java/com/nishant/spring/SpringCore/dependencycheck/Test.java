package com.nishant.spring.SpringCore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nishant/spring/SpringCore/dependencycheck/config.xml");
		Prescription bean = (Prescription) ctx.getBean("Prescription");
		System.out.println(bean);
		}
	

}
