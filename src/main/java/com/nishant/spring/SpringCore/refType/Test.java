package com.nishant.spring.SpringCore.refType;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nishant/spring/SpringCore/refType/config.xml");
		Student bean = (Student) ctx.getBean("Student");
		System.out.println(bean);
	}

}
