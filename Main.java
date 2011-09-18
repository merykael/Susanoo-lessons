import java.sql.SQLException;
import java.util.HashSet;

import data.DataDispatcher;


public class Main {

	public static void main(String []args) throws SQLException{
		HashSet<data.Student> students = DataDispatcher.getInstance().getAllStudents();
		for (data.Student student : students) {
			System.out.println(student.getModel().toString());
			student.getModel().setFirstName("lalala");
		}
		
	}
}
