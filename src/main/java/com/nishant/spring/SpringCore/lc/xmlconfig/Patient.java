package com.nishant.spring.SpringCore.lc.xmlconfig;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void hi() {
		System.out.print("inside hi");
	}
	
	public void bye() {
		System.out.print("inside bye");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
}
