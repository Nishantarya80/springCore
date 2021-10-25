package com.nishant.spring.SpringCore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Employee Emp = (Employee) ctx.getBean("emp");
		System.out.println("Emp ID " + Emp.getId());
		System.out.println("Emp Name " + Emp.getName());
	}

}
