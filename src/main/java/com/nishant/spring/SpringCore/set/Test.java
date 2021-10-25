package com.nishant.spring.SpringCore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nishant/spring/SpringCore/set/Setconfig.xml");
		Car bean = (Car)ctx.getBean("Car");
		System.out.println("Name " +bean.getName());
		System.out.println("Set " +bean.getModels());
		System.out.println("Set " +bean.getModels().getClass());
	}

}
