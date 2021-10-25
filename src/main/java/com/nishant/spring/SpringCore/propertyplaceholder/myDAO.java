package com.nishant.spring.SpringCore.propertyplaceholder;

public class myDAO {
	private String dbserver;
	
	public myDAO(String dbserver) {
		this.dbserver=dbserver;
	}

	@Override
	public String toString() {
		return "myDAO [dbserver=" + dbserver + "]";
	}

}
