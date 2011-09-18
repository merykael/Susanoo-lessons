package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;

public class DataDispatcher {
	private static DataDispatcher dataDispatcher;
	private Connection connection;
	private Statement statement;
	
	private DataDispatcher(){
		try{
			String url="jdbc:postgresql://127.0.0.1:5432/students?user=postgres&password=123";
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(url);
			statement = connection.createStatement();
		}
		catch(Exception exception) {
			exception.printStackTrace();
		}
	}
	
	public HashSet<Student> getAllStudents() throws SQLException {
		HashSet<Student> allStudents = new HashSet<Student>();
		ResultSet rs = statement.executeQuery("select id, first_name, second_name, father_name from Students");
		while(rs.next()) {
			int id = rs.getInt("id");
			model.Student model = new model.Student(rs.getString("first_name"), rs.getString("second_name"), rs.getString("father_name"));
			data.Student data = new data.Student(id, model);
			allStudents.add(data);
		}
		return allStudents;
	}
	
	protected void updateStudent(int id, model.Student model) throws SQLException {
		statement.executeUpdate("update students set first_name = '" + model.getFirstName() + "', second_name = '" + model.getSecondName() + "', father_name = '" + model.getFatherName() + "' where id = " + id);
	}
	
	public static DataDispatcher getInstance(){
		if(dataDispatcher == null) dataDispatcher = new DataDispatcher();
		return dataDispatcher;
	}
}