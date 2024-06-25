package Model;
import java.sql.*;
import Controller.SellerDetails;
public class DbSellerDetails {
			static String url="jdbc:mysql://localhost:3306/AGRICULTURE_MANAGEMENT";
			static String user="root";
			static String password="rajesh17042003";
			public static Connection getConnection() throws SQLException{
				return DriverManager.getConnection(url,user,password);
			}
			public static void insert(String sellername,String productname,String price,String acres,String location,String number) {
				try(Connection connection=getConnection()){
					String query="INSERT INTO SELLER(SELLER_NAME,PRODUCT_NAME,PRICE,ACRES,LOCATION,CONTACT) VALUES (?,?,?,?,?,?)";
					PreparedStatement statement=connection.prepareStatement(query);
					statement.setString(1, sellername);
					statement.setString(2,productname);
					statement.setString(3, price);
					statement.setString(4, acres);
					statement.setString(5, location);
					statement.setString(6, number);
					statement.executeUpdate();
					
				}
				catch(Exception e) {
					System.out.println(e);
				}
			}
		}
