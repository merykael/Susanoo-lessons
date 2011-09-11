package model;

import java.util.HashSet;

public class Department extends AbstractModel {
	private String name, abbreviature;
	private HashSet<Group> groups;

	public Department(String name, String abbreviature) {
		super();
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

	public HashSet<Group> getGroups() {
		return groups;
	}

	public void setName(String name) {
		super.notifySubscribers();
		this.name = name;
	}

	public void setAbbreviature(String abbreviature) {
		super.notifySubscribers();
		this.abbreviature = abbreviature;
	}

}
