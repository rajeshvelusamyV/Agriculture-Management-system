package Model;
import java.sql.*;
public class DbAdmin {
		static String url="jdbc:mysql://localhost:3306/AGRICULTURE_MANAGEMENT";
		static String user="root";
		static String password="rajesh17042003";
		public static Connection getConnection() throws SQLException{
			return DriverManager.getConnection(url,user,password);
		}
		public static boolean adminValidation(String username,String password) {
			try(Connection connection=getConnection()){
				String query="SELECT * FROM ADMIN WHERE ADMIN_NAME= ? AND PASSWORD = ?";
				PreparedStatement statement=connection.prepareStatement(query);
				statement.setString(1, username);
				statement.setString(2,password);
				ResultSet resultSet=statement.executeQuery();
				return resultSet.next();
				
			}
			catch(Exception e) {
				System.out.println(e);
				return false;
			}
		}

}
