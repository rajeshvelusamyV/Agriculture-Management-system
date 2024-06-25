package Model;
import java.sql.*;
import java.util.*;
public class DbAdminProducts {
	static String url="jdbc:mysql://localhost:3306/AGRICULTURE_MANAGEMENT";
	static String user="root";
	static String password="rajesh17042003";
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,user,password);
	}
	public static List<List<Object>>productList() {
		List<List<Object>> al=new ArrayList<>();
		try(Connection connection=getConnection()){
			String query="SELECT * FROM SELLER";
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
