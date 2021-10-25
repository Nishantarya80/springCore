package com.nishant.spring.SpringCore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/nishant/spring/SpringCore/list/Listconfig.xml");
		Hospital bean = (Hospital) ctx.getBean("hospital");
		System.out.println("Hospital " + bean.getName());
		System.out.println("List " + bean.getDepartments());
		System.out.println("List " + bean.getDepartments().getClass());
	}

}
