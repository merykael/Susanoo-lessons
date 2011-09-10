package model;

import java.util.HashSet;

public class Department {
	private String name, abbreviature;
	private HashSet<Group> groups;

	public Department(String name, String abbreviature) {
		this.name = name;
		this.abbreviature = abbreviature;
		this.groups = new HashSet<Group>();
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

	public HashSet<Group> getGroups() {
		return groups;
	}

}
