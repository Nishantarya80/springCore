package com.nishant.spring.SpringCore.lc.interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/nishant/spring/SpringCore/lc/interfaces/config.xml");
		Patient bean = (Patient) ctx.getBean("patient");
		System.out.println(bean);
		ctx.registerShutdownHook();
		}

}
