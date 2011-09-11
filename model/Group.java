package model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class Group extends AbstractModel {
	private String title;
	private Teacher curator;
	private HashSet<Student> students;
	private HashMap<String, Teacher> subjects_table;

	public Group(String title, Teacher curator) {
		super();
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

	public void addStudent(Student student) {
		if (students.add(student)) {
			super.notifySubscribers();
		}
	}

	public void removeStudent(Student student) {
		if (students.remove(student)) {
			super.notifySubscribers();
		}
	}

	public Iterator<Student> getStudentsIterator() {
		return students.iterator();
	}

	public void addSubjectTeacher(String subject, Teacher teacher) {
		if (subjects_table.put(subject, teacher) != null) {
			super.notifySubscribers();
		}
	}

	public void removeSubjectTeacher(String subject) {
		if (subjects_table.remove(subject) != null) {
			super.notifySubscribers();
		}
	}

	public Iterator<Entry<String, Teacher>> getSubjectsTeachersIterator() {
		return subjects_table.entrySet().iterator();
	}

	public void setTitle(String title) {
		super.notifySubscribers();
		this.title = title;
	}

	public void setCurator(Teacher curator) {
		super.notifySubscribers();
		this.curator = curator;
	}

}
