package com.nishant.spring.SpringCore.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nishant/spring/SpringCore/innerbeans/config.xml");
		Employee bean = (Employee) ctx.getBean("Employee");
		System.out.println(bean);
		
		Employee bean2 = (Employee) ctx.getBean("Employee");
		System.out.println(bean2.hashCode());
		
		Employee bean3 = (Employee) ctx.getBean("Employee");
		System.out.println(bean3.hashCode());
		}

}
