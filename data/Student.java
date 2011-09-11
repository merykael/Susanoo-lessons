package data;

import model.AbstractModel;
import model.ISubscriber;

public class Student implements ISubscriber {

	private int id;
	private model.Student model;

	public Student(int id, model.Student model){
		this.id = id;
		this.model = model;
		this.model.addSubscriber(this);
	}

	@Override
	public void updateModel(AbstractModel model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString(){
		return "id = " + this.id + ", model = Student[" + this.model.toString() + "]";
	}
}
