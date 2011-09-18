package data;

import java.sql.SQLException;

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

	public model.Student getModel(){
		return model;
	}
	
	@Override
	public void updateModel(AbstractModel model) {
		try {
			DataDispatcher.getInstance().updateStudent(id, (model.Student)model);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString(){
		return "id = " + this.id + ", model = Student[" + this.model.toString() + "]";
	}
}
