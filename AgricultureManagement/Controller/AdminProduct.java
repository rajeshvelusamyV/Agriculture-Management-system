package Controller;
import Model.DbAdminProducts;
import java.util.*;
import View.DisplayProducts;
public class AdminProduct {
	public static void display() {
		DbAdminProducts products=new DbAdminProducts();
		List<List<Object>> al=products.productList();
		DisplayProducts display1=new DisplayProducts(al);
		display1.display();
	}
}
