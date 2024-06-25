package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DbgetDetails {
	static String url="jdbc:mysql://localhost:3306/AGRICULTURE_MANAGEMENT";
	static String user="root";
	static String password="rajesh17042003";
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,user,password);
	}
	public static List<List<Object>>productList(String name) {
		List<List<Object>> al=new ArrayList<>();
		try(Connection connection=getConnection()){
			String query="SELECT SELLER_NAME,PRODUCT_NAME,LOCATION,CONTACT FROM SELLER WHERE PRODUCT_NAME='"+name+"'";
			PreparedStatement statement=connection.prepareStatement(query);
			ResultSet resultSet=statement.executeQuery();
			ResultSetMetaData metaData = resultSet.getMetaData();
	        int columnCount = metaData.getColumnCount();
	        while (resultSet.next()) {
	        	List<Object> row=new ArrayList<>();
	            for (int i = 1; i <= columnCount; i++) {
	                row.add(resultSet.getObject(i));
	            }
	            al.add(row);
	        }
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return al;
	}
}
