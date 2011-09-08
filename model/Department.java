package model;

public class Department {
	private String name, abbreviature;

	public Department(String name, String abbreviature) {
		this.name = name;
		this.abbreviature = abbreviature;
	}

	public String getName() {
		return name;
	}

	public String getAbbreviature() {
		return abbreviature;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAbbreviature(String abbreviature) {
		this.abbreviature = abbreviature;
	}
}
