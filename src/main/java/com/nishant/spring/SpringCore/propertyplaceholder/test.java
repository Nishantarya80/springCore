package com.nishant.spring.SpringCore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/nishant/spring/SpringCore/propertyplaceholder/config.xml");

		myDAO bean = (myDAO) ctx.getBean("myDAO");
		System.out.println(bean);
	}
}
