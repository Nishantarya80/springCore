package com.nishant.spring.SpringCore.list;

import java.util.List;

public class Hospital {

	private String Name;
	private List<String> departments;

	public List<String> getDepartments() {
		return departments;
	}

	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

}
