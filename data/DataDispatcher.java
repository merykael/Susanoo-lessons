package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DataDispatcher {
	private static DataDispatcher dataDispatcher;
	private Connection connection;
	
	private DataDispatcher(){
		try{
			String url="jdbc:postgresql://127.0.0.1:5432/students?user=nik&password=123";
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(url);//, "nik", "123");
			//System.out.println(connection);
			ResultSet rs = connection.createStatement().executeQuery("select * from students");
			while(rs.next()){
				System.out.println(rs.getInt("id") + " --- " + rs.getString("first_name"));
			}
			rs.close();
		}
		catch(Exception exception) {
			exception.printStackTrace();
		}
	}
	
	public static DataDispatcher getInstance(){
		if(dataDispatcher == null) dataDispatcher = new DataDispatcher();
		return dataDispatcher;
	}
}