package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUserSignup {
	static String url="jdbc:mysql://localhost:3306/AGRICULTURE_MANAGEMENT";
	static String user="root";
	static String password="rajesh17042003";
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,user,password);
	}
	public static void signup(String username,String mail,String password,int age) {
		try(Connection connection=getConnection()){
			String query="INSERT INTO USER (USERNAME,EMAIL_ID,PASSWORD,AGE) VALUES (?,?,?,?)";
			PreparedStatement statement=connection.prepareStatement(query);
			statement.setString(1, username);
			statement.setString(2,mail);
			statement.setString(3, password);
			statement.setInt(4, age);
			statement.executeUpdate();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}