package com.nishant.spring.SpringCore.properties;

import java.util.Properties;

public class Languages {

	private Properties countrynlanguages;

	public Properties getCountrynlanguages() {
		return countrynlanguages;
	}

	public void setCountrynlanguages(Properties countrynlanguages) {
		this.countrynlanguages = countrynlanguages;
	}

	@Override
	public String toString() {
		return "Languages [countrynlanguages=" + countrynlanguages + "]";
	}


}
