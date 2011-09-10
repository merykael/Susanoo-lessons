package model;

import java.util.HashMap;
import java.util.HashSet;

public class Group {
	private String title;
	private Teacher curator;
	private HashSet<Student> students;
	private HashMap<String, Teacher> subjects_table;

	public Group(String title, Teacher curator) {
		this.title = title;
		this.curator = curator;
		students = new HashSet<Student>();
		subjects_table = new HashMap<String, Teacher>();
	}
	
	public String getTitle() {
		return title;
	}
	
	public Teacher getTeacher() {
		return curator;
	}
	
	public HashSet<Student> getStudents() {
		return students;
	}
	
	public HashMap<String, Teacher> getSubjectsTable() {
		return subjects_table;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setCurator(Teacher curator) {
		this.curator = curator;
	}
	
}
