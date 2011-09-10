package model;

public class Teacher {
	private String first_name, second_name, father_name;

	public Teacher(String first_name, String second_name, String father_name) {
		this.first_name = first_name;
		this.second_name = second_name;
		this.father_name = father_name;
	}
	
	public String getFirstName() {
		return first_name;
	}
	
	public String getSecondName() {
		return second_name;
	}
	
	public String getFatherName() {
		return father_name;
	}
	
	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}
	
	public void setSecondName(String second_name) {
		this.second_name = second_name;
	}
	
	public void setFatherName(String father_name) {
		this.father_name = father_name;
	}
}