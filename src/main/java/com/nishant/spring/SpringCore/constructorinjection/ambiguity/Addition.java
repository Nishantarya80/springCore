package com.nishant.spring.SpringCore.constructorinjection.ambiguity;

public class Addition {
	
	public Addition(double a, double b) {
		System.out.println("inside double");
	}
	
	public Addition(int a, int b) {
		System.out.println("inside int");
	}
	
	public Addition(String a, String b) {
		System.out.println("inside String");
	}
}
