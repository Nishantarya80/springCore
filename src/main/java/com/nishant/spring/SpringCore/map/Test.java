package com.nishant.spring.SpringCore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nishant/spring/SpringCore/map/mapconfig.xml");
		Coustmer bean = (Coustmer) ctx.getBean("Coustmer");
		System.out.println(bean);
	}

}
